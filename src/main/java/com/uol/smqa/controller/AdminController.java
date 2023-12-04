package com.uol.smqa.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.uol.smqa.model.Customer;
import com.uol.smqa.service.AdminService;
import com.uol.smqa.service.CustomerService;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.OrganizerService;

import java.util.List;

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
	
	public String ChangeUserStatus(@RequestParam Integer customer_id, @RequestParam Boolean isActive) {
		return this.adminService.ChangeUserStatus(customer_id, isActive);
		
	}
	
	
	@Autowired
	private CustomerService customerService1;
	@PostMapping("/admin_register_customer")

	public Customer AdminCustomerRegistration(@RequestBody Customer customer) {
	return this.customerService1.CustomerRegistration(customer);
	}
	
	
	
	/*
	 * @Autowired private OrganizerService organizerService;
	 * 
	 * @PostMapping("/admin_register_organizer")
	 * 
	 * public Organizer AdminOrganizerRegistration(@RequestBody Organizer organizer)
	 * { return this.organizerService.OrganizerRegistration(organizer); }
	 */
	
	
	
	


	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public Customer CustomerRegistration(@RequestBody Customer customer) {
	return this.customerService.CustomerRegistration(customer);
	}
	

	@GetMapping("/getAllEvents")
	public List<Event> getAllEvents(){
		return this.eventService.getAllEvents();
	}
	
	@PostMapping("/createEvent")
	public Event createEvent(@RequestBody Event event) {
		return this.eventService.createEvent(event);
	}
	
	@PutMapping("/updateEvent")
	public Event updateEvent(@RequestBody Event event) {
		return this.eventService.updateEvent(event);
	}
	
	@DeleteMapping("/deleteEvent")
	public String updateEvent(@RequestParam Integer eventId) {
		return this.eventService.deleteEvent(eventId);
	}

}




