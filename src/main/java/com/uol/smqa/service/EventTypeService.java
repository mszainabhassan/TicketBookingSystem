package com.uol.smqa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.EventType;
import com.uol.smqa.repository.EventTypeRepository;
@Service
public class EventTypeService {


    private final EventTypeRepository eventTypeRepository;

    @Autowired
    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }

    public ResponseEntity<?> addEventType(EventType eventType) {
        if (eventTypeRepository.existsByEventTypeName(eventType.getEventTypeName())) {
            return new ResponseEntity<>("Event type already exists",HttpStatus.BAD_REQUEST);
        }
        EventType addedEventType = eventTypeRepository.save(eventType);
        return new ResponseEntity<>(new BaseApiResponseDTO("Successfully added event type", addedEventType, null), HttpStatus.OK);
    }

    public Optional<EventType> getEventTypeById(Long id) {
        return eventTypeRepository.findById(id);
    }
    public List<EventType> getAllEventTypes() {
		return eventTypeRepository.findAll();
	}

    public ResponseEntity<?> updateEventType(Long id, EventType eventType) {
        Optional<EventType> existingEventTypeOptional = eventTypeRepository.findById(id);

        if (existingEventTypeOptional.isPresent()) {
            EventType existingEventType = existingEventTypeOptional.get();
            
            // Check if the new type name already exists
            if (eventTypeRepository.existsByEventTypeName(eventType.getEventTypeName())) {
                return new ResponseEntity<>(new BaseApiResponseDTO("Type name already exists", null, null),
                        HttpStatus.BAD_REQUEST);
            }

            existingEventType.setEventTypeName(eventType.getEventTypeName());
            eventTypeRepository.save(existingEventType);

            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully updated event type", existingEventType, null),
                    HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new BaseApiResponseDTO("Event type with ID " + id + " not found", null, null),
                    HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> deleteEventType(Long id) {
        Optional<EventType> eventTypeOptional = eventTypeRepository.findById(id);

        if (eventTypeOptional.isPresent()) {
            eventTypeRepository.deleteById(id);
            return new ResponseEntity<>("Successfully deleted the event type", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Event type with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }

   public Optional<EventType> getEventTypeByName(String typeName) {
	    return eventTypeRepository.findByEventTypeName(typeName);
	}



}
