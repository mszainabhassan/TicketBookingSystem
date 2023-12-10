package com.uol.smqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uol.smqa.model.Discount;
import com.uol.smqa.model.Event;

import java.util.Optional;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
	Discount findById(int discountId);
	boolean existsBydiscountCode(String discountCode);

	Optional<Discount> findByEvent_EventIdAndDiscountCodeAndIsActive(int eventId, String dicountCode, boolean isActive);
	
}