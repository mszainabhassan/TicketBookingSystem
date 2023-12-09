package com.uol.smqa.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Discount implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "discount_id", nullable = false)
	private int DiscountId;
	
	@Column(name = "discount_code", nullable = false)
	private String discountCode = "";
	
	@Column(name = "discount_value", nullable = false)
	private int discountValue = 0;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="event_id")
	private Event event;

	public int getDiscountId() {
		return DiscountId;
	}

	public void setDiscountId(int discountId) {
		DiscountId = discountId;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}


	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}


	public Discount() {
	}



}

