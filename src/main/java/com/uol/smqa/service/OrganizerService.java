package com.uol.smqa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Discount;
import com.uol.smqa.repository.DiscountRepository;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.repository.UsersRepository;
import com.uol.smqa.exceptions.DiscountCodeAlreadyExistsException;

import jakarta.transaction.Transactional;

@Service

public class OrganizerService implements OrganizerServiceInterface {

    private final OrganizerRepository organizerRepository;
    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;
    private final DiscountRepository discountRepository;

    @Autowired
    public OrganizerService(OrganizerRepository organizerRepository, UsersRepository usersRepository,
                            PasswordEncoder passwordEncoder, DiscountRepository discountRepository) {
        this.organizerRepository = organizerRepository;
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
        this.discountRepository = discountRepository;
    }

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


    @Transactional
    public boolean organizerExists(int organizerId) {
        return organizerRepository.existsById(organizerId);
    }

    // Add the missing method hasEventCreationRequest
    public boolean hasEventCreationRequest(int organizerId) {
        // Your implementation logic to check if there's a valid event creation request
        // For simplicity, let's assume you have a repository or service method to handle this
        return true; // Replace this with your actual logic
    }

}
