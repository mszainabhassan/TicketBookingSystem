package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.dto.CustomerRegistrationPayload;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;

@Service
public class CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer CustomerRegistration(CustomerRegistrationPayload customerRegistrationPayload) {
		Customer customer=new Customer(customerRegistrationPayload.getName(),
				customerRegistrationPayload.getEmail(),
				customerRegistrationPayload.getDob(),
				customerRegistrationPayload.getGender(),
				customerRegistrationPayload.getContactNumber(),
				customerRegistrationPayload.getIsMember(),
				customerRegistrationPayload.getIsNotificationOn());
		return customerRepository.save(customer);
	}
}