package com.uol.smqa.repository;

import com.uol.smqa.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType, Long> {
   
}
