package com.uol.smqa.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Event;
import com.uol.smqa.service.EventService;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EventService eventService;

	@PutMapping("/change_event_status")
	public String ChangeEventStatus(@RequestParam(name = "eventId") Integer eventId,
			@RequestParam(name = "status") Boolean status) {

		return this.eventService.ChangeEventStatus(eventId, status);

	}
	@GetMapping("/getAllEvents")
	public List<Event> getAllEvents(){
		return this.eventService.getAllEvents();
	}
	
	@PostMapping("/createEvent")
	public Event createEvent(@RequestBody Event event) {
		return this.eventService.createEvent(event);
	}
	
	@PutMapping("/updateEvent")
	public Event updateEvent(@RequestBody Event event) {
		return this.eventService.updateEvent(event);
	}
}
