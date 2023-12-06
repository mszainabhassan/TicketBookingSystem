package com.uol.smqa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.repository.UsersRepository;

@Service
public class OrganizerService implements OrganizerServiceInterface {

	private final OrganizerRepository organizerRepository;
	private final UsersRepository usersRepository;
	private final PasswordEncoder passwordEncoder;

	@Autowired
	public OrganizerService(OrganizerRepository organizerRepository, UsersRepository usersRepository,
							PasswordEncoder passwordEncoder) {
		this.organizerRepository = organizerRepository;
		this.usersRepository = usersRepository;
		this.passwordEncoder = passwordEncoder;
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
}
