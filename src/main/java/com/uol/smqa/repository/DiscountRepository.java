package com.uol.smqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uol.smqa.model.Discount;
import com.uol.smqa.model.Event;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
	Discount findById(int discountId);
	
}