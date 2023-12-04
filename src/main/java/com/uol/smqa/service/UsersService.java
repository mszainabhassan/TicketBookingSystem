package com.uol.smqa.service;

import com.uol.smqa.model.Users;
import com.uol.smqa.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    public Optional<Users> findByEmail(String email) {
        return getUsersRepository().findByUsername(email);
    }



    public UsersRepository getUsersRepository() {
        return usersRepository;
    }

    public Users updateUserPassword(Users user, String newPassword) {
        user.setPassword(passwordEncoder.encode(newPassword));
        return usersRepository.save(user);
    }
}
