package com.uol.smqa.model;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;

@Entity
public class Admin {
	
	  @Id
	  
	  @GeneratedValue // Adjust the strategy based on your database 
	  private int id;
	 

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Adjust the strategy based on your database
    private Long adminId;


}






