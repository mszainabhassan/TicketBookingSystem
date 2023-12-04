package com.uol.smqa.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

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
	
	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "discount_id", referencedColumnName = "event_id", unique = true)
	 private List<Event> events;

	
	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "discount_id", referencedColumnName = "organizer_id", unique = true)
	 private List<Discount> discounts;
	
	

	    @OneToMany(mappedBy = "discount_id", cascade = CascadeType.ALL)
	    private List<Discount> discounts1;
	
	
	
	
	
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

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	


}

