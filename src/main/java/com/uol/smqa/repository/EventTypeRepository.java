package com.uol.smqa.repository;

import com.uol.smqa.model.EventType;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType, Long> {
    Optional<EventType> findByEventTypeName(String eventTypeName);
    List<EventType> findAll();
    boolean existsByEventTypeName(String eventTypeName);
}
