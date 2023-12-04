package com.uol.smqa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.OrganizerRepository;

@Service
public class AdminService {
	
	@Autowired
	private CustomerRepository customerRepository;

//private CustomerService customerService ;

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
	
	
	/*
	 * private OrganizerRepository organizerRepository; public String
	 * ChangeOrganizerStatus(int organizer_id, boolean isActive) { // TODO
	 * Auto-generated method stub Optional<Organizer> organizerOptional =
	 * this.organizerRepository.findById(organizer_id);
	 * 
	 * if (organizerOptional.isPresent()) { Organizer organizer =
	 * organizerOptional.get();
	 * 
	 * organizer.getUsers().setActive(isActive);
	 * this.organizerRepository.save(organizer); return
	 * "Organizer Account Status Changed"; } else {
	 * 
	 * return "Organizer ID not Present. Enter Valid Organizer ID"; }
	 * 
	 * }
	 */
	
	
	
	
	
}


