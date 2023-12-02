package com.uol.smqa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uol.smqa.model.EventType;
import com.uol.smqa.service.EventTypeService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private EventTypeService eventTypeService;

    @GetMapping("/eventtypes")
    public List<EventType> getAllEventTypes() {
        return eventTypeService.getAllEventTypes();
    }

    @PostMapping("/eventtype")
    public void addEventType(@RequestBody EventType eventType) {
        eventTypeService.addEventType(eventType);
    }

    @PutMapping("/eventtype/{id}")
    public EventType updateEventType(@PathVariable Long id, @RequestBody EventType eventType) {
        return eventTypeService.updateEventType(id, eventType);
    }

    @DeleteMapping("/eventtype/{id}")
    public void deleteEventType(@PathVariable Long id) {
        eventTypeService.deleteEventType(id);
    }
}
