package com.uol.smqa.service;

import com.uol.smqa.model.UserDetailsImpl;
import com.uol.smqa.model.Users;
import com.uol.smqa.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final UsersRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(email).orElseThrow(() ->
                new UsernameNotFoundException(String.format("User with email %s not found on system", email)));
        return UserDetailsImpl.build(user);
    }
}