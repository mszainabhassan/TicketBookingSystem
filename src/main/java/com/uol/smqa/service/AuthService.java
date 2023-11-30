package com.uol.smqa.service;

import com.uol.smqa.dtos.response.LoginResponseDTO;

import javax.naming.AuthenticationException;

public interface AuthService {

    LoginResponseDTO loginUser(String userName, String password) throws AuthenticationException;
}
