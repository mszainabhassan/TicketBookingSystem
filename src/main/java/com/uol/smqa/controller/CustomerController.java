package com.uol.smqa.controller;

// CustomerController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uol.smqa.Enum.Gender;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.CustomerBookEventService;

import java.time.LocalDate;
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
    public ResponseEntity<String> bookEvent(@RequestBody Map<String, Object> requestBody) {
        if (!(requestBody.get("customerId") instanceof Integer)) {
            return ResponseEntity.badRequest().body("customerId should be an integer");
        }
        if (!(requestBody.get("eventId") instanceof Integer)) {
            return ResponseEntity.badRequest().body("eventId should be an integer");
        }
        int customerId = (Integer) requestBody.get("customerId");
        int eventId = (Integer) requestBody.get("eventId");

        Customer customer = this.customerService.getCustomerById(customerId);
        Long bookingId;

        try {
            bookingId = customerBookEventService.bookEvent(eventId, customer);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.ok("Event booked successfully! Booking ID: " + bookingId);
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
    @GetMapping("/viewDetails/{customerId}")
    public Customer viewCustomerDetails(@PathVariable int customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/updateDetails/{customerId}")
    public String updateCustomerDetails(
            @PathVariable int customerId,
            @RequestBody Map<String, Object> updates) {
        try {
            Customer existingCustomer = customerService.getCustomerById(customerId);

            if (existingCustomer == null) {
                return "Customer not found with ID: " + customerId;
            }

            
            if (updates.containsKey("name")) {
                existingCustomer.setName((String) updates.get("name"));
            }

            if (updates.containsKey("gender")) {
                existingCustomer.setGender(Gender.valueOf((String) updates.get("gender")));
            }

            if (updates.containsKey("dob")) {
                
                existingCustomer.setDob(LocalDate.parse((String) updates.get("dob")));
            }

            customerService.updateCustomer(existingCustomer);
            return "Customer details updated successfully!";
        } catch (Exception e) {
            return "Error updating customer details: " + e.getMessage();
        }
    }
    @GetMapping("/emailvalidation")
    public ResponseEntity<String> validateEmail(
            @RequestParam int customerId,
            @RequestParam String email) {
        return customerService.validateEmailFormat(customerId, email);
    }

    
    
    
    
}
