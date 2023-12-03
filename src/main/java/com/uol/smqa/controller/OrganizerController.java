package com.uol.smqa.controller;

import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventTypeService eventTypeService;

    @PostMapping("/createEvent")
    public Event createEvent(@RequestBody Event event) {
        String eventTypeName = event.getEventType().getTypeName();
        Optional<EventType> existingEventType = eventTypeService.getEventTypeByName(eventTypeName);

        if (existingEventType.isPresent()) {
            // If the event type exists, set it in the event
            event.setEventType(existingEventType.get());
        } else {
            // If the event type does not exist, create a new one and set it in the event
            EventType newEventType = new EventType();
            newEventType.setTypeName(eventTypeName);
            eventTypeService.addEventType(newEventType);
            event.setEventType(newEventType);
        }

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
