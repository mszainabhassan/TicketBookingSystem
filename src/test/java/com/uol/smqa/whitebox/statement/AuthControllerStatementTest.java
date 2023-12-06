package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplication;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.controller.CustomerController;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.service.AuthService;
import com.uol.smqa.service.impl.AuthServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AuthControllerStatementTest extends TicketBookingSystemApplicationTests {

    private AuthController authController;

    @Autowired
    private AuthService authService;
    private MockMvc mockMvc;

    @BeforeEach
    private void setup() {
        MockitoAnnotations.initMocks(this);
        authController = new AuthController(authService);
        mockMvc = MockMvcBuilders.standaloneSetup(authController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();
    }

    @Test
    public void loginCustomer_WithValidCredentials_thenReturnSuccess() throws Exception {
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO("test@test.com", "password");


        mockMvc.perform(MockMvcRequestBuilders.post("/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(loginRequestDTO)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(SUCCESS_LOGIN_CREDENTIALS_MESSAGE));

    }

}