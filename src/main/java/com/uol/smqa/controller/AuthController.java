package com.uol.smqa.controller;

import com.uol.smqa.dtos.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Customer;
import com.uol.smqa.service.CustomerService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/login")
	public Customer loginUser(@Validated @RequestBody LoginDTO loginDTO) {
	return this.customerService.CustomerRegistration(customer);
	}

}
