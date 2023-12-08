package com.uol.smqa.controller;

// CustomerController.java
import com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria;
import com.uol.smqa.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uol.smqa.Enum.Gender;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.ResourceNotFoundException;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;

import com.uol.smqa.model.Event;

import com.uol.smqa.model.WishList;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.ReviewRepository;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Review;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.uol.smqa.service.CustomerService;
import com.uol.smqa.model.CardDetails;
import com.uol.smqa.service.CustomerBookEventService;


import java.time.LocalDate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.uol.smqa.service.WishListService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    private final CustomerBookEventService customerBookEventService;
	private final WishListService wishlistService;
	private final EventService eventService;

	@Autowired
	public CustomerController(CustomerService customerService, CustomerBookEventService customerBookEventService,
							  WishListService wishlistService, EventService eventService) {
		this.customerService = customerService;
		this.customerBookEventService = customerBookEventService;
		this.wishlistService = wishlistService;
		this.eventService = eventService;
	}

    @PostMapping("/register")
    public Customer customerRegistration(@RequestBody Customer customer) {
        return this.customerService.CustomerRegistration(customer);
    }

    @GetMapping("/events")
    public List<Object[]> getAllUpcomingEvents() {
		return this.customerBookEventService.getAllEvents();
    }


	@GetMapping("/all-events")
	public List<Event> getAllEvents(CustomerEventsFilterSearchCriteria eventsFilterSearchCriteria) {
		return this.eventService.getAllEventsBySearchCriteria(eventsFilterSearchCriteria);
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
    public String provideEventRating(@PathVariable Long bookingId, @RequestParam Integer rating, @RequestParam String review) {
        try {
            customerBookEventService.provideEventRating(bookingId, rating,review);
            return "Rating and review provided successfully!";
        } catch (Exception e) {
            return "Error providing rating and review: " + e.getMessage();
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

    
    

    
    @PostMapping("/addEventInWishlist")
	public ResponseEntity<?> addEventInWishList(@RequestParam(name = "eventId") Integer eventId,
			@RequestParam(name = "customerId") Integer customerId) {
		try {
			System.out.println("In method");
			WishList wishList = this.wishlistService.addEventInWishList(eventId, customerId);
			return new ResponseEntity<>(new BaseApiResponseDTO("Successfully added event in wishlist", wishList, null),
					HttpStatus.OK);

		} catch (ResourceNotFoundException ex) {
			return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
		} catch (Exception ex) {
			return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred while saving event in wishlist"),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	 @PostMapping("/buymembership")
	    public ResponseEntity<?> buyMembership(@RequestParam int customerId, @RequestBody  CardDetails cardDetails) {
	        try {
	        	//  System.out.println("Received CardDetails: " + cardDetails.toString());
	            Customer updatedCustomer = customerService.buyMembership(customerId, cardDetails);
	            return new ResponseEntity<>(new BaseApiResponseDTO("Successfully Purchased membership", updatedCustomer, null),
	                    HttpStatus.OK);
	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.badRequest().body(e.getMessage());
	        }
	 }
	
	 @PostMapping("/cancelmembership")
	 public ResponseEntity<?> cancelMembership(@RequestParam int customerId) {
	     try {
	         ResponseEntity<?> response = customerService.cancelMembership(customerId);

	         if (response.getStatusCode() == HttpStatus.OK) {
	             return new ResponseEntity<>(new BaseApiResponseDTO("Successfully Canceled membership", response.getBody(), null),
	                     HttpStatus.OK);
	         } else {
	             return ResponseEntity.badRequest().body(response.getBody());
	         }
	     } catch (IllegalArgumentException e) {
	         return ResponseEntity.badRequest().body(e.getMessage());
	     }
	 }
	@GetMapping("/getCustomerWishList")
	public List<WishList> getCustomerWishList(@RequestParam(name = "customerId") Integer customerId) {
		return this.wishlistService.getCustomerWishList(customerId);
	}

	@DeleteMapping("/deleteEventFromWishList")
	public ResponseEntity<?> deleteEventFromWishList(@RequestParam(name = "wishlistId") Integer wishlistId){
		return this.wishlistService.deleteEventFromWishList(wishlistId);
	}
	

	
	@PostMapping("/bookMultipleTickets")
	public String bookMultipleTickets(@RequestBody List<Map<String, Object>> ticketDetailsList) {
	    List<String> errors = new ArrayList<>();

	    for (Map<String, Object> ticketDetails : ticketDetailsList) {
	        if (!(ticketDetails.get("customerId") instanceof Integer)) {
	            errors.add("customerId should be an integer for one of the tickets");
	        }
	        if (!(ticketDetails.get("eventId") instanceof Integer)) {
	            errors.add("eventId should be an integer for one of the tickets");
	        }

	        if (errors.isEmpty()) {
	            int customerId = (Integer) ticketDetails.get("customerId");
	            int eventId = (Integer) ticketDetails.get("eventId");

	            Customer customer = this.customerService.getCustomerById(customerId);
	            customerBookEventService.bookEvent(eventId, customer);
	        }
	    }

	    if (!errors.isEmpty()) {
	        return String.join(", ", errors);
	    }

	    return "Tickets booked successfully!";
	}





	@GetMapping("/getAnalytics")
    public String getAnalytics(@RequestParam Integer customerId) {
        try {
        	 Map<String, Integer> map= this.customerService.getAnalytics(customerId);
            return "Customer Analytics for CustomerId: " + customerId + "\n  "+map;
        } catch (Exception e) {
            return "Error retrieving customer analytics: " + e.getMessage();
        }
    }
	 
	@PostMapping("/transferticket")
    public ResponseEntity<?> transferTicket(@RequestParam Long bookingId, @RequestParam int fromCustomerId, @RequestParam int toCustomerId) {
        try {
            customerBookEventService.transferTicket(bookingId, fromCustomerId, toCustomerId);
            return new ResponseEntity<>(new BaseApiResponseDTO("Booking transferred successfully", null, null), HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred during ticket transfer"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@PostMapping(value = "/bookPriortyTicketForEvent")
	public String PriortyTicketForEvent(@RequestParam Integer eventId,@RequestParam Integer customerId) {
		
		return this.customerBookEventService.PriortyTicketForEvent(eventId, customerId);
       
	}
	@GetMapping("/acknowledgeBooking")
    public ResponseEntity<?> acknowledgeBooking(@RequestParam Long bookingId) {
        try {
            if (bookingId == null || bookingId <= 0) {
                return new ResponseEntity<>(new BaseApiResponseDTO("Invalid booking ID"), HttpStatus.BAD_REQUEST);
            }

            CustomerBookEvent booking = customerBookEventService.getBookingById(bookingId);
            if (booking == null) {
                return new ResponseEntity<>(new BaseApiResponseDTO("Booking not found with ID: " + bookingId), HttpStatus.NOT_FOUND);
            }

            Event event = booking.getEvent();
            String acknowledgmentMessage = "Thanks for booking! Event Details: " + event.toString();

            return new ResponseEntity<>(new BaseApiResponseDTO(acknowledgmentMessage, null, null), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred while acknowledging booking"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

	
//	@Autowired
//    private EventRepository eventRepository;
//
//    @Autowired
//    private ReviewRepository reviewRepository;
//	
//	
//    @GetMapping("/past_reviews")
//    public List<Event> getPastEvents() {
//        LocalDate currentDate = LocalDate.now();
//        return eventRepository.findByeventDateTime(currentDate);
//    }
//
////    @GetMapping("/{eventId}/reviews")
////    public List<Review> getEventReviews(@PathVariable int eventId) {
////        return reviewRepository.findById(eventId);
////    }
////	
//	
//    @PostMapping("/{eventId}/reviews")
//    public ResponseEntity<String> createReview(@PathVariable Integer eventId, @RequestBody Review review) {
//        Optional<Event> eventOptional = eventRepository.findById(eventId);
//
//        if (eventOptional.isPresent()) {
//            Event event = eventOptional.get();
//            review.setEvent(event);
//            reviewRepository.save(review);
//            return ResponseEntity.status(HttpStatus.CREATED).body("Review created successfully");
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
//        }
//    }
//    
//    
//    
//    
//    @PutMapping("/{reviewId}")
//    public ResponseEntity<String> updateReview(
//            @PathVariable Long reviewId,
//            @RequestBody Review updatedReview
//    ) {
//        Optional<Review> existingReviewOptional = reviewRepository.findById(reviewId);
//
//        if (existingReviewOptional.isPresent()) {
//            Review existingReview = existingReviewOptional.get();
//            existingReview.setComment(updatedReview.getComment());
//            existingReview.setRating(updatedReview.getRating());
//            
//            // Assuming you want to update only comment and rating; you can add more fields as needed.
//
//            reviewRepository.save(existingReview);
//            return ResponseEntity.ok("Review updated successfully");
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Review not found");
//        }
//    }
//    
//    
//    
//    
    
    
    ///////////
	
	
	@Autowired
    private EventRepository eventRepository;

    @Autowired
    private ReviewRepository reviewRepository;


    @GetMapping("/past_reviews")
    public List<Event> getPastEvents() {
        LocalDate currentDate = LocalDate.now();
        return eventRepository.findByeventDateTime(currentDate);
    }

    @GetMapping("/{eventId}/reviews")
    public List<Review> getEventReviews(@PathVariable int eventId) {
        Optional<Event> eventOptional = Optional.of(this.eventRepository.findById(eventId));
        return eventOptional.map(event -> reviewRepository.findByEvent(event)).orElse(Collections.emptyList());
    }

    @PostMapping("/{eventId}/reviews")
    public ResponseEntity<String> createReview(@PathVariable Integer eventId, @RequestBody Review review) {
        Optional<Event> eventOptional = eventRepository.findById(eventId);

        if (eventOptional.isPresent()) {
            Event event = eventOptional.get();
            review.setEvent(event);
            reviewRepository.save(review);
            return ResponseEntity.status(HttpStatus.CREATED).body("Review created successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
        }
    }

    @PutMapping("/{reviewId}")
    public ResponseEntity<String> updateReview(
            @PathVariable Long reviewId,
            @RequestBody Review updatedReview
    ) {
        Optional<Review> existingReviewOptional = reviewRepository.findById(reviewId);

        if (existingReviewOptional.isPresent()) {
            Review existingReview = existingReviewOptional.get();
            existingReview.setComment(updatedReview.getComment());
            existingReview.setRating(updatedReview.getRating());
            
            // Assuming you want to update only comment and rating; you can add more fields as needed.

            reviewRepository.save(existingReview);
            return ResponseEntity.ok("Review updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Review not found");
        }
    }
	
	
	
    
    
}

