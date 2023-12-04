package com.uol.smqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uol.smqa.model.Discount;
import com.uol.smqa.repository.DiscountRepository;

@Service
public class OrganizerService {

	@Autowired
	private DiscountRepository discountRepository;
	
	public Discount setDiscount(String discountCode, int discountValue) {
		
		Discount discount  = new Discount();
		discount.setDiscountCode(discountCode);
		discount.setDiscountValue(discountValue);
		return this.discountRepository.save(discount);
		
	}
	
}
