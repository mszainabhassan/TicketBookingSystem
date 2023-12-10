package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.EventFrequency;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AdminController;
import com.uol.smqa.controller.OrganizerController;
import com.uol.smqa.model.*;
import com.uol.smqa.repository.*;
import com.uol.smqa.service.*;
import com.uol.smqa.util.EventGenerator;

import jakarta.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AdminManageEventsStatementTest extends TicketBookingSystemApplicationTests {

    @Autowired
    private AdminController adminController;

    @SpyBean
    private CustomerService customerService;

    @SpyBean
    private CustomerBookEventService customerBookEventService;

    @SpyBean
    private WishListService wishListService;

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
        adminController = new AdminController(eventService, eventTypeService, organizerService, adminService, customerService);
        mockMvc = MockMvcBuilders.standaloneSetup(adminController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();


        eventList = eventGenerator.generateEvents();
    }

    @Test
    public void testAdminCreateEvent_Success() throws Exception {

        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/createEvent")
                        .content(objectMapper.writeValueAsString(eventToCreate))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.data.eventName").value(eventToCreate.getEventName()))
                .andExpect(jsonPath("$.data.eventDescription").value(eventToCreate.getEventDescription()))
                .andExpect(jsonPath("$.data.eventLocation").value(eventToCreate.getEventLocation()))
                .andExpect(jsonPath("$.data.seatsAvailable").value(eventToCreate.getSeatsAvailable()));

        verify(eventService, times(1)).createEventByAdmin(any(Event.class));
    }

    @Test
    public void adminCreateEvent_WithInvalidEventType_thenReturnBadRequestResponse() throws Exception {

        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, new EventType("Non existing event name"), false, EventFrequency.MONTHLY.name(), true, organizer);

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/createEvent")
                        .content(objectMapper.writeValueAsString(eventToCreate))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Invalid event type"));

        verify(eventService, times(0)).createEvent(any(Event.class));
    }


    @Test
    @Transactional
    public void adminCreateEvent_ButOrganizerNotFound_ReturnOrganizerNotFound() throws Exception {
        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = new Organizer(1000);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/createEvent")
                        .content(objectMapper.writeValueAsString(eventToCreate))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Organizer not found"));

        verify(eventService, times(0)).createEventByAdmin(any(Event.class));

    }

    @Test
    public void testCreateEvent_InternalServerError() throws Exception {
        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);

        doThrow(new Exception("An error occurred during creating an event"))
                .when(eventService).createEventByAdmin(any(Event.class));

        mockMvc.perform(MockMvcRequestBuilders.post("/admin/createEvent")
                        .content(objectMapper.writeValueAsString(eventToCreate))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred during creating an event"));


        verify(eventService, times(1)).createEventByAdmin(any(Event.class));
    }

    @Test
    public void AdminChangeEventStatus_Approve_ValidEventId_thenReturnSuccess() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        boolean newStatus = true;
        eventToEdit.setStatus(newStatus);

        String expectedResponse = "Event Status Changed!";

        mockMvc.perform(MockMvcRequestBuilders.put("/admin/change-event-status")
                        .param("eventId", String.valueOf(eventToEdit.getEventId()))
                        .param("status", String.valueOf(newStatus)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedResponse));

        verify(eventService, times(1)).ChangeEventStatus(anyInt(), anyBoolean());
    }

    @Test
    public void AdminChangeEventStatus_Reject_ValidEventId_thenReturnSuccess() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        boolean newStatus = false;
        eventToEdit.setStatus(newStatus);

        String expectedResponse = "Event Status Changed!";

        mockMvc.perform(MockMvcRequestBuilders.put("/admin/change-event-status")
                        .param("eventId", String.valueOf(eventToEdit.getEventId()))
                        .param("status", String.valueOf(newStatus)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedResponse));

        verify(eventService, times(1)).ChangeEventStatus(anyInt(), anyBoolean());
    }

    @Test
    public void AdminChangeEventStatus_Approve_WithInValidEventId_thenReturnErrorMessage() throws Exception {
        boolean newStatus = false;
        int eventId = 100;
        String expectedResponse = "Event Id not present!";

        mockMvc.perform(MockMvcRequestBuilders.put("/admin/change-event-status")
                        .param("eventId", String.valueOf(eventId))
                        .param("status", String.valueOf(newStatus)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedResponse));

        verify(eventService, times(1)).ChangeEventStatus(anyInt(), anyBoolean());
    }

    @Test
    public void adminUpdateEvent_WithValidRequestBody_thenReturnSuccess() throws Exception {
        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);
        this.eventRepository.save(eventToCreate);
        eventToCreate.setEventName("Event Name Updated");
        mockMvc.perform(MockMvcRequestBuilders.put("/admin/updateEvent")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToCreate)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Event updated successfully"));

        verify(eventService, times(1)).updateEvent(any(Event.class));

        Event updatedEventFromDatabase = eventRepository.findById(eventToCreate.getEventId());
        Assertions.assertNotNull(updatedEventFromDatabase);
        Assertions.assertEquals(eventToCreate.getEventName(), updatedEventFromDatabase.getEventName());
    }

    @Test
    public void adminUpdateEvent_WithInvalidEventType_thenReturnBadRequestResponse() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        eventToEdit.setEventType(new EventType("Non existing event name"));
        mockMvc.perform(MockMvcRequestBuilders.put("/admin/updateEvent")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToEdit)))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Invalid event type"));

        verify(eventService, times(1)).updateEvent(any(Event.class));

    }

    @Test
    @Transactional
    public void adminUpdateEvent_ButOrganizerNotFound_ReturnOrganizerNotFound() throws Exception {
        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer validOrganizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, validOrganizer);
        Event eventToEdit = this.eventRepository.save(eventToCreate);
        eventToEdit.setEventName("Edited Name");
        eventToEdit.setOrganizer(new Organizer(100));
        mockMvc.perform(MockMvcRequestBuilders.put("/admin/updateEvent")
                        .content(objectMapper.writeValueAsString(eventToEdit))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.message").value("Organizer not found"));

        verify(eventService, times(0)).createEventByAdmin(any(Event.class));

    }
}
