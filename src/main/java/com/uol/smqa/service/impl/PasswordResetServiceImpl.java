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
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PasswordResetServiceImpl implements PasswordResetService {

    private final UsersService usersService;
    private final PasswordResetHistoryRepository passwordResetHistoryRepository;


    public PasswordResetResponseDto initiateResetPassword(PasswordResetRequestDTO passwordResetRequestDTO) {
        Users user = usersService.findByEmail(passwordResetRequestDTO.getUsername()).orElseThrow(() -> new ResourceNotFoundException("User with email does not exist"));
        if (!user.isActive()) throw new AuthorizationException("User is not authorized to carry out action");
        createPasswordResetHistory(user);
        usersService.updateUserPassword(user, passwordResetRequestDTO.getPassword());
        return PasswordResetResponseDto.builder()
                .message("Successfully reset user password")
                .username(user.getUsername())
                .build();
    }

    private PasswordResetHistory createPasswordResetHistory(Users user) {
        return passwordResetHistoryRepository.save(PasswordResetHistory.builder()
                        .users(user)
                .build());
    }


}
