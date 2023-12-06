package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.UsersRepository;

@Service
public class CustomerService{

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private UsersRepository usersRepository;

	public Customer CustomerRegistration(Customer customer) {
		customer.getUsers().setPassword(passwordEncoder.encode(customer.getUsers().getPassword()));
		Customer customer2= this.customerRepository.save(customer);
		customer2.setUsers(customer.getUsers());

		customer.getUsers().setCustomer(customer2);
		usersRepository.save(customer.getUsers());
		return customer2;
	}
	 public Customer getCustomerById(int customerId) {
	        return customerRepository.findById(customerId)
	                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));
	    }
	public void updateCustomer(Customer existingCustomer) {
		
		customerRepository.save(existingCustomer);
	}
	
	 public ResponseEntity<String> validateEmailFormat(int customerId, String email) {
	        // Retrieve the customer by ID
	        Customer customer = customerRepository.findById(customerId)
	                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));

	        // Check if the provided email matches the customer's email
	        if (!email.equals(customer.getEmail())) {
	            return ResponseEntity.badRequest().body("Provided email does not match the registered email for customer ID: " + customerId);
	        }

	        // Basic email format validation logic
	        // This is a simple example and may not cover all edge cases
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        if (!email.matches(emailRegex)) {
	            return ResponseEntity.badRequest().body("Emmail is not valid");
	        }

	        return ResponseEntity.ok("Email Verified");
	    }



	 
}