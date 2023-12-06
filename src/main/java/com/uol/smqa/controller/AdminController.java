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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uol.smqa.dtos.response.BaseApiResponseDTO;
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
	  @Autowired
	    private OrganizerService organizerService;
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

  @PostMapping("/initiateEventCreation")
  public String initiateEventCreation(@RequestBody Event event, @RequestParam int organizerId) {
      try {
          // Validate the admin's request
          // ...

          // Check if the organizer has made a valid request
          if (!organizerService.hasEventCreationRequest(organizerId)) {
              return "No valid event creation request found from the organizer. Status: " + HttpStatus.BAD_REQUEST.value();
          }

          // Create the event or initiate the process of event creation
          // For simplicity, let's assume there's an eventService to handle this
          Event createdEvent = eventService.createEvent(event);

          // Notify the organizer upon successful creation
          // For simplicity, you can return the created event ID or send a notification
          return "Event creation initiated successfully. Event ID: " + createdEvent.getEventId();
      } catch (Exception e) {
          return "Failed to initiate event creation. Status: " + HttpStatus.INTERNAL_SERVER_ERROR.value();
      }
  }
}





