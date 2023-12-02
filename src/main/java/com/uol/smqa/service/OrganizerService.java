package com.uol.smqa.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.repository.UsersRepository;
@Service
public class OrganizerService {
	
	@Autowired
	private OrganizerRepository organizerRepository;
	@Autowired
	private UsersRepository userRepository;
	
	public Organizer OrganizerRegistration(Organizer organizer) {
		return this.organizerRepository.save(organizer);
		
			
}
}
