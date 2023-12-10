package com.uol.smqa.dtos.response;

import java.math.BigDecimal;

public class DiscountResponseDTO {

    private String message;
    private Float discountAmount;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Float getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public DiscountResponseDTO() {
    }


    public DiscountResponseDTO(String message, Float discountAmount) {
        this.message = message;
        this.discountAmount = discountAmount;
    }
}