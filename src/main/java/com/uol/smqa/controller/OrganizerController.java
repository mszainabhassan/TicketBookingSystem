package com.uol.smqa.controller;
import com.uol.smqa.model.*;
import com.uol.smqa.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.BadRequestException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

    private static final Logger log = LoggerFactory.getLogger(OrganizerController.class);
    private final EventTypeService eventTypeService;
    private final OrganizerService organizerService;
    private final EventService eventService;
    private final EventReviewService eventReviewService;
    private final AdminService adminService;

    @Autowired
    public OrganizerController(EventTypeService eventTypeService, OrganizerService organizerService,
                               EventService eventService,
                               EventReviewService eventReviewService,
                               AdminService adminService) {
        this.eventTypeService = eventTypeService;
        this.organizerService = organizerService;
        this.eventService = eventService;
        this.eventReviewService = eventReviewService;
        this.adminService = adminService;
    }


    @PostMapping("/set_discount")
	public Discount setDiscount(@RequestBody Discount discount) {
		return this.organizerService.setDiscount(discount);

	}

   @PostMapping("/createEvent")
    public ResponseEntity<?> createEvent(@RequestBody Event event) {
        String eventTypeName = event.getEventType().getEventTypeName();
        Optional<EventType> existingEventType = eventTypeService.getEventTypeByName(eventTypeName);

        if (existingEventType.isPresent()) {
            // If the event type exists, set it in the event
            event.setEventType(existingEventType.get());
        } else {
            // If the event type does not exist, create a new one and set it in the event
           return new ResponseEntity("Invalid event type", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(eventService.createEvent(event), HttpStatus.CREATED);

    }



    @GetMapping("/events")
    public ResponseEntity<?> getAllEvents(@Validated @RequestParam(name = "organizerId") int organizerId) {

        try {
            List<Event> organizerList = this.eventService.getAllEventsByOrganizerId(organizerId);

            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully retrieved all organizers",  organizerList, null), HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred while retrieving events for organizer"), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/eventAnalytics/{eventId}")
    public String getEventAnalytics(@PathVariable(name = "eventId") Integer eventId) {
        try {
            // Get the event
            Event event = eventService.getEventById(eventId);

            // Get the number of users booked for the event
            List<CustomerBookEvent> bookedCustomers = event.getBookedCustomers();
            int numberOfBookedUsers = bookedCustomers.size();

            // Return the analytics as a string (you can format it as needed)
            return "Event Analytics for Event ID " + eventId + ": Number of Booked Users - " + numberOfBookedUsers;
        } catch (Exception e) {
            return "Error retrieving event analytics: " + e.getMessage();
        }
    }


    @PutMapping("/events/{eventId}")
    public ResponseEntity<?> editEvent(@Validated @PathVariable(name = "eventId") int eventId, @RequestBody Event event, BindingResult bindingResult) {

        try {
            if (bindingResult.hasErrors())  {
                return new ResponseEntity<>(new BaseApiResponseDTO("One or more validation errors occurred", null, getErrorMessages(bindingResult)) , HttpStatus.BAD_REQUEST);
            }
            eventService.validateEventUpdateRequest(eventId, event);
            this.eventService.updateEvent(event);
            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully updated event"), HttpStatus.NO_CONTENT);
        } catch (BadRequestException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (AuthorizationException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.FORBIDDEN);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred while updating events for organizer"), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @DeleteMapping("/events/{eventId}")
    public ResponseEntity<?> deleteEvent(@Validated @PathVariable(name = "eventId") int eventId, @Validated @RequestParam(name = "organizerId") int organizerId) throws Exception {

        try {
            this.eventService.deleteEventByOrganizerId(eventId, organizerId);

            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully deleted event"), HttpStatus.NO_CONTENT);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

	@PostMapping("/register")
	public Organizer OrganizerRegistration(@RequestBody Organizer organizer) {

		return this.organizerService.OrganizerRegistration(organizer);
	}

    @PostMapping("/requestEventCreation")
    public ResponseEntity<?> requestEventCreation(@RequestBody Event event, @RequestParam int adminId) {
        try {
            // Validate the organizer's request
            if (event == null || event.getEventName() == null || event.getEventType() == null) {
                return new ResponseEntity<>(new BaseApiResponseDTO("Invalid event data"), HttpStatus.BAD_REQUEST);
            }

            // Check if the organizer exists (You may need to implement an organizerService for this)
            if (!organizerService.organizerExists(adminId)) {
                return new ResponseEntity<>(new BaseApiResponseDTO("Admin not found"), HttpStatus.NOT_FOUND);
            }

            // Notify the admin about the event creation request
            adminService.handleEventCreationRequest(event, adminId);

            return new ResponseEntity<>(new BaseApiResponseDTO("Event creation request sent to admin"), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new BaseApiResponseDTO("Failed to send event creation request"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
