package com.uol.smqa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.uol.smqa.model.EventType;
import com.uol.smqa.service.EventTypeService;
import com.uol.smqa.service.OrganizerService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.uol.smqa.model.Customer;
import com.uol.smqa.service.AdminService;
import com.uol.smqa.service.CustomerService;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.EventService;


@RestController
@RequestMapping("/admin")
public class AdminController {
    private final EventTypeService eventTypeService;
    private final EventService eventService;
    private final OrganizerService organizerService;
    private final AdminService adminService;
    ;
    private final CustomerService customerService;

    @Autowired
    public AdminController(EventService eventService,
                           EventTypeService eventTypeService,
                           OrganizerService organizerService,
                           AdminService adminService,
                           CustomerService customerService) {
        this.eventService = eventService;
        this.eventTypeService = eventTypeService;
        this.organizerService = organizerService;
        this.adminService = adminService;
        this.customerService = customerService;

    }

    @GetMapping("/geteventtypes")
    public List<EventType> getAllEventTypes() {
        return eventTypeService.getAllEventTypes();
    }

    @PostMapping("/addeventtype")
    public ResponseEntity<?> addEventType(@RequestBody EventType eventType) {
        ResponseEntity<?> addedEventType = eventTypeService.addEventType(eventType);

        return addedEventType;
    }

    @PutMapping("/updateeventtype")
    public ResponseEntity<?> updateEventType(@RequestParam Long id, @RequestBody EventType eventType) {
        ResponseEntity<?> updatedEventType = eventTypeService.updateEventType(id, eventType);
        return updatedEventType;
    }

    @DeleteMapping("/deleteeventtype")
    public ResponseEntity<?> deleteEventType(@RequestParam Long id) {
        ResponseEntity<?> DeletedEventType = eventTypeService.deleteEventType(id);
        return DeletedEventType;
    }

    @PutMapping("/change-event-status")
    public String ChangeEventStatus(@RequestParam(name = "eventId") Integer eventId,
                                    @RequestParam(name = "status") Boolean status) {

        return this.eventService.ChangeEventStatus(eventId, status);

    }

    @PostMapping("/admin-register-customer")
    public Customer AdminCustomerRegistration(@RequestBody Customer customer) {
        return this.customerService.CustomerRegistration(customer);
    }

    @PostMapping("/admin_register_organizer")

    public Organizer AdminOrganizerRegistration(@RequestBody Organizer organizer) {
        return this.organizerService.OrganizerRegistration(organizer);
    }


    @PutMapping("/change_organizer_account_status")

    public String ChangeOrganizerStatus(@RequestParam Integer organizer_id, @RequestParam Boolean isActive) {
        return this.adminService.ChangeOrganizerStatus(organizer_id, isActive);

    }

    @PutMapping("/change_user_status")
    public String ChangeUserStatus(@RequestParam Integer customer_id, @RequestParam Boolean isActive) {
        return this.adminService.ChangeUserStatus(customer_id, isActive);

    }


    @PostMapping("/register")
    public Customer CustomerRegistration(@RequestBody Customer customer) {
        return this.customerService.CustomerRegistration(customer);
    }


    @JsonIgnoreProperties("bookedCustomers")
    @GetMapping("/getAllEvents")
    public List<Event> getAllEvents() {
        return this.eventService.getAllEvents();
    }

    @PostMapping("/createEvent")
    public ResponseEntity<?> createEvent(@RequestBody Event event) throws Exception {
        try {
            String eventTypeName = event.getEventType().getEventTypeName();
            Optional<EventType> existingEventType = eventTypeService.getEventTypeByName(eventTypeName);

            if (existingEventType.isPresent()) {
                // If the event type exists, set it in the event
                event.setEventType(existingEventType.get());
            } else {
                // If the event type does not exist, create a new one and set it in the event
                return new ResponseEntity("Invalid event type", HttpStatus.BAD_REQUEST);
            }
            Optional<Organizer> organizer = this.organizerService.findById(event.getOrganizer().getOrganizerId());
            if (!organizer.isPresent()) {
                throw new ResourceNotFoundException("Organizer not found");
            }
            Event event2 = this.eventService.createEventByAdmin(event);
            return new ResponseEntity<>(new BaseApiResponseDTO("Event created successfully", event2, null), HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred during creating an event"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateEvent")
    public ResponseEntity<?> updateEvent(@RequestBody Event event) throws Exception {
        try {
            String eventTypeName = event.getEventType().getEventTypeName();
            Optional<EventType> existingEventType = eventTypeService.getEventTypeByName(eventTypeName);

            if (existingEventType.isPresent()) {
                 event.setEventType(existingEventType.get());
            } else {
               return new ResponseEntity("Invalid event type", HttpStatus.BAD_REQUEST);
            }
            Event event2 = this.eventService.getEventById(event.getEventId());
            Optional<Organizer> organizer = this.organizerService.findById(event.getOrganizer().getOrganizerId());
            if (!organizer.isPresent()) {
                throw new ResourceNotFoundException("Organizer not found");
            }
            Event updatedEvent = this.eventService.updateEvent(event);
            return new ResponseEntity<>(new BaseApiResponseDTO("Event updated successfully", updatedEvent, null), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred during updating an event"), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/deleteEvent")
    public String deleteEvent(@RequestParam Integer eventId) {
        return this.eventService.deleteEvent(eventId);
    }


    @PostMapping("/initiateEventCreation")
    public String initiateEventCreation(@RequestBody Event event, @RequestParam int organizerId) {
        try {

            if (!organizerService.hasEventCreationRequest(organizerId)) {
                return "No valid event creation request found from the organizer. Status: " + HttpStatus.BAD_REQUEST.value();
            }

            Event createdEvent = eventService.createEvent(event);

            // Notify the organizer upon successful creation
            // For simplicity, you can return the created event ID or send a notification
            return "Event creation initiated successfully. Event ID: " + createdEvent.getEventId();
        } catch (Exception e) {
            return "Failed to initiate event creation. Status: " + HttpStatus.INTERNAL_SERVER_ERROR.value();
        }
    }
}


