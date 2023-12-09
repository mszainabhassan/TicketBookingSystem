package com.uol.smqa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.WishList;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.WishListRepository;

@Service
public class WishListService {

	private final WishListRepository wishListRepository;
	private final CustomerRepository customerRepository;
	private final EventRepository eventRepository;

	@Autowired
	public WishListService(WishListRepository wishListRepository, CustomerRepository customerRepository,
						   EventRepository eventRepository) {
		this.wishListRepository = wishListRepository;
		this.customerRepository = customerRepository;
		this.eventRepository = eventRepository;
	}

	public WishList addEventInWishList(int eventId, int customerId) {
	
		Optional<Customer> customer=this.customerRepository.findById(customerId);
		Event event=this.eventRepository.findById(eventId);
	
		WishList wishList=new WishList();
		wishList.setCustomer(customer.get());
		wishList.setEvent(event);
		return this.wishListRepository.save(wishList);
	
	}

	public List<WishList> getCustomerWishList(Integer customerId) {
		Optional<Customer> customer=this.customerRepository.findById(customerId);
		if(customer.isEmpty())
			return null;
		else {
			return customer.get().getWishlists();
		}
	}

	public ResponseEntity<?> deleteEventFromWishList(Integer wishlistId) {
		try {
			if(wishListRepository.findById(wishlistId).isEmpty())
				return new ResponseEntity<>(new BaseApiResponseDTO("WishList Id Not Found", null, null),
						HttpStatus.NOT_FOUND);
			this.wishListRepository.deleteById(wishlistId);
			return new ResponseEntity<>(new BaseApiResponseDTO("Successfully deleted event from wishlist", null, null),
					HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred while deleting event from wishlist"),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
