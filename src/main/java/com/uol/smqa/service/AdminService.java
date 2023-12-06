package com.uol.smqa.service;
// AdminService

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;

@Service
public class AdminService {

    @Autowired
    private EventService eventService;  // Assuming you have an EventService

    @Autowired
    private OrganizerService organizerService;

    public void handleEventCreationRequest(Event event, int organizerId) {
        // Your actual implementation to process the event creation request
        // Here, let's assume you want to associate the event with an organizer
        // You should replace this with your actual logic
        
        // Check if the organizer exists
        Optional<Organizer> optionalOrganizer = organizerService.findById(organizerId);
        if (optionalOrganizer.isPresent()) {
            Organizer organizer = optionalOrganizer.get();
            
            // Assign the event to the organizer (assuming you have a method in Organizer to add an event)
             // Assuming you have a method to save/update the organizer
            
            // Optionally, you can perform other actions, such as notifying the organizer, logging, etc.
            // ...
        } else {
            // Handle the case where the organizer does not exist
            // You might want to throw an exception or handle it based on your application requirements
            // For simplicity, let's print a message to the console
            System.out.println("Organizer with ID " + organizerId + " not found.");
        }
    }
}
