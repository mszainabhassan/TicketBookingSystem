package com.uol.smqa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.CustomerRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private EventTypeService eventTypeService;
    
    @Autowired
    private CustomerBookEventRepository customerBookEventRepository;

    public Event bookEvent(Integer eventId, Integer customerId) {
        Event event = getEventById(eventId);
        Customer customer = customerRepository.findById(customerId).orElseThrow();

        CustomerBookEvent booking = new CustomerBookEvent();
        booking.setCustomer(customer);
        booking.setEvent(event);

        customerBookEventRepository.save(booking);

        // Update the list of booked customers in the event
        List<CustomerBookEvent> bookedCustomers = event.getBookedCustomers();
        bookedCustomers.add(booking);
        event.setBookedCustomers(bookedCustomers);

        return eventRepository.save(event);
    }

    public Event createEvent(Event event) {
        // Save EventType only if it doesn't exist
        EventType eventType = event.getEventType();
        Optional<EventType> existingEventType = eventTypeService.getEventTypeByName(eventType.getTypeName());

        if (existingEventType.isPresent()) {
            // If the event type exists, set it in the event
            event.setEventType(existingEventType.get());
        } else {
            // If the event type does not exist, create a new one and set it in the event
            EventType newEventType = new EventType();
            newEventType.setTypeName(eventType.getTypeName());
            eventTypeService.addEventType(newEventType);
            event.setEventType(newEventType);
        }

        return eventRepository.save(event);
    }


    public int getNumberOfBookedUsers(Integer eventId) {
        Event event = getEventById(eventId);

        // Get the number of booked customers for the event
        List<CustomerBookEvent> bookedCustomers = event.getBookedCustomers();
        return bookedCustomers.size();
    }

    public Event getEventById(Integer eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId));
    }
}
