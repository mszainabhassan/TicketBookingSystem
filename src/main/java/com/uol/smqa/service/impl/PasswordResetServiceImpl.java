package com.uol.smqa.service.impl;

import com.uol.smqa.dtos.request.PasswordResetRequestDTO;
import com.uol.smqa.dtos.response.PasswordResetResponseDto;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.model.PasswordResetHistory;
import com.uol.smqa.model.Users;
import com.uol.smqa.repository.PasswordResetHistoryRepository;
import com.uol.smqa.service.PasswordResetService;
import com.uol.smqa.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordResetServiceImpl implements PasswordResetService {

    private final UsersService usersService;

    private final PasswordResetHistoryRepository passwordResetHistoryRepository;

    @Autowired
    public PasswordResetServiceImpl(UsersService usersService, PasswordResetHistoryRepository passwordResetHistoryRepository) {
        this.usersService = usersService;
        this.passwordResetHistoryRepository = passwordResetHistoryRepository;
    }


    @Override
    public PasswordResetResponseDto initiateResetPassword(PasswordResetRequestDTO passwordResetRequestDTO) throws Exception {
        Users user = usersService.findByEmail(passwordResetRequestDTO.getUsername()).orElseThrow(() -> new ResourceNotFoundException("User with email does not exist"));
        if (!user.isActive()) throw new AuthorizationException("User is not authorized to carry out action");
        createPasswordResetHistory(user);
        usersService.updateUserPassword(user, passwordResetRequestDTO.getPassword());

        return new PasswordResetResponseDto("Successfully reset user password", user.getUsername());
    }

    private PasswordResetHistory createPasswordResetHistory(Users user) {
        new PasswordResetHistory(user);
        return passwordResetHistoryRepository.save(new PasswordResetHistory(user));
    }


}
