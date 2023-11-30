package com.uol.smqa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Organizer;
import com.uol.smqa.service.OrganizerService;
import com.uol.smqa.model.Users;
@RestController
@RequestMapping("/organizer")
public class OrganizerController {
	@Autowired
	private OrganizerService organizerService;
	
	@PostMapping("/register")
	public Organizer OrganizerRegistration(@RequestBody Organizer organizer) {
		
		return this.organizerService.OrganizerRegistration(organizer);
	}
}
