package com.uol.smqa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "users")
@Entity
@Data
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "username",nullable = false,unique = true)
	private String username;
	
	@NotNull(message = "Password Required!")
	@Column(name = "password",nullable = false)
	@JsonIgnore
	private String password;
	
	 @OneToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;

	    @OneToOne
	    @JoinColumn(name = "organizer_id")
	    private Organizer organizer;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
}
