package com.uol.smqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Customer;
import com.uol.smqa.service.AdminService;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.EventService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EventService eventService;

	@PutMapping("/change_event_status")
	public String ChangeEventStatus(@RequestParam(name = "eventId") Integer eventId,
			@RequestParam(name = "status") Boolean status) {

		return this.eventService.ChangeEventStatus(eventId, status);
		
	}
	
	@Autowired
	private AdminService adminService;
	
	@PutMapping("/change_user_status")
	public String ChangeUserStatus(@RequestParam(name = "isActive") Integer customer_id,
			@RequestParam(name = "isActive") Boolean isActive) {
		
		return this.adminService.ChangeUserStatus(customer_id, isActive);
		
	}

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public Customer CustomerRegistration(@RequestBody Customer customer) {
	return this.customerService.CustomerRegistration(customer);
	}
	
}




