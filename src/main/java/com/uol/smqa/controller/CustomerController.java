package com.uol.smqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.uol.smqa.model.Customer;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.model.CardDetails;
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public Customer CustomerRegistration(@RequestBody Customer customer) {
	return this.customerService.CustomerRegistration(customer);
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
}
