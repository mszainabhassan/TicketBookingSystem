 package com.uol.smqa.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uol.smqa.Enum.Gender;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Customer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Users users;

	@Column(name = "customer_name",nullable = false)
	private String name;
	
	@Column(name = "customer_email",nullable = false,unique = true)
	private String email;
	
	@Column(name = "dob",nullable = false)
	private LocalDate dob;
	
	@Column(name = "gender",nullable = false)
	private Gender gender;
	
	@Column(name = "contact_number",nullable = false)
	private String contactNumber;
	
	@Column(name = "is_member",nullable = false)
	private Boolean isMember;
	
	@Column(name = "is_notification_on",nullable = false)
	private Boolean isNotificationOn;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Boolean getIsMember() {
		return isMember;
	}

	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}

	public Boolean getIsNotificationOn() {
		return isNotificationOn;
	}

	public void setIsNotificationOn(Boolean isNotificationOn) {
		this.isNotificationOn = isNotificationOn;
	}
	
	
	
}