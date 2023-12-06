package com.uol.smqa.dtos.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordResetResponseDto {

    private String message;
    private String username;

    public PasswordResetResponseDto(String message) {
        this.message = message;
    }

    public PasswordResetResponseDto(String message, String username) {
        this.message = message;
        this.username = username;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
