package com.uol.smqa.service.impl;

public class DiscountCodeAlreadyExistsException extends RuntimeException {

    public DiscountCodeAlreadyExistsException(String message) {
        super(message);
    }

    public DiscountCodeAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
