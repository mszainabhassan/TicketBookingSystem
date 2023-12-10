package com.uol.smqa.service;


// AdminService


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.OrganizerRepository;

import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;


@Service
public class AdminService {


	private final CustomerRepository customerRepository;
	private final OrganizerRepository organizerRepository;
	private final OrganizerService organizerService;
	private final EventService eventService;

	@Autowired
	public AdminService(CustomerRepository customerRepository, OrganizerRepository organizerRepository,
						EventService eventService, OrganizerService organizerService) {
		this.customerRepository = customerRepository;
		this.organizerRepository = organizerRepository;
		this.eventService = eventService;
		this.organizerService = organizerService;
	}

	public Customer AdminCustomerRegistration(Customer customer) {
		return this.customerRepository.save(customer);
	}

	public String ChangeUserStatus(int customer_id, boolean isActive) {
		// TODO Auto-generated method stub
		Optional<Customer> customerOptional = this.customerRepository.findById(customer_id);

		if (customerOptional.isPresent()) {
			Customer customer = customerOptional.get();

			customer.getUsers().setActive(isActive);
			this.customerRepository.save(customer);
			return "Customer Account Status Changed";
		} else {

			return "Customer ID not Present. Enter Valid Customer ID";
		}

	}


	public String ChangeOrganizerStatus(int organizer_id, boolean isActive) {
		// TODO Auto-generated method stub
		Optional<Organizer> organizerOptional = this.organizerRepository.findById(organizer_id);

		if (organizerOptional.isPresent()) {
			Organizer organizer = organizerOptional.get();

			organizer.getUsers().setActive(isActive);
			this.organizerRepository.save(organizer);
			return "Organizer Account Status Changed";
		} else {

			return "Organizer ID not Present. Enter Valid Organizer ID";
		}

	}


    public void handleEventCreationRequest(Event event, int organizerId) {
        // Your actual implementation to process the event creation request
        // Here, let's assume you want to associate the event with an organizer
        // You should replace this with your actual logic
        
        // Check if the organizer exists
        Optional<Organizer> optionalOrganizer = organizerService.findById(organizerId);
        if (optionalOrganizer.isPresent()) {
            Organizer organizer = optionalOrganizer.get();
            
            // Assign the event to the organizer (assuming you have a method in Organizer to add an event)
             // Assuming you have a method to save/update the organizer
            
            // Optionally, you can perform other actions, such as notifying the organizer, logging, etc.
            // ...
        } else {
            // Handle the case where the organizer does not exist
            // You might want to throw an exception or handle it based on your application requirements
            // For simplicity, let's print a message to the console
            System.out.println("Organizer with ID " + organizerId + " not found.");
        }
    }

}
