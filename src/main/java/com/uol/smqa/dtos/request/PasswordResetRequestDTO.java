package com.uol.smqa.dtos.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordResetRequestDTO {

    @NotNull(message = "Username is required")
    @Pattern(regexp = ".+@.+\\..+", message = "Invalid email format")
    private String username;
    @NotNull(message = "password is required")
    private String password;

    private String confirmPassword;
}
