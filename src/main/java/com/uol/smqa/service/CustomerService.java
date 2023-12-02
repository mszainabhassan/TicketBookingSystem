package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.UsersRepository;

@Service
public class CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private UsersRepository usersRepository;

	public Customer CustomerRegistration(Customer customer) {
		
		Customer customer2= this.customerRepository.save(customer);
		customer2.setUsers(customer.getUsers());
		
		customer.getUsers().setCustomer(customer2);
		usersRepository.save(customer.getUsers());
		return customer2;
	}
}