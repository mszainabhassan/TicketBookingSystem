package com.uol.smqa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.WishList;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.WishListRepository;

@Service
public class WishListService {
	
	@Autowired
	private WishListRepository wishListRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private EventRepository eventRepository;

	public String addEventInWishList(int eventId, int customerId) {
	
		Optional<Customer> customer=this.customerRepository.findById(customerId);
		
		if(customer.isEmpty())
			return "customer";
		
		Event event=this.eventRepository.findById(eventId);
		if(event==null)
			return "event";
	
		WishList wishList=new WishList();
		wishList.setCustomerId(customerId);
		wishList.setEventId(eventId);
		 WishList wishList2=this.wishListRepository.save(wishList);
	return "wishList";
	}

}
