package com.uol.smqa.controller;

import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.dtos.response.LoginResponseDTO;
import com.uol.smqa.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uol.smqa.model.Customer;

import javax.naming.AuthenticationException;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthService authService;
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@Validated @RequestBody LoginRequestDTO loginDTO, BindingResult bindingResult) {
		try {
			if (bindingResult.hasErrors()) {
				return new ResponseEntity<>(LoginResponseDTO.builder()
						.message("One or more validation errors occurred")
						.errors(getErrorMessages(bindingResult))
						.build(), HttpStatus.UNPROCESSABLE_ENTITY);
			}
			LoginResponseDTO loginResponseDTO = authService.loginUser(loginDTO.getUsername(), loginDTO.getPassword());
			return new ResponseEntity<>(loginResponseDTO, HttpStatus.OK);
		} catch (AuthenticationException ex) {
			return new ResponseEntity<>(LoginResponseDTO.builder()
					.message(ex.getMessage())
					.build(), HttpStatus.UNAUTHORIZED);
		}
	}

}
