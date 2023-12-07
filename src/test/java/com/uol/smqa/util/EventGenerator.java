package com.uol.smqa.util;

import com.uol.smqa.Enum.Gender;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.EventTypeRepository;
import com.uol.smqa.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class EventGenerator {

    @Autowired
    private EventTypeRepository eventTypeRepository;
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    public List<Event> generateEvents() {
        List<Event> events = new ArrayList<>();

        // Creating 5 events and adding them to the list
        for (int i = 0; i < 5; i++) {
            Event event = createEvent(i + 1); // Event IDs start from 1
            events.add(event);
        }

        return eventRepository.saveAll(events);
    }

    private EventType getOrCreateEventType() {
        System.out.println("Again");
        final String eventTypeName = "GRADUATE JOB FAIR";
        return eventTypeRepository.findByTypeName(eventTypeName)
                .orElseGet(() -> eventTypeRepository.save(new EventType(eventTypeName)));
    }

    private Event createEvent(int eventId) {
        String eventName = "Event " + eventId;
        String eventDescription = "Description for Event " + eventId;
        String eventLocation = "Location " + eventId;
        LocalDateTime eventDateTime = LocalDateTime.now(); // Replace with actual date and time
        Integer seatsAvailable = 100; // Replace with available seats count
        Integer noOfPrioritySeats = 20; // Replace with priority seats count
        Integer availablePrioritySeatsInteger = 15; // Replace with available priority seats count
        Float prioritySeatFees = 10.0f; // Replace with priority seat fees
        Float eventFees = 20.0f; // Replace with event fees
        EventType eventType = getOrCreateEventType(); // Replace with actual event type
        Boolean isLimitedSeats = true; // Replace with true or false
        String eventFrequency = "WEEKLY"; // Replace with event frequency
        Boolean status = true; // Replace with true or false
        Organizer organizer = generateRandomOrganizer();

        return new Event(eventName, eventDescription, eventLocation, eventDateTime,
                seatsAvailable, noOfPrioritySeats, availablePrioritySeatsInteger, prioritySeatFees,
                eventFees, eventType, isLimitedSeats, eventFrequency, status, organizer);
    }


    public Organizer generateRandomOrganizer() {
        Random random = new Random();

        String name = "Random Organizer"; // Example: generateRandomString(8)
        String orgName = "University of Leicester"; // Example: generateRandomString(10)
        String email = "organizer@uol.com"; // Example: generateRandomEmail(name, orgName)
        LocalDate dob = LocalDate.of(1990, 4, 12); // Example: generateRandomDOB()
        Gender gender = Gender.values()[random.nextInt(Gender.values().length)]; // Example: random gender from Enum
        String contactNumber = "+99 888 777 223"; // Example: generateRandomPhoneNumber()
        String regNo = "88877727611622525"; // Example: generateRandomString(6)

        return organizerRepository.findByEmail(email).orElseGet(() ->
                organizerRepository.save(new Organizer(name, orgName, email, dob, gender, contactNumber, regNo)));
    }
}
