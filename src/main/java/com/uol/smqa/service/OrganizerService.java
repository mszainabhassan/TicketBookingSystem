package com.uol.smqa.service;

import com.uol.smqa.model.Organizer;

import java.util.Optional;


public interface OrganizerService {
     Optional<Organizer> findById(int organizerId);
}
