package com.uol.smqa.controller;

import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.dtos.response.LoginResponseDTO;
import com.uol.smqa.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loginUser(@Validated @RequestBody LoginRequestDTO loginDTO, BindingResult bindingResult) {
		try {
			if (bindingResult.hasErrors()) {
				return new ResponseEntity<>(new LoginResponseDTO("One or more validation errors occurred", getErrorMessages(bindingResult)), HttpStatus.UNPROCESSABLE_ENTITY);
			}
			LoginResponseDTO loginResponseDTO = authService.loginUser(loginDTO.getUsername(), loginDTO.getPassword());
			return new ResponseEntity<>(loginResponseDTO, HttpStatus.OK);
		} catch (AuthenticationException ex) {
			return new ResponseEntity<>(new LoginResponseDTO(ex.getMessage()), HttpStatus.UNAUTHORIZED);
		}
	}

}
