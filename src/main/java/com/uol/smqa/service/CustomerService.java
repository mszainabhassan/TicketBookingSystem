package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.UsersRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerService{

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private CustomerBookEventRepository customerBookEventRepository;
	

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
	public  Map<String, Integer>  getAnalytics(Integer customerId) {
		   // Get the Customer
        Customer customer = this.getCustomerById(customerId);
        List<CustomerBookEvent> bookedEvents = customer.getBookedEvents();
        List<CustomerBookEvent> priorityBookedEvents =customerBookEventRepository.findByIsPriorityAndCustomer(true, customer);
        int numberOfBookedEvents = bookedEvents.size();
        int numberOfPriorityEvents=priorityBookedEvents.size();
        Map<String, Integer> map= new HashMap();
        map.put("TotalnumberOfBookedEvents", numberOfBookedEvents);
        map.put("NumberOfPriorityEvents", numberOfPriorityEvents);
        map.put("NumberOfNon-PriorityEvents",numberOfBookedEvents- numberOfPriorityEvents);
        
        return map;
	}
}