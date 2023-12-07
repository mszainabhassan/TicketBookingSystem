package com.uol.smqa.service;

// CustomerBookEventService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Event;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.EventRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerBookEventService {

    @Autowired
    private CustomerBookEventRepository customerBookEventRepository;

    @Autowired
    private EventRepository eventRepository;

    public List<Object[]> getAllEvents() {
        return eventRepository.findAllEvents();
    }

    public long bookEvent(Integer eventId, Customer customer) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId));
     // Check if the customer has already booked the event
        List<CustomerBookEvent> existingBookings = customerBookEventRepository.findByCustomerAndEvent(customer, event);
        if (!existingBookings.isEmpty()) {
            throw new RuntimeException("Customer has already booked the event with ID: " + eventId);
        }

        
        CustomerBookEvent booking = new CustomerBookEvent();
        booking.setCustomer(customer);
        booking.setEvent(event);
        CustomerBookEvent savedBooking = customerBookEventRepository.save(booking);

        // Return the booking ID
        return savedBooking.getBookingId();
    }
    public void cancelEventBooking(Long bookingId) {
        CustomerBookEvent booking = customerBookEventRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found with ID: " + bookingId));
        Event event = booking.getEvent();
        LocalDateTime currentDatetime = LocalDateTime.now();

        if (event.getEventDateTime().isBefore(currentDatetime)) {
            throw new RuntimeException("Cannot cancel booking for an event that has already occurred.");
        }
        customerBookEventRepository.delete(booking);
        
    }
    public void provideEventRating(Long bookingId, Integer rating, String review) {
    	if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating should be between 1 and 5.");
        }

        CustomerBookEvent booking = customerBookEventRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found with ID: " + bookingId));

        booking.setRating(rating);
        booking.setReview(review);
        customerBookEventRepository.save(booking);
    }
}