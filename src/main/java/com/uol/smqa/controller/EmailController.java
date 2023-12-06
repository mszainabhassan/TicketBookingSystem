package com.uol.smqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Event;
import com.uol.smqa.service.EventService;

@RestController
@RequestMapping("/organizer/email")
public class EmailController {

    private final EventService eventService;

    @Autowired
    public EmailController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/sendEventNotifications")
    public String sendEventNotifications(@RequestBody Event event) {
        try {
            eventService.sendEventNotifications(event);
            return "Event notifications sent successfully.";
        } catch (Exception e) {
            return "Failed to send event notifications. Error: " + e.getMessage();
        }
    }
}
