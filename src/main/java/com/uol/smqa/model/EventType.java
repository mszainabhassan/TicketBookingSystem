package com.uol.smqa.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_type_id")
    private Long id;


    @Column(name = "event_type_name", nullable = false, unique = true)
    private String typeName;

    @OneToMany(mappedBy = "eventType")
    private List<Event> eventList = new ArrayList<>();


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTypeName() {
		return typeName;
	}


    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


    public EventType() {
    }

    public EventType(String typeName) {
        this.typeName = typeName;
    }
}
