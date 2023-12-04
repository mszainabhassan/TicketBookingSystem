package com.uol.smqa.service;

import com.uol.smqa.model.Organizer;

import java.util.Optional;


public interface OrganizerServiceInterface {
     Optional<Organizer> findById(int organizerId);

     Organizer OrganizerRegistration(Organizer organizer);

}
