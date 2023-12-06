package com.uol.smqa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.repository.UsersRepository;

import jakarta.transaction.Transactional;

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
