package com.uol.smqa.service;

// CustomerBookEventService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Event;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.exceptions.ResourceNotFoundException;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerBookEventService {
	@Autowired
	private CustomerRepository CustomerRepository;
    @Autowired
    private CustomerBookEventRepository customerBookEventRepository;

    @Autowired
    private EventRepository eventRepository;
    
    @Autowired
    private CustomerService customerService;

    public List<CustomerBookEvent> getAllBookedEventsForCustomer(Customer customer) {
        return customerBookEventRepository.findByCustomer(customer);
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
    public void provideEventRating(Long bookingId, Integer rating) {
    	if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating should be between 1 and 5.");
        }

        CustomerBookEvent booking = customerBookEventRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found with ID: " + bookingId));

        booking.setRating(rating);
        customerBookEventRepository.save(booking);
    }

    public void transferTicket(Long bookingId, int fromCustomerId, int toCustomerId) {
        CustomerBookEvent booking = customerBookEventRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found with ID: " + bookingId));

        Customer fromCustomer = CustomerRepository.findById(fromCustomerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with ID: " + fromCustomerId));

        Customer toCustomer = CustomerRepository.findById(toCustomerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with ID: " + toCustomerId));

        // Check if the booking belongs to the fromCustomer
        if (!booking.getCustomer().equals(fromCustomer)) {
            throw new RuntimeException("Booking does not belong to the specified 'from' customer");
        }

        // Update the booking with the new customer
        booking.setCustomer(toCustomer);
        customerBookEventRepository.save(booking);
    }





	public String PriortyTicketForEvent(Integer eventId, Integer customerId) {
		 Event event = eventRepository.findById(eventId)
	                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId));
	    Customer customer= customerService.getCustomerById(customerId);
	    // Check if the customer has already booked the event
        List<CustomerBookEvent> existingBookings = customerBookEventRepository.findByCustomerAndEvent(customer, event);
        if (!existingBookings.isEmpty()) {
            throw new RuntimeException("Customer has already booked the event with ID: " + eventId);
        }
	    if(event.getAvailablePrioritySeatsInteger()>0) {
                event.setAvailablePrioritySeatsInteger(event.getAvailablePrioritySeatsInteger()-1);
                eventRepository.save(event);
                CustomerBookEvent booking = new CustomerBookEvent();
                booking.setCustomer(customer);
                booking.setEvent(event);  
                booking.setIsPriority(true);
                customerBookEventRepository.save(booking);
                return "Priority Ticket for Event booked successfully!";
	    }
	    else {
	    	return "SOLD OUT";
	    }}
	  public CustomerBookEvent getBookingById(Long bookingId) {
	        return customerBookEventRepository.findById(bookingId)
	                .orElse(null);
	    }

}