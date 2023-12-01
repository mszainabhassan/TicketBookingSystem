package com.uol.smqa.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", nullable = false)
	private int CustomerId;

	@Column(nullable = false)
	private Boolean isActive;

	public Admin() {
		super();
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerID) {
		CustomerId = customerID;
	}
	public Boolean getStatus() {
		return isActive;
	}

	public void isActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	

	
	
}
