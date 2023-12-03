package com.uol.smqa.controller;
import com.uol.smqa.service.OrganizerServiceInterface;
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
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;
import com.uol.smqa.service.OrganizerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.OrganizerService;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

    private static final Logger log = LoggerFactory.getLogger(OrganizerController.class);
     @Autowired
    private EventTypeService eventTypeService;
    @Autowired
	  private OrganizerService organizerService;
    @Autowired
    private EventService eventService;

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


	@PostMapping("/register")
	public Organizer OrganizerRegistration(@RequestBody Organizer organizer) {

		return this.organizerService.OrganizerRegistration(organizer);
	}

  
	

    @PostMapping("/createEvent")
    public Event createEvent(@RequestBody Event event) {
        // Save EventType first
   //EventType.TypeName typeName = event.getEventType().getTypeName();
   //     EventType savedEventType = eventTypeService.createEventType(typeName);

        // Set EventType in Event and Save Event
    //    event.setEventType(savedEventType);
        return eventService.createEvent(event);
    }
}
