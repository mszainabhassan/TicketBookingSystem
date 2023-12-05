package com.uol.smqa.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uol.smqa.model.EventType;
import com.uol.smqa.service.EventTypeService;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uol.smqa.model.Event;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.uol.smqa.model.EventType;

@RestController
@RequestMapping("/admin")
public class AdminController {
   @Autowired
   private EventTypeService eventTypeService;
	  @Autowired
	  private EventService eventService;

    @GetMapping("/eventtypes")
    public List<EventType> getAllEventTypes() {
        return eventTypeService.getAllEventTypes();
    }

    @PostMapping("/eventtype")
    public EventType addEventType(@RequestBody EventType eventType) {
       return eventTypeService.addEventType(eventType);
    }

    @PutMapping("/eventtype/{id}")
    public EventType updateEventType(@PathVariable Long id, @RequestBody EventType eventType) {
        return eventTypeService.updateEventType(id, eventType);
    }



	@PutMapping("/change_event_status")
	public String ChangeEventStatus(@RequestParam(name = "eventId") Integer eventId,
			@RequestParam(name = "status") Boolean status) {

		return this.eventService.ChangeEventStatus(eventId, status);

	}
	@JsonIgnoreProperties("bookedCustomers")
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
	
	@DeleteMapping("/deleteEvent")
	public String updateEvent(@RequestParam Integer eventId) {
		return this.eventService.deleteEvent(eventId);
	}
  
  @DeleteMapping("/eventtype/{id}")
    public void deleteEventType(@PathVariable Long id) {
        eventTypeService.deleteEventType(id);
    }


}



