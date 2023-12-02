package com.uol.smqa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	private final PasswordEncoder passwordEncoder;



	public Customer CustomerRegistration(Customer customer) {
		customer.getUsers().setPassword(passwordEncoder.encode(customer.getUsers().getPassword()));
		return this.customerRepository.save(customer);
	}
}