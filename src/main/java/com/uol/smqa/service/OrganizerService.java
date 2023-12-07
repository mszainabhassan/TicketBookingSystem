package com.uol.smqa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Discount;
import com.uol.smqa.repository.DiscountRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.repository.UsersRepository;
import com.uol.smqa.service.impl.DiscountCodeAlreadyExistsException;

@Service

public class OrganizerService implements OrganizerServiceInterface {

	@Autowired
	private OrganizerRepository organizerRepository;

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private DiscountRepository discountRepository;
	
	
    @Override
	public Organizer OrganizerRegistration(Organizer organizer) {
		organizer.getUsers().setPassword(passwordEncoder.encode(organizer.getUsers().getPassword()));
		Organizer organizerFromDb = this.organizerRepository.save(organizer);
		organizerFromDb.setUsers(organizer.getUsers());

		organizer.getUsers().setOrganizer(organizerFromDb);
		usersRepository.save(organizer.getUsers());

		return organizerFromDb;
	}

    @Override
    public Optional<Organizer> findById(int organizerId) {
        return organizerRepository.findById(organizerId);
    }

	
	
	/*
	 * public Discount setDiscount(Discount discount) {
	 * 
	 * return this.discountRepository.save(discount);
	 * 
	 * }
	 */
    
    
    
    public boolean checkIfDiscountCodeExists(String code) {
        return discountRepository.existsBydiscountCode(code);
    }
    
    
    public Discount setDiscount(Discount discount) {
    try {
        // Check if the discount code already exists
        if (discountRepository.existsBydiscountCode(discount.getDiscountCode())) {
            // Throw a custom exception or use an existing exception type
            throw new DiscountCodeAlreadyExistsException("Discount code already exists: " + discount.getDiscountCode());
        }

        // Save the discount if it doesn't exist
        return this.discountRepository.save(discount);
    } catch (DataIntegrityViolationException e) {
        // Handle database integrity violation exception
        throw new DiscountCodeAlreadyExistsException("Discount code already exists: " + discount.getDiscountCode(), e);
    }
}




}
