// CustomerBookEvent.java
package com.uol.smqa.model;

import jakarta.persistence.*;

@Entity
public class CustomerBookEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event; 
    
    @Column(name = "rating")
    private Integer rating; 
    
    @Column(name = "review")
    private String review; 
    
    
    @Column(name="ticket_count")
    private Integer ticketCount;
    
    
    // Constructors, getters, and setters

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
    
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
    public Integer getticketCount() {
        return ticketCount;
    }

    public void setticketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }
}
