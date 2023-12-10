package com.uol.smqa.dtos.request;

import jakarta.validation.constraints.NotNull;

public class DiscountRequestDTO {

    @NotNull(message = "The couponCode field is required")
    private String couponCode;

    @NotNull(message = "eventId is required")
    private int eventId;
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public DiscountRequestDTO() {
    }


    public DiscountRequestDTO(String couponCode, int eventId) {
        this.couponCode = couponCode;
        this.eventId = eventId;
    }
}