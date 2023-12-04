package com.uol.smqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Discount;
import com.uol.smqa.service.OrganizerService;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {
	
	@Autowired
	private OrganizerService organizerService;
	
	@PostMapping("/set_discount")
	public Discount setDiscount(@RequestBody Discount discount) {
		return this.organizerService.setDiscount(null, 0);
		
	}
	
	
}
