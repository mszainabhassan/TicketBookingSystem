package com.uol.smqa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

	public ResponseEntity<?> addEventInWishList(int eventId, int customerId) {
	
		Optional<Customer> customer=this.customerRepository.findById(customerId);
		Event event=this.eventRepository.findById(eventId);
		if(!customer.isPresent())
			return new ResponseEntity<>(new BaseApiResponseDTO("Customer Id Not Found", null, null),
					HttpStatus.NOT_FOUND);
		if(event==null)
			return new ResponseEntity<>(new BaseApiResponseDTO("Event Id Not Found", null, null),
					HttpStatus.NOT_FOUND);
		WishList wishList=new WishList(customer.get(),event);
		WishList wishList2=this.wishListRepository.save(wishList);
		return new ResponseEntity<>(new BaseApiResponseDTO("Successfully added event in wishlist", wishList2, null),
				HttpStatus.OK);
	}

	public ResponseEntity<?> getCustomerWishList(Integer customerId) {
	    Optional<Customer> customerOptional = this.customerRepository.findById(customerId);

	    if (customerOptional.isEmpty()) {
	        return ResponseEntity.notFound().build();
	    } else {
	        List<WishList> wishList = customerOptional.get().getWishlists();
	        return ResponseEntity.ok(wishList);
	    }
	}

	public ResponseEntity<?> deleteEventFromWishList(Integer wishlistId) throws Exception{
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
