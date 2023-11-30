package com.uol.smqa.controller;

import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;

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
}
