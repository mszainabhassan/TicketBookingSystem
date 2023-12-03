package com.uol.smqa.service;

import com.uol.smqa.model.EventType;
import com.uol.smqa.model.EventType.TypeName;
import com.uol.smqa.repository.EventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventTypeService {

    @Autowired
    private EventTypeRepository eventTypeRepository;

    public void initializeEventTypes() {
        for (TypeName typeName : TypeName.values()) {
            createEventType(typeName);
        }
    }

    public EventType createEventType(TypeName typeName) {
        EventType eventType = new EventType();
        eventType.setTypeName(typeName);
        return eventTypeRepository.save(eventType);
    }
}
