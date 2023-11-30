package com.uol.smqa.dtos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.uol.smqa.model.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginResponseDTO {

    private String message;

    private Users user;

    private String token;

    private Long expiresIn;
}
