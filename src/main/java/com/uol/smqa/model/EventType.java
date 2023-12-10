package com.uol.smqa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_type_id")
    private Long id;


    @Column(name = "event_type_name", nullable = false, unique = true)
    @NotNull(message = "Event type name is required")
    private String eventTypeName;

    @OneToMany(mappedBy = "eventType")
    private List<Event> eventList = new ArrayList<>();


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

	public String getEventTypeName() {
		return eventTypeName;
	}

	public void setEventTypeName(String eventTypeName) {
		this.eventTypeName = eventTypeName;
	}



    public EventType() {
    }

    public EventType(String typeName) {
        this.eventTypeName = typeName;
    }
}
