package com.uol.smqa.controller;

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

    @Autowired
    private EventService eventService;

    @Autowired
    private EventTypeService eventTypeService;
    @Autowired
	private OrganizerService organizerService;
	
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
