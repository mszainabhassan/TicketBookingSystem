package com.uol.smqa.controller;

import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.BadRequestException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;


@RestController
@RequestMapping("/organizer")
@Slf4j
public class OrganizerController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public ResponseEntity<?> getAllEvents(@Validated @RequestParam int organizerId) {

        try {
            List<Event> organizerList = this.eventService.getAllEventsByOrganizerId(organizerId);
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message("Successfully retrieved all organizers")
                    .data(organizerList)
                    .build(), HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message("An error occurred while retrieving events for organizer")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @PutMapping("/events/{eventId}")
    public ResponseEntity<?> editEvent(@Validated @PathVariable int eventId, @RequestBody Event event, BindingResult bindingResult) {

        try {
            if (bindingResult.hasErrors())  {
                return new ResponseEntity<>(BaseApiResponseDTO.builder()
                        .message("One or more validation errors occurred")
                        .errors(getErrorMessages(bindingResult))
                        .build(), HttpStatus.BAD_REQUEST);
            }
            eventService.validateEventUpdateRequest(eventId, event);
            this.eventService.updateEvent(event);
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message("Successfully updated event")
                    .build(), HttpStatus.NO_CONTENT);
        } catch (BadRequestException ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.BAD_REQUEST);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.NOT_FOUND);
        } catch (AuthorizationException ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.FORBIDDEN);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message("An error occurred while updating events for organizer")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @DeleteMapping("/events/{eventId}")
    public ResponseEntity<?> deleteEvent(@Validated @PathVariable int eventId, @Validated @RequestParam int organizerId) {

        try {
            this.eventService.deleteEventByOrganizerId(eventId, organizerId);
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message("Successfully deleted event")
                    .build(), HttpStatus.NO_CONTENT);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(BaseApiResponseDTO.builder()
                    .message("An error occurred while deleting events for organizer")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
