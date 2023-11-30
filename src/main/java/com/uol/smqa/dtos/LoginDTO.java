package com.uol.smqa.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginDTO {

    @NotBlank(message = "The username field is required")
    @Pattern(regexp = ".+@.+\\..+", message = "Invalid email format")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;
}