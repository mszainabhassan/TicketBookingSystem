package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;

@Service
public class CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer CustomerRegistration(Customer customer) {
		
		return this.customerRepository.save(customer);
	}
	 public Customer getCustomerById(int customerId) {
	        return customerRepository.findById(customerId)
	                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));
	    }
}