package com.uol.smqa.repository;

import com.uol.smqa.model.Discount;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer>{
    Optional<Discount> findByEvent_EventIdAndDiscountCodeAndIsActive(int eventId, String dicountCode, boolean isActive);
}
