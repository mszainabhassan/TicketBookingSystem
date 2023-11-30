package com.uol.smqa.model;

import org.hibernate.type.TrueFalseConverter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "user_id", referencedColumnName = "customer_id", unique = true)
	 private Customer customer;

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

	

	
	

}
