package com.uol.smqa.service.impl;

import com.uol.smqa.model.Users;
import com.uol.smqa.service.AuthService;
import com.uol.smqa.service.UsersService;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UsersService usersService;


    public void loginUser(String userName, String password) {
        Optional<Users> usersOptional = usersService.findByEmail(userName);
        if (!usersOptional.isPresent()) {
            throw new
        }
    }

}
