package com.uol.smqa.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.uol.smqa.Enum.EventFrequency;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.BadRequestException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Event;
import com.uol.smqa.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private OrganizerServiceInterface organizerService;

	public String ChangeEventStatus(int eventId, Boolean status) {
		Event event = this.eventRepository.findById(eventId);

		if (event != null) {
			event.setStatus(status);
			this.eventRepository.save(event);
			return "Event Status Changed!";
		} else {
			return "Event Id not present!";
		}
	}

	public List<Event> getAllEvents() {
		return this.eventRepository.findAll();
	}

	public List<Event> getAllEventsByOrganizerId(int organizerId) {
		Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
		return this.eventRepository.findAllByOrganizer(organizer);
	}


	public void deleteEventByOrganizerId(int eventId, int organizerId) {
		Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
		Event event = eventRepository.findById(eventId);
		if (event == null) throw new ResourceNotFoundException("Event with id does not exist");
		if (event.getOrganizer() != organizer) throw new AuthorizationException("You can not delete an event that does not belong to you");
		this.eventRepository.deleteByEventIdAndOrganizer(event.getEventId(), organizer);
	}

	public void validateEventUpdateRequest(int eventId, Event eventToUpdate) {
		List<String> eventFrequencies = Arrays.stream(EventFrequency.values()).map(Enum::name).collect(Collectors.toList());
		if (eventToUpdate.getEventFrequency() != null && !eventFrequencies.contains(eventToUpdate.getEventFrequency())) {
			throw new BadRequestException("Invalid event frequency. Valid values are " + Arrays.stream(EventFrequency.values()).map(Enum::name).collect(Collectors.joining(", ")));
		}
		Organizer organizer = organizerService.findById(eventToUpdate.getOrganizer().getOrganizerId()).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
		Event event = eventRepository.findById(eventId);
		if (event == null) throw new ResourceNotFoundException("Event with id does not exist");
		if (event.getOrganizer() != organizer) throw new AuthorizationException("You can not update an event that does not belong to you");

		if (event.getEventDateTime().isBefore(LocalDateTime.now())) throw new AuthorizationException("You can not update an event that has passed");
	}


	public Event createEvent(Event event) {
		return this.eventRepository.save(event);
	}

	public Event updateEvent(Event event) {
		return this.eventRepository.save(event);
	}

	public String deleteEvent(int eventId) {
		Event event = this.eventRepository.findById(eventId);

		if (event != null) 
		{	this.eventRepository.delete(event);
		return "Event: "+eventId+" deleted Successfully!";}
		else {
			return "Event not found!";
		}
	}

}
