package com.uol.smqa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_type_id")
    private Long id;


    @Column(name = "event_type_name", nullable = false, unique = true)
    private String typeName;



    public Long getId() {
        return id;
    }

    public String getTypeName() {
		return typeName;
	}


    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
