package com.uol.smqa.service.impl;

import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventReview;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.EventReviewRepository;
import com.uol.smqa.service.EventReviewService;
import com.uol.smqa.service.OrganizerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventReviewServiceImpl implements EventReviewService  {


    private final EventRepository eventRepository;
    private final EventReviewRepository eventReviewRepository;
    private final OrganizerServiceInterface organizerService;


    @Autowired
    public EventReviewServiceImpl(OrganizerServiceInterface organizerService, EventRepository eventRepository,
                                  EventReviewRepository eventReviewRepository) {
        this.organizerService = organizerService;
        this.eventRepository = eventRepository;
        this.eventReviewRepository = eventReviewRepository;

    }

    public List<EventReview> getAllEventsReviewsByOrganizer(int eventId, int organizerId) {
        Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
        Event event = eventRepository.findByEventIdAndOrganizer(eventId, organizer).orElseThrow(() -> new ResourceNotFoundException("Event with id not found"));

        return eventReviewRepository.findByEvent(event);
    }
}
