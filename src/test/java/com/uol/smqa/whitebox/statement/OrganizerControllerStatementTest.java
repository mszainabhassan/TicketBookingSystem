package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.DiscountType;
import com.uol.smqa.Enum.EventFrequency;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.EmailController;
import com.uol.smqa.controller.OrganizerController;
import com.uol.smqa.model.*;
import com.uol.smqa.repository.*;
import com.uol.smqa.service.*;
import com.uol.smqa.util.EventGenerator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class OrganizerControllerStatementTest extends TicketBookingSystemApplicationTests {

    private OrganizerController organizerController;

    @SpyBean
    private EventService eventService;

    @Autowired
    private EventGenerator eventGenerator;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ReviewReplyRepository reviewReplyRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private EventTypeRepository eventTypeRepository;

    @SpyBean
    private EventTypeService eventTypeService;

    @SpyBean
    private OrganizerService organizerService;

    @SpyBean
    private AdminService adminService;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private EventReviewService eventReviewService;

    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;

    private List<Event> eventsList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        organizerController = new OrganizerController(eventTypeService, organizerService, eventService, adminService, eventReviewService);
        mockMvc = MockMvcBuilders.standaloneSetup(organizerController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();


        eventsList = eventGenerator.generateEvents();
    }

    @Test
    public void organizerRegistration_WithValidRequest_thenReturnSuccess() throws Exception {

        Organizer organizerToCreate = new Organizer("Organizer 1", "Land Rover", "organizer@tbs.com", LocalDate.now().minusYears(20), Gender.FEMALE, "+99 223 111", "00099987777", new Users("organizer@tbs.com", "password"));

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(organizerToCreate)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.name").value(organizerToCreate.getName()))
                .andExpect(jsonPath("$.email").value(organizerToCreate.getEmail()))
                .andExpect(jsonPath("$.orgName").value(organizerToCreate.getOrgName()));

        verify(organizerService, times(1)).OrganizerRegistration(any(Organizer.class));
    }

    private Event buildEventRequest(Organizer organizer) {
        return new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, new EventType("Non existing event name"), false, EventFrequency.MONTHLY.name(), true, organizer);
    }

    @Test
    public void organizerRequestEventCreation_WithValidRequest_thenReturnSuccess() throws Exception {

        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = buildEventRequest(organizer);

        Admin admin = adminRepository.findAll().get(0);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/requestEventCreation")
                        .param("adminId", String.valueOf(admin.getAdminId()))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(eventToCreate)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Event creation request sent to admin"));

        verify(adminService, times(1)).handleEventCreationRequest(any(Event.class), anyInt());
    }

    @Test
    public void organizerRequestEventCreation_WithInvalidAdminId_thenReturnNotFoundError() throws Exception {

        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = buildEventRequest(organizer);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/requestEventCreation")
                        .param("adminId", String.valueOf(999099))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(eventToCreate)))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Admin not found"));

        verify(adminService, times(0)).handleEventCreationRequest(any(Event.class), anyInt());
    }


    @Test
    public void organizerRequestEventCreation_WithInvalidRequest_thenReturnNotFoundError() throws Exception {

        Event event =  new Event(null, "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, new EventType("Non existing event name"), false, EventFrequency.MONTHLY.name(), true, null);
        Admin admin = adminRepository.findAll().get(0);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/requestEventCreation")
                        .param("adminId", String.valueOf(admin.getAdminId()))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(event)))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Invalid event data"));

        verify(adminService, times(0)).handleEventCreationRequest(any(Event.class), anyInt());
    }


    @Test
    public void organizerRequestEventCreation_WithUnexpectedError_thenReturnInternalServerError() throws Exception {

        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = buildEventRequest(organizer);

        doThrow(new Exception("An error occurred"))
                .when(organizerService).organizerExists(anyInt());

        Admin admin = adminRepository.findAll().get(0);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/requestEventCreation")
                        .param("adminId", String.valueOf(admin.getAdminId()))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(eventToCreate)))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Failed to send event creation request"));

        verify(organizerService, times(1)).organizerExists(anyInt());
        verify(adminService, times(0)).handleEventCreationRequest(any(Event.class), anyInt());
    }


    @Test
    public void organizerSetDiscount_WithValidRequest_thenReturnSuccess() throws Exception {

        Event event = eventsList.get(eventsList.size() - 1);
        Organizer organizer = organizerRepository.findAll().get(0);
        Discount discount = new Discount("000999", 900f, DiscountType.FIXED_AMOUNT, organizer, event);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/set_discount")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(discount)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.discountCode").value(discount.getDiscountCode()))
                .andExpect(jsonPath("$.discountValue").value(discount.getDiscountValue()))
                .andExpect(jsonPath("$.discountType").value(discount.getDiscountType().toString()));

        verify(organizerService, times(1)).setDiscount(any(Discount.class));
    }




}