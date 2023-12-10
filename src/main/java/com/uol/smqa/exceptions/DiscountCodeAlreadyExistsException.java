package com.uol.smqa.exceptions;

public class DiscountCodeAlreadyExistsException extends RuntimeException {

    public DiscountCodeAlreadyExistsException(String message) {
        super(message);
    }

    public DiscountCodeAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
