package com.uol.smqa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;

public class AdminService {
	
	//sp

@Autowired
//private CustomerService customerService ;

public Customer CustomerRegistration(Customer customer) {
	
	return this.customerRepository.save(customer);

}

	private CustomerRepository customerRepository;

	public String ChangeUserStatus(int customer_id, Boolean isActive) {
		// TODO Auto-generated method stub
		Optional<Admin> admin = this.customerRepository.findById(customer_id);
		
		if (customer != null) {
			customer.setStatus(isActive);
			this.customerRepository.save(customer);
			return "Customer Account Status Changed";
		} else {
		
		return "customer_id is not Present";
		}
		
	}
	
}


