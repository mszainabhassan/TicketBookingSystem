package com.uol.smqa.model;

import jakarta.persistence.*;

@Entity
public class WishList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wishlist_id")
	private int wishlist_id;
	
	@Column(name = "customer_id",insertable = false,updatable = false)
	private Integer customerId;
	
	@Column(name = "event_id",insertable = false,updatable = false)
	private Integer eventId;

	public int getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(int wishlist_id) {
		this.wishlist_id = wishlist_id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	
	
	
}
