package com.uol.smqa.repository;

import com.uol.smqa.model.EventType;

import java.util.*;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType, Long> {

    // Custom query method to find EventType by typeName
	 Optional<EventType> findByTypeName(String typeName);
	 List<EventType> findAll();
}
