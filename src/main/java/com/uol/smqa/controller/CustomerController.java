package com.uol.smqa.controller;

// CustomerController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.CustomerBookEventService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerBookEventService customerBookEventService;

    @PostMapping("/register")
    public Customer customerRegistration(@RequestBody Customer customer) {
        return this.customerService.CustomerRegistration(customer);
    }

    @GetMapping("/events")
    public List<CustomerBookEvent> getAllBookedEvents(@RequestParam int customerId) {
        Customer customer = this.customerService.getCustomerById(customerId);
        return this.customerBookEventService.getAllBookedEventsForCustomer(customer);
    }
     
    @PostMapping("/bookEvent")
    public String bookEvent(@RequestBody Map<String, Object> requestBody) {
    	if (!(requestBody.get("customerId") instanceof Integer)) {
    		return "customerId should be an integer";
    	}
    	if (!(requestBody.get("eventId") instanceof Integer)) {
    		return "eventId should be an integer";
    	}
    	int customerId = (Integer) requestBody.get("customerId");
    	int eventId = (Integer) requestBody.get("eventId");


        Customer customer = this.customerService.getCustomerById(customerId);
        customerBookEventService.bookEvent(eventId, customer);

        return "Event booked successfully!";
    }
    @DeleteMapping("/cancelBooking/{bookingId}")
    public String cancelBooking(@PathVariable Long bookingId) {
        try {
            customerBookEventService.cancelEventBooking(bookingId);
            return "Booking canceled successfully!";
        } catch (Exception e) {
            return "Error canceling booking: " + e.getMessage();
        }
    }
    @PostMapping("/provideRating/{bookingId}")
    public String provideEventRating(@PathVariable Long bookingId, @RequestParam Integer rating) {
        try {
            customerBookEventService.provideEventRating(bookingId, rating);
            return "Rating provided successfully!";
        } catch (Exception e) {
            return "Error providing rating: " + e.getMessage();
        }
    }
    
}
