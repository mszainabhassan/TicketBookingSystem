package com.uol.smqa.controller;
import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.uol.smqa.model.EventType;
import com.uol.smqa.service.AdminService;


public class AdminController {
	@Autowired
	private AdminService adminService;
	@GetMapping("/eventtypes")
    public List<EventType> getAllEventTypes() { 
        return adminService.getAllEventTypes();
    }

    @PostMapping("/eventtype")
    public void addEventType(@RequestBody EventType type) {
    	adminService.addEventType(type);
    }

    @PutMapping("/eventtype/{id}")
    public EventType updateEventType(@PathVariable Long id, 
            @RequestBody EventType type) {
       
        return adminService.updateEventType(id, type);
    }

    @DeleteMapping("/eventtype/{id}") 
    public void deleteEventType(@PathVariable Long id) {
        adminService.deleteEventType(id);
    }
}
