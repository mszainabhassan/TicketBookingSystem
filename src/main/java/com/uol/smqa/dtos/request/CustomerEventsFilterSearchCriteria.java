package com.uol.smqa.dtos.request;

import com.uol.smqa.model.EventType;

import java.sql.Timestamp;

public class CustomerEventsFilterSearchCriteria {

    private String location;
    private String eventType;
    private String name;
    private Long eventDate;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEventDate() {
        return eventDate;
    }

    public void setEventDate(Long eventDate) {
        this.eventDate = eventDate;
    }


    public CustomerEventsFilterSearchCriteria() {
    }
}
