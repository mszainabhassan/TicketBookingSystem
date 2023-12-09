package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.service.AuthService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EmailControllerStatementTest extends TicketBookingSystemApplicationTests {

    private AuthController authController;

    @SpyBean
    private AuthService authService;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        authController = new AuthController(authService);
        mockMvc = MockMvcBuilders.standaloneSetup(authController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();
    }

    @Test
    public void loginCustomer_WithValidCredentials_thenReturnSuccess() throws Exception {

        LoginRequestDTO loginRequestDTO = new LoginRequestDTO("admin@tbs.com", "password");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(loginRequestDTO)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(SUCCESS_LOGIN_CREDENTIALS_MESSAGE))
                .andExpect(jsonPath("$.user").isNotEmpty())
                .andExpect(jsonPath("$.user.username").value(loginRequestDTO.getUsername()));

        verify(authService, times(1)).loginUser(loginRequestDTO.getUsername(), loginRequestDTO.getPassword());
    }



    @Test
    public void loginCustomer_WithInvalidCredentials_thenReturnUnauthorizedError() throws Exception {

        LoginRequestDTO loginRequestDTO = new LoginRequestDTO("randomuser@tbs.com", "password");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(loginRequestDTO)))
                .andDo(print())
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$.message").value(INVALID_LOGIN_CREDENTIALS_MESSAGE));

        verify(authService, times(1)).loginUser(loginRequestDTO.getUsername(), loginRequestDTO.getPassword());
    }


    @Test
    public void loginCustomer_WithUnexpectedCredentials_thenReturnBadRequest() throws Exception {

        LoginRequestDTO loginRequestDTO = new LoginRequestDTO("randomuser", "password");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(loginRequestDTO)))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.message").value("One or more validation errors occurred"))
                .andExpect(jsonPath("$.errors[0]").value("Invalid email format"));

        verify(authService, times(0)).loginUser(loginRequestDTO.getUsername(), loginRequestDTO.getPassword());

    }

}