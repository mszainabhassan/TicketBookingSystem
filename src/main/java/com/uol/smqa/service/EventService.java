package com.uol.smqa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Event;
import com.uol.smqa.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

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

}
