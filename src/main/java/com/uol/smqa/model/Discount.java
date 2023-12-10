package com.uol.smqa.model;

import java.io.Serializable;
import java.util.List;

import com.uol.smqa.Enum.DiscountType;
import jakarta.persistence.*;

@Entity
public class Discount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "discount_id", nullable = false)
	private int DiscountId;
	
	@Column(name = "discount_code", nullable = false)
	private String discountCode = "";
	
	@Column(name = "discount_value", nullable = false)
	private Float discountValue = 0f;

	@Enumerated(EnumType.STRING)
	private DiscountType discountType;

	@ManyToOne
	@JoinColumn(name = "organizer_id")
	private Organizer organizer;
	
	@ManyToOne
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

	public Float getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(Float discountValue) {
		this.discountValue = discountValue;
	}


	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}


	public DiscountType getDiscountType() {
		return discountType;
	}

	public void setDiscountType(DiscountType discountType) {
		this.discountType = discountType;
	}

	public Discount() {
	}

	public Discount(String discountCode, Float discountValue, Event event) {
		this.discountCode = discountCode;
		this.discountValue = discountValue;
		this.event = event;
	}

	public Discount(String discountCode, Float discountValue, DiscountType discountType, Organizer organizer, Event event) {
		this.discountCode = discountCode;
		this.discountValue = discountValue;
		this.discountType = discountType;
		this.organizer = organizer;
		this.event = event;
	}
}

