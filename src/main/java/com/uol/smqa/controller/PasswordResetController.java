package com.uol.smqa.controller;

import com.uol.smqa.dtos.request.PasswordResetRequestDTO;
import com.uol.smqa.dtos.response.LoginResponseDTO;
import com.uol.smqa.dtos.response.PasswordResetResponseDto;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.service.PasswordResetService;
import com.uol.smqa.validators.PasswordResetValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;

@RestController
@RequestMapping("/auth/reset-password")
@RequiredArgsConstructor
public class PasswordResetController {

    private final PasswordResetService passwordResetService;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(new PasswordResetValidator());
    }

    @PostMapping
    public ResponseEntity<?> initiateResetPassword(@Validated @RequestBody PasswordResetRequestDTO passwordResetRequestDTO, BindingResult bindingResult) {

        try {
            if (bindingResult.hasErrors()) {
                return new ResponseEntity<>(LoginResponseDTO.builder()
                        .message("One or more validation errors occurred")
                        .errors(getErrorMessages(bindingResult))
                        .build(), HttpStatus.UNPROCESSABLE_ENTITY);
            }
            PasswordResetResponseDto passwordResetResponseDto = passwordResetService.initiateResetPassword(passwordResetRequestDTO);
            return new ResponseEntity<>(passwordResetResponseDto, HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(PasswordResetResponseDto.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.NOT_FOUND);
        } catch (AuthorizationException ex) {
            return new ResponseEntity<>(PasswordResetResponseDto.builder()
                    .message(ex.getMessage())
                    .build(), HttpStatus.FORBIDDEN);
        } catch (Exception ex) {
            return new ResponseEntity<>(PasswordResetResponseDto.builder()
                    .message("An unexpected error occurred while resetting user password")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
