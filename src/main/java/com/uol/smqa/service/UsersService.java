package com.uol.smqa.service;

import com.uol.smqa.model.Users;
import com.uol.smqa.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public Optional<Users> findByEmail(String email) {
        return getUsersRepository().findByEmail(email);
    }



    public UsersRepository getUsersRepository() {
        return usersRepository;
    }

}
