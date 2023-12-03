package com.uol.smqa.repository;

import com.uol.smqa.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Long> {

    EventType findByTypeName(String typeName);
}
