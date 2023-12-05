package com.uol.smqa.controller;

// CustomerController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.uol.smqa.model.WishList;
import com.uol.smqa.model.Event;
import java.util.List;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.model.CardDetails;
import com.uol.smqa.service.CustomerBookEventService;
import java.util.List;
import java.util.Map;
import com.uol.smqa.service.WishListService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerBookEventService customerBookEventService;

	@Autowired
	private WishListService wishlistService;

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
	            return ResponseEntity.ok(updatedCustomer);
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
	
	@GetMapping("/getAnalytics")
    public String getAnalytics(@RequestParam Integer customerId) {
        try {
         Integer numberOfBookedEventsInteger= this.customerService.getAnalytics(customerId);
            return "Customer Analytics for CustomerId: " + customerId + "\n Number of Booked Events:  "+numberOfBookedEventsInteger;
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

}

