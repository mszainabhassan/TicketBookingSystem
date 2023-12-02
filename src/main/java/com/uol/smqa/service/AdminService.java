package com.uol.smqa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uol.smqa.model.EventType;
import com.uol.smqa.repository.EventTypeRepository;

@Service
public class AdminService {

	@Autowired 
    private EventTypeRepository eventTypeRepository;

	public List<EventType> getAllEventTypes() {
        return eventTypeRepository.findAll();
    }

    public void addEventType(EventType type) {
        eventTypeRepository.save(type);
    }

    public void deleteEventType(Long typeId) {
        eventTypeRepository.deleteById(typeId);
    }

    public EventType updateEventType(Long typeId, EventType updatedType) {
		Optional<EventType> existingType = eventTypeRepository.findById(typeId);
		if (existingType.isPresent()) {
			EventType type = existingType.get();
			type.setTypeName(updatedType.getTypeName());
			return eventTypeRepository.save(type);
		} else {
			return null;
		}
        }

}
