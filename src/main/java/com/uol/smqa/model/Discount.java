package com.uol.smqa.model;

import com.uol.smqa.Enum.DiscountType;
import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
public class Discount {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Adjust the strategy based on your database
    private Long id;

    private String discountCode;

    private Float discountValue;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Float getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Float discountValue) {
        this.discountValue = discountValue;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}





