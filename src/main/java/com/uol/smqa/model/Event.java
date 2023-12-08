package com.uol.smqa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int eventId;

    @OneToMany(mappedBy = "event")
    private List<WishList> wishlists;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "event_description", nullable = false)
    private String eventDescription;

    @Column(name = "event_location", nullable = false)
    private String eventLocation;

    @Column(name = "event_date_time", nullable = false)
    private LocalDateTime eventDateTime;

    @Column(name = "seats_available")
    private Integer seatsAvailable;


    @Column(name = "no_of_priority_seats")
    private Integer noOfPrioritySeats;

    @Column(name = "available_priority_seats")
    private Integer availablePrioritySeatsInteger;

    @Column(name = "prority_seat_fees")
    private Float prioritySeatFees;

    @Column(name = "event_fees")
    private Float eventFees;

    @ManyToOne
    @JoinColumn(name = "event_type_name", nullable = false)
    private EventType eventType;


    @Column(name = "is_limited_seats", nullable = false)
    private Boolean isLimitedSeats;

    @Column(name = "event_frequency", nullable = false)
    private String eventFrequency;

    @Column
    public Boolean status;

    @ManyToOne
    @JoinColumn(name = "organizer_id", nullable = false)
    private Organizer organizer;

    @JsonIgnore
    @OneToMany(mappedBy = "event")
    private List<CustomerBookEvent> bookedCustomers;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Integer seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public Boolean getIsLimitedSeats() {
        return isLimitedSeats;
    }


    public void setIsLimitedSeats(Boolean isLimitedSeats) {
        this.isLimitedSeats = isLimitedSeats;
    }

    public String getEventFrequency() {
        return eventFrequency;
    }

    public void setEventFrequency(String eventFrequency) {
        this.eventFrequency = eventFrequency;
    }

    public List<CustomerBookEvent> getBookedCustomers() {
        return bookedCustomers;
    }

    public void setBookedCustomers(List<CustomerBookEvent> bookedCustomers) {
        this.bookedCustomers = bookedCustomers;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Integer getNoOfPrioritySeats() {
        return noOfPrioritySeats;
    }

    public void setNoOfPrioritySeats(Integer noOfPrioritySeats) {
        this.noOfPrioritySeats = noOfPrioritySeats;
    }

    public Integer getAvailablePrioritySeatsInteger() {
        return availablePrioritySeatsInteger;
    }

    public Float getPrioritySeatFees() {
        return prioritySeatFees;
    }

    public void setPrioritySeatFees(Float prioritySeatFees) {
        if (prioritySeatFees != null && eventFees != null) {
            this.prioritySeatFees = prioritySeatFees + (eventFees / 10);
        }
    }

    public void setAvailablePrioritySeatsInteger(Integer availablePrioritySeatsInteger) {
        this.availablePrioritySeatsInteger = availablePrioritySeatsInteger;
    }

    public Float getEventFees() {
        return eventFees;
    }

    public void setEventFees(Float eventFees) {
        this.eventFees = eventFees;
    }


    public Event(String eventName, String eventDescription, String eventLocation, LocalDateTime eventDateTime, Integer seatsAvailable, Integer noOfPrioritySeats, Integer availablePrioritySeatsInteger, Float prioritySeatFees, Float eventFees, EventType eventType, Boolean isLimitedSeats, String eventFrequency, Boolean status, Organizer organizer) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventLocation = eventLocation;
        this.eventDateTime = eventDateTime;
        this.seatsAvailable = seatsAvailable;
        this.noOfPrioritySeats = noOfPrioritySeats;
        this.availablePrioritySeatsInteger = availablePrioritySeatsInteger;
        this.prioritySeatFees = prioritySeatFees;
        this.eventFees = eventFees;
        this.eventType = eventType;
        this.isLimitedSeats = isLimitedSeats;
        this.eventFrequency = eventFrequency;
        this.status = status;
        this.organizer = organizer;
    }

    public Event() {
    }
}
