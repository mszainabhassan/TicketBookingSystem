package com.uol.smqa.controller;

import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;

import java.util.List;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventTypeService eventTypeService;

    @PostMapping("/createEvent")
    public Event createEvent(@RequestBody Event event) {
        // Save EventType first
        EventType.TypeName typeName = event.getEventType().getTypeName();
        EventType savedEventType = eventTypeService.createEventType(typeName);

        // Set EventType in Event and Save Event
        event.setEventType(savedEventType);
        return eventService.createEvent(event);
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
}
