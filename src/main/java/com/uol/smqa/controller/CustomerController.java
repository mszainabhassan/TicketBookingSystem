package com.uol.smqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.dto.CustomerRegistrationPayload;
import com.uol.smqa.model.Customer;
import com.uol.smqa.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public Customer CustomerRegistration(@RequestBody CustomerRegistrationPayload customerRegistrationPayload) {
		
	return customerService.CustomerRegistration(customerRegistrationPayload);
	}

}
