package com.uol.smqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.WishList;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.WishListService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private WishListService wishlistService;
	
	@GetMapping("/")
	public String test(){
	return "Hello";}
	
	@PostMapping("/register")
	public Customer CustomerRegistration(@RequestBody Customer customer) {
	return this.customerService.CustomerRegistration(customer);
	}
	
	
	@PostMapping("/addEventInWishlist")
	public String addEventInWishList(@RequestParam(name = "eventId") Integer eventId,@RequestParam(name = "customerId") Integer customerId) {
	//try{
		System.out.println("In method");
		return	this.wishlistService.addEventInWishList(eventId,customerId);
	//}

//    return new ResponseEntity<>(new BaseApiResponseDTO("Successfully retrieved all organizers",  wishlist, null), HttpStatus.OK);
//
//	} catch (ResourceNotFoundException ex) {
//         return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
//     } catch (Exception ex) {
//         return new ResponseEntity<>(new BaseApiResponseDTO("An error occurred while saving event in wishlist"), HttpStatus.INTERNAL_SERVER_ERROR);
//     }

	}
	
	
//}

}
