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
import com.uol.smqa.service.OrganizerService;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

    private static final Logger log = LoggerFactory.getLogger(OrganizerController.class);
    private final EventTypeService eventTypeService;
    private final OrganizerService organizerService;
    private final EventService eventService;
    private final EventReviewService eventReviewService;


    @Autowired
    public OrganizerController(EventTypeService eventTypeService, OrganizerService organizerService,
                               EventService eventService,
                               EventReviewService eventReviewService) {
        this.eventTypeService = eventTypeService;
        this.organizerService = organizerService;
        this.eventService = eventService;
        this.eventReviewService = eventReviewService;
    }


   @PostMapping("/createEvent")
    public ResponseEntity<?> createEvent(@RequestBody Event event) {
        String eventTypeName = event.getEventType().getTypeName();
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
    public ResponseEntity<?> getAllEvents(@Validated @RequestParam int organizerId) {

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
    public String getEventAnalytics(@PathVariable Integer eventId) {
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
    public ResponseEntity<?> editEvent(@Validated @PathVariable int eventId, @RequestBody Event event, BindingResult bindingResult) {

        try {
            if (bindingResult.hasErrors())  {
                return new ResponseEntity<>(new BaseApiResponseDTO("One or more validation errors occurred", null, getErrorMessages(bindingResult))
                        , HttpStatus.BAD_REQUEST);
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
    public ResponseEntity<?> deleteEvent(@Validated @PathVariable int eventId, @Validated @RequestParam int organizerId) {

        try {
            this.eventService.deleteEventByOrganizerId(eventId, organizerId);

            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully deleted event"), HttpStatus.NO_CONTENT);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @GetMapping("/events/{eventId}/reviews")
    public ResponseEntity<?> getEventReviews(@Validated @PathVariable int eventId, @Validated @RequestParam int organizerId) {

        try {
            List<EventReview> reviewsByOrganizer = this.eventReviewService.getAllEventsReviewsByOrganizer(eventId, organizerId);
            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully retrieved reviews", reviewsByOrganizer, null), HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



    @PostMapping("/event-reviews/{reviewId}/reply")
    public ResponseEntity<?> replyEventReviews(@Validated @PathVariable int reviewId, @Validated @RequestBody ReviewReply reviewReply) {

        try {
            ReviewReply savedReply = this.eventReviewService.replyEventReviewsByOrganizer(reviewId, reviewReply);
            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully replied to review", savedReply, null), HttpStatus.OK);
        } catch (BadRequestException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @PutMapping("/event-reviews/{reviewId}/reply")
    public ResponseEntity<?> editEventReviewReply(@PathVariable int reviewId, @Validated @RequestBody ReviewReply reviewReply) {

        try {
            ReviewReply savedReply = this.eventReviewService.editReplyEventReviewsByOrganizer(reviewId, reviewReply);
            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully updated review reply", savedReply, null), HttpStatus.OK);
        } catch (BadRequestException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @DeleteMapping("/event-reviews/reply/{replyId}")
    public ResponseEntity<?> deleteEventReviewReply(@PathVariable int replyId, @Validated @RequestParam int organizerId) {

        try {
            this.eventReviewService.deleteReplyEventReviewsByOrganizer(replyId, organizerId);
            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully deleted review reply"), HttpStatus.NO_CONTENT);
        } catch (BadRequestException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.BAD_REQUEST);
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

  
	
}
