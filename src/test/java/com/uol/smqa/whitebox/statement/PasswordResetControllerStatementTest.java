package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.controller.PasswordResetController;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.dtos.request.PasswordResetRequestDTO;
import com.uol.smqa.model.Users;
import com.uol.smqa.repository.UsersRepository;
import com.uol.smqa.service.AuthService;
import com.uol.smqa.service.PasswordResetService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import org.mockito.BDDMockito;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.willAnswer;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PasswordResetControllerStatementTest extends TicketBookingSystemApplicationTests {

    private PasswordResetController passwordResetController;

    @SpyBean
    private PasswordResetService passwordResetService;

    @Autowired
    private UsersRepository usersRepository;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        passwordResetController = new PasswordResetController(passwordResetService);
        mockMvc = MockMvcBuilders.standaloneSetup(passwordResetController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();
    }

    @Test
    public void initiatePasswordReset_WithValidRequest_thenReturnSuccess() throws Exception {

        PasswordResetRequestDTO passwordResetRequestDTO = new PasswordResetRequestDTO("admin@tbs.com", "password", "password");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/reset-password")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(passwordResetRequestDTO)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Successfully reset user password"))
                .andExpect(jsonPath("$.username").isNotEmpty())
                .andExpect(jsonPath("$.username").value(passwordResetRequestDTO.getUsername()));

        verify(passwordResetService, times(1)).initiateResetPassword(any(PasswordResetRequestDTO.class));
    }



    @Test
    public void initiatePasswordReset_WithDisabledUser_thenReturnAuthorizationError() throws Exception {

        PasswordResetRequestDTO passwordResetRequestDTO = new PasswordResetRequestDTO("admin@tbs.com", "password", "password");
        disableAdminUser(passwordResetRequestDTO);

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/reset-password")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(passwordResetRequestDTO)))
                .andDo(print())
                .andExpect(status().isForbidden())
                .andExpect(jsonPath("$.message").value("User is not authorized to carry out action"))
                .andExpect(jsonPath("$.username").doesNotExist());


        verify(passwordResetService, times(1)).initiateResetPassword(any());
    }

    


    @Test
    public void initiatePasswordReset_WithInvalidUsername_thenReturnError() throws Exception {

        PasswordResetRequestDTO passwordResetRequestDTO = new PasswordResetRequestDTO("unknownuser@tbs.com", "password", "password");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/reset-password")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(passwordResetRequestDTO)))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("User with email does not exist"));

        verify(passwordResetService, times(1)).initiateResetPassword(any());
    }


    @Test
    public void initiatePasswordReset_WithInvalidUsernameFormat_thenReturnUnprocessibleError() throws Exception {

        PasswordResetRequestDTO passwordResetRequestDTO = new PasswordResetRequestDTO("unknownuser", "password", "password");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/reset-password")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(passwordResetRequestDTO)))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.message").value("One or more validation errors occurred"))
                .andExpect(jsonPath("$.errors[0]").value("Invalid email format"));

        verify(passwordResetService, times(0)).initiateResetPassword(any());
    }


    @Test
    public void initiatePasswordReset_WithNonMatchingPasswords_thenReturnBadRequest() throws Exception {

        PasswordResetRequestDTO passwordResetRequestDTO = new PasswordResetRequestDTO("admin@tbs.com", "password", "password345");

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/reset-password")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(passwordResetRequestDTO)))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.message").value("One or more validation errors occurred"))
                .andExpect(jsonPath("$.errors[0]").value("Password field must match reset password"));

        verify(passwordResetService, times(0)).initiateResetPassword(any());
    }



    @Test
    public void initiatePasswordReset_WithValidRequest_thenUnexpectedServerErrorsOccurs() throws Exception {
        PasswordResetRequestDTO passwordResetRequestDTO = new PasswordResetRequestDTO("admin@tbs.com", "password", "password");

        doThrow(new Exception("An unexpected error occurred"))
                .when(passwordResetService).initiateResetPassword(any());

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/reset-password")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(passwordResetRequestDTO)))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An unexpected error occurred"));

        verify(passwordResetService, times(1)).initiateResetPassword(any());
    }
    
    
    
    private void disableAdminUser(PasswordResetRequestDTO passwordResetRequestDTO) {
        Users admin = usersRepository.findByUsername(passwordResetRequestDTO.getUsername()).get();
        admin.setActive(false);
        usersRepository.save(admin);
    }


}