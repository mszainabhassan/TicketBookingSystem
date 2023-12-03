package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.UsersRepository;

@Service
public class CustomerService{

	private final PasswordEncoder passwordEncoder;
	private final CustomerRepository customerRepository;
	private final UsersRepository usersRepository;

	@Autowired
	public CustomerService(PasswordEncoder passwordEncoder, CustomerRepository customerRepository,
						   UsersRepository usersRepository) {
		this.passwordEncoder = passwordEncoder;
		this.customerRepository = customerRepository;
		this.usersRepository = usersRepository;
	}

	public Customer CustomerRegistration(Customer customer) {
		customer.getUsers().setPassword(passwordEncoder.encode(customer.getUsers().getPassword()));
		Customer customer2= this.customerRepository.save(customer);
		customer2.setUsers(customer.getUsers());

		customer.getUsers().setCustomer(customer2);
		usersRepository.save(customer.getUsers());
		return customer2;
	}
}