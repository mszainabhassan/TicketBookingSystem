package com.uol.smqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uol.smqa.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
	Event findById(int eventId);
	
}
