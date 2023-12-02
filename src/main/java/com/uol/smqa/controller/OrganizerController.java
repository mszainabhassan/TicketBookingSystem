package com.uol.smqa.controller;

import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/organizer")
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
