package com.uol.smqa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Event;
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
    private CustomerRepository customerRepository; // Fix the typo here
    
    @Autowired
    private CustomerBookEventRepository customerBookEventRepository;

    public Event bookEvent(Integer eventId, Integer customerId) {
        Event event = eventRepository.findById(eventId).orElseThrow();
        Customer customer = customerRepository.findById(customerId).orElseThrow(); // Fix the typo here

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
        return eventRepository.save(event);
    }
}
