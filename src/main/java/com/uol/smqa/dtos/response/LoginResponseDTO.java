package com.uol.smqa.dtos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.uol.smqa.model.Users;

import java.io.Serializable;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)

public class LoginResponseDTO {

    private String message;
    private List<String> errors;
    private Users user;

    private String token;

    private Long expiresIn;


    public LoginResponseDTO(String message) {
        this.message = message;
    }

    public LoginResponseDTO(String message, List<String> errors) {
        this.message = message;
        this.errors = errors;
    }


    public LoginResponseDTO(String message, List<String> errors, Users user, String token, Long expiresIn) {
        this.message = message;
        this.errors = errors;
        this.user = user;
        this.token = token;
        this.expiresIn = expiresIn;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
