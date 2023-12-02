package com.uol.smqa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.EventType;
import com.uol.smqa.repository.EventTypeRepository;

@Service
public class EventTypeService {
    @Autowired
    private EventTypeRepository eventTypeRepository;

    public void addEventType(EventType eventType) {
        eventTypeRepository.save(eventType);
    }

    public Optional<EventType> getEventTypeById(Long id) {
        return eventTypeRepository.findById(id);
    }
    public List<EventType> getAllEventTypes() {
		return eventTypeRepository.findAll();
	}

    public EventType updateEventType(Long id, EventType eventType) {
        // Check if the event type with the given id exists
        Optional<EventType> existingEventTypeOptional = eventTypeRepository.findById(id);
        
        if (existingEventTypeOptional.isPresent()) {
            EventType existingEventType = existingEventTypeOptional.get();
            
            // Update properties of existing event type
            existingEventType.setTypeName(eventType.getTypeName());
            
            // Save the updated event type
            return eventTypeRepository.save(existingEventType);
        } else {
            // Handle case where the event type with the given id does not exist
            // You can throw an exception or handle it based on your requirements
            return null;
        }
    }

    public void deleteEventType(Long id) {
        eventTypeRepository.deleteById(id);
    }
}
