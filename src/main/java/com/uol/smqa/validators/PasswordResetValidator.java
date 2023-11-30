package com.uol.smqa.validators;


import com.uol.smqa.dtos.request.PasswordResetRequestDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PasswordResetValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return PasswordResetRequestDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PasswordResetRequestDTO passwordResetRequestDTO = (PasswordResetRequestDTO) target;

        if (!passwordResetRequestDTO.getPassword().equals(passwordResetRequestDTO.getConfirmPassword())) {
            errors.reject("confirmPassword", null, "Password field must match reset password");
        }
    }
}
