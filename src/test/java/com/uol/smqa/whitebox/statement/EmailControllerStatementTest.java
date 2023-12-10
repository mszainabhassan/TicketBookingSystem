package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.controller.EmailController;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.model.Event;
import com.uol.smqa.service.AuthService;
import com.uol.smqa.service.EventService;
import com.uol.smqa.util.EventGenerator;
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

import java.util.ArrayList;
import java.util.List;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EmailControllerStatementTest extends TicketBookingSystemApplicationTests {

    private EmailController emailController;

    @SpyBean
    private EventService eventService;

    @Autowired
    private EventGenerator eventGenerator;


    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;

    private List<Event> eventsList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        emailController = new EmailController(eventService);
        mockMvc = MockMvcBuilders.standaloneSetup(emailController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();

        eventsList = eventGenerator.generateEvents();
    }

    @Test
    public void sendEventNotifications_WithValidRequest_thenReturnSuccess() throws Exception {

        Event event = eventsList.get(0);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/email/sendEventNotifications")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(event)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value("Event notifications sent successfully."));

        verify(eventService, times(1)).sendEventNotifications(any(Event.class));
    }



    @Test
    public void sendEventNotifications_WithUnexpectedError_thenReturnMessage() throws Exception {

        Event event = eventsList.get(0);
        doThrow(new Exception("An unexpected error occurred while sending notification"))
                .when(eventService).sendEventNotifications(any(Event.class));

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/email/sendEventNotifications")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(event)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("Failed to send event notifications. Error:")));

        verify(eventService, times(1)).sendEventNotifications(any(Event.class));
    }

}