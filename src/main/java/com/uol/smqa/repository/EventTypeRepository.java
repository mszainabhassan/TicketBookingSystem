package com.uol.smqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uol.smqa.model.EventType;

public interface EventTypeRepository extends JpaRepository<EventType, Long> {

}