package com.uol.smqa.service;

import com.uol.smqa.dtos.request.PasswordResetRequestDTO;
import com.uol.smqa.dtos.response.PasswordResetResponseDto;

public interface PasswordResetService {

    PasswordResetResponseDto initiateResetPassword(PasswordResetRequestDTO passwordResetRequestDTO) throws Exception;
}
