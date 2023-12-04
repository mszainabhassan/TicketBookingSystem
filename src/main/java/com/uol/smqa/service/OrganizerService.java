package com.uol.smqa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Discount;
import com.uol.smqa.repository.DiscountRepository;

@Service
public class OrganizerService {

	@Autowired
	private DiscountRepository discountRepository;
	
	public Discount setDiscount(String discountCode, int discountValue) {
		
		Discount discount  = new Discount();
		discount.setDiscountCode(discountCode);
		discount.setDiscountValue(discountValue);
		return this.discountRepository.save(discount);
		
	}
	

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.repository.UsersRepository;

@Service
public class OrganizerService implements OrganizerServiceInterface {

	@Autowired
	private OrganizerRepository organizerRepository;

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

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

}
