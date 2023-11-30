package com.uol.smqa.service.impl;

import com.uol.smqa.dtos.response.LoginResponseDTO;
import com.uol.smqa.model.UserDetailsImpl;
import com.uol.smqa.model.Users;
import com.uol.smqa.service.AuthService;
import com.uol.smqa.service.UsersService;
import com.uol.smqa.utils.Constants;
import com.uol.smqa.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;

@RequiredArgsConstructor
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    private final UsersService usersService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;


    public LoginResponseDTO loginUser(String userName, String password) throws AuthenticationException {
        try {
            Users user = usersService.findByEmail(userName).orElseThrow(() -> new AuthenticationException(INVALID_LOGIN_CREDENTIALS_MESSAGE));
            if (!user.isActive()) throw new AuthenticationException("User is inactive. Kindly contact admin");
            Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));
            SecurityContextHolder.getContext().setAuthentication(authenticate);
            String jwtToken = jwtUtils.generateJwtToken(authenticate);

            return LoginResponseDTO
                    .builder()
                    .message(SUCCESS_LOGIN_CREDENTIALS_MESSAGE)
                    .token(jwtToken)
                    .expiresIn(jwtUtils.convertJwtExpiryToMilliSeconds())
                    .user(user)
                    .build();
        } catch (BadCredentialsException ex) {
            log.error("An error occurred while logging in user {}", ex.getMessage());
            throw new AuthenticationException(INVALID_LOGIN_CREDENTIALS_MESSAGE);
        }

    }

}
