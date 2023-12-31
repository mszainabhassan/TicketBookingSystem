
package com.uol.smqa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Table(name = "users")

@Entity

public class Users {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "user_id")

	private int userId;

	@Column(name = "username", nullable = false, unique = true)

	private String username;

	@NotNull(message = "Password Required!")




	@Column(name = "password", nullable = false)


	private String password;

	@Column(name = "is_active", nullable = true)

	private boolean isActive = true;

	@OneToOne(cascade = CascadeType.ALL)

	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")

	private Customer customer;

	@OneToOne(cascade = CascadeType.ALL)

	@JoinColumn(name = "organizer_id", referencedColumnName = "organizer_id")

	private Organizer organizer;


	@OneToMany
	private List<EventReview> reviews = new ArrayList<>();

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

	@JsonIgnore
	public Customer getCustomer() {

		return customer;

	}


	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
 
	

	@JsonIgnore

	public Organizer getOrganizer() {

		return organizer;

	}

	public void setOrganizer(Organizer organizer) {

		this.organizer = organizer;

	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Users() {
	}

	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}
}