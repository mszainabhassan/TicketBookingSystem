package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.EventFrequency;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AdminController;
import com.uol.smqa.model.*;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.EventTypeRepository;
import com.uol.smqa.repository.OrganizerRepository;
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

public class AdminControllerStatementTest extends TicketBookingSystemApplicationTests {

	@Autowired
    private AdminController adminController;

    @SpyBean
    private CustomerService customerService;

    @SpyBean
    private EventService eventService;

    @SpyBean
    private EventTypeService eventTypeService;

    @SpyBean
    private OrganizerService organizerService;
    
    @SpyBean
    private AdminService adminService;

    @Autowired
    private EventGenerator eventGenerator;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ObjectMapper objectMapper;
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private EventTypeRepository eventTypeRepository;
    
    @Autowired
    private OrganizerRepository organizerRepository;

    private MockMvc mockMvc;
    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        adminController = new AdminController(eventService,eventTypeService, organizerService,  adminService,customerService);
        mockMvc = MockMvcBuilders.standaloneSetup(adminController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();


        eventList = eventGenerator.generateEvents();
    }
    
    @Test
    public void testAdminGetEventTypes_Success() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/admin/geteventtypes")
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$[0].eventTypeName").isNotEmpty())
                .andExpect(jsonPath("$[0].id").isNotEmpty());

        verify(eventTypeService, times(1)).getAllEventTypes();
    }

    @Test
    public void adminAddEventType_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        EventType eventType = new EventType("MUSIC");

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/addeventtype")
                        .content(objectMapper.writeValueAsString(eventType))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Successfully added event type"))
                .andExpect(jsonPath("$.data.eventTypeName").value(eventType.getEventTypeName()));

        verify(eventTypeService, times(1)).addEventType(any(EventType.class));
    }

    @Test
    public void adminAddEventType_WithDuplicateTypeName_thenReturnBadRequestResponse() throws Exception {

        EventType eventType = new EventType("MUSIC");
        eventTypeRepository.save(eventType);

        EventType eventTypeClone = new EventType("MUSIC");

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/addeventtype")
                        .content(objectMapper.writeValueAsString(eventTypeClone))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Event type already exists"));

        verify(eventTypeService, times(1)).addEventType(any(EventType.class));
    }

//    @Test
//    public void adminUpdateEventType_WithValidRequest_thenReturnSuccessResponse() throws Exception {
//
//        EventType eventType = new EventType("MUSIC");
//        eventTypeRepository.save(eventType);
//
//        eventType.setEventTypeName("ANOTHER MUSIC CONCERT");
//
//        mockMvc.perform(MockMvcRequestBuilders.put("/admin/updateeventtype")
//                        .param("id", String.valueOf(eventType.getId()))
//                        .content(objectMapper.writeValueAsString(eventType))
//                        .contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$").isNotEmpty())
//                .andExpect(jsonPath("$.eventTypeName").value(eventType.getEventTypeName()));
//
//        verify(eventTypeService, times(1)).updateEventType(anyLong(), any(EventType.class));
//    }

    @Test
    public void adminUpdateEventType_WithInvalidId_thenReturnNotFoundResponse() throws Exception {

        EventType eventType = new EventType("MUSIC");
        eventTypeRepository.save(eventType);

        eventType.setEventTypeName("ANOTHER MUSIC CONCERT");

        mockMvc.perform(MockMvcRequestBuilders.put("/admin/updateeventtype")
                        .param("id", String.valueOf(9999999))
                        .content(objectMapper.writeValueAsString(eventType))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message", containsString("Event type with ID")));

        verify(eventTypeService, times(1)).updateEventType(anyLong(), any(EventType.class));
    }


    @Test
    public void adminDeleteEventType_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        EventType eventType = new EventType("MUSIC");
        eventType = eventTypeRepository.save(eventType);


        mockMvc.perform(MockMvcRequestBuilders.delete("/admin/deleteeventtype")
                        .param("id", String.valueOf(eventType.getId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty());

        verify(eventTypeService, times(1)).deleteEventType(anyLong());
    }

    @Test
    public void adminDeleteEventType_WithInvalidId_thenReturnNotFoundResponse() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.delete("/admin/deleteeventtype")
                        .param("id", String.valueOf(99999999))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", containsString("Event type with ID")));

        verify(eventTypeService, times(1)).deleteEventType(anyLong());
    }


    @Test
    public void adminChangeOrganizerStatus_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        Event event = eventList.get(eventList.size() - 1);


        mockMvc.perform(MockMvcRequestBuilders.put("/admin/change_organizer_account_status")
                        .param("organizer_id", String.valueOf(event.getOrganizer().getOrganizerId()))
                        .param("isActive", "true")
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Organizer Account Status Changed"));

        verify(adminService, times(1)).ChangeOrganizerStatus(anyInt(), anyBoolean());
    }


    @Test
    public void adminChangeOrganizerStatus_WithInvalidOrganizerId_thenReturnSuccessResponse() throws Exception {

        Event event = eventList.get(eventList.size() - 1);

        mockMvc.perform(MockMvcRequestBuilders.put("/admin/change_organizer_account_status")
                        .param("organizer_id", String.valueOf(event.getOrganizer().getOrganizerId()))
                        .param("isActive", "true")
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Organizer Account Status Changed"));

        verify(adminService, times(1)).ChangeOrganizerStatus(anyInt(), anyBoolean());
    }

    @Test
    public void adminChangeUserStatus_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        Event event = eventList.get(eventList.size() - 1);
        Customer newCustomer = new Customer("Zainab", "Zainab@tbs.com", LocalDate.now().minusYears(30),
                Gender.FEMALE, "+99 888 777 6665", true, true, new Users("Zainab@tbs.com", "password"));
        newCustomer = customerRepository.save(newCustomer);

        mockMvc.perform(MockMvcRequestBuilders.put("/admin/change_user_status")
                        .param("customer_id", String.valueOf(newCustomer.getCustomerId()))
                        .param("isActive", "true")
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Customer Account Status Changed"));

        verify(adminService, times(1)).ChangeUserStatus(anyInt(), anyBoolean());
    }


    @Test
    public void adminCustomerRegistration_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        Customer customerToRegister = new Customer("Zainab", "Zainab@tbs.com", LocalDate.now().minusYears(30),
                Gender.FEMALE, "+99 888 777 6665", true, true, new Users("Zainab@tbs.com", "password"));

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/register")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(customerToRegister))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.name").value(customerToRegister.getName()))
                .andExpect(jsonPath("$.email").value(customerToRegister.getEmail()));

        verify(customerService, times(1)).CustomerRegistration(any(Customer.class));
    }



    @Test
    public void adminInitiateEventCreation_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);


        mockMvc.perform(MockMvcRequestBuilders.post("/admin/initiateEventCreation")
                        .param("organizerId", String.valueOf(organizer.getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToCreate))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", containsString("Event creation initiated successfully.")));


        verify(eventService, times(1)).createEvent(any(Event.class));
    }


    @Test
    public void adminInitiateEventCreation_WithUnexpectedError_thenReturnInternalServerError() throws Exception {

        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);

        doThrow (new Exception("An unexpected error occurred while initiating event creation"))
                .when(eventService).createEvent(any(Event.class));

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/initiateEventCreation")
                        .param("organizerId", String.valueOf(organizer.getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToCreate))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", containsString("Failed to initiate event creation. Status")));


        verify(eventService, times(1)).createEvent(any(Event.class));
    }



}
