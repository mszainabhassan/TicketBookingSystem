package com.uol.smqa.controller;

import com.uol.smqa.dtos.request.PasswordResetRequestDTO;
import com.uol.smqa.dtos.response.LoginResponseDTO;
import com.uol.smqa.dtos.response.PasswordResetResponseDto;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.service.PasswordResetService;
import com.uol.smqa.validators.PasswordResetValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;

@RestController
@RequestMapping("/auth/reset-password")
public class PasswordResetController {

    @Autowired
    private PasswordResetService passwordResetService;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(new PasswordResetValidator());
    }

    @PostMapping
    public ResponseEntity<?> initiateResetPassword(@Validated @RequestBody PasswordResetRequestDTO passwordResetRequestDTO, BindingResult bindingResult) {

        try {
            if (bindingResult.hasErrors()) {
                return new ResponseEntity<>(new LoginResponseDTO("One or more validation errors occurred", getErrorMessages(bindingResult)), HttpStatus.UNPROCESSABLE_ENTITY);
            }
            PasswordResetResponseDto passwordResetResponseDto = passwordResetService.initiateResetPassword(passwordResetRequestDTO);
            return new ResponseEntity<>(passwordResetResponseDto, HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {

            return new ResponseEntity<>(new PasswordResetResponseDto(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (AuthorizationException ex) {
            return new ResponseEntity<>(new PasswordResetResponseDto(ex.getMessage()), HttpStatus.FORBIDDEN);
        } catch (Exception ex) {
            return new ResponseEntity<>(new PasswordResetResponseDto(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
