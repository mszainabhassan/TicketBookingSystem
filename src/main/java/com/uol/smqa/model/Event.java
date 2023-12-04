package com.uol.smqa.model;
import java.time.LocalDateTime;
import java.util.List;

import com.uol.smqa.Enum.EventFrequency;
import jakarta.persistence.*;


@Entity(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int eventId;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "event_description", nullable = false)
    private String eventDescription;

    @Column(name = "event_location", nullable = false)
    private String eventLocation;

    @Column(name = "event_date_time", nullable = false)
    private LocalDateTime eventDateTime;

    @ManyToOne
    @JoinColumn(name = "event_type_name", nullable = false)
    
    private EventType eventType;
    
    

    @Column(name = "seats_available")
    private Integer seatsAvailable;

    @Column(name = "is_limited_seats", nullable = false)
    private Boolean isLimitedSeats;

    @Column(name = "event_frequency", nullable = false)
    private String eventFrequency;

    @Column
    public Boolean status;

    @ManyToOne
    @JoinColumn(name = "organizer_id", nullable = false)
    private Organizer organizer;

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

}
