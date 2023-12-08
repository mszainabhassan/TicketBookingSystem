package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.CustomerController;
import com.uol.smqa.controller.OrganizerController;
import com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria;
import com.uol.smqa.model.Event;
import com.uol.smqa.repository.EventRepository;
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

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class OrganizerManageEventsStatementTest extends TicketBookingSystemApplicationTests {

    private OrganizerController organizerController;

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
    private EventReviewService eventReviewService;

    @Autowired
    private EventGenerator eventGenerator;

    @Autowired
    private EventRepository eventRepository;

    private MockMvc mockMvc;
    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        organizerController = new OrganizerController(eventTypeService, organizerService, eventService, eventReviewService);
        mockMvc = MockMvcBuilders.standaloneSetup(organizerController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();


        eventList = eventGenerator.generateEvents();
    }

    @Test
    public void organizerViewEvents_WithoutAnyParameters_thenReturnSuccess() throws Exception {
        long expectedEventsCount = eventRepository.count();
        CustomerEventsFilterSearchCriteria filterSearchCriteria = new CustomerEventsFilterSearchCriteria();

        mockMvc.perform(MockMvcRequestBuilders.get("/customer/all-events")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(filterSearchCriteria)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize((int) expectedEventsCount)));

        verify(eventService, times(1)).getAllEventsBySearchCriteria(any());
    }


    @Test
    public void filterEvents_ByLocation_thenReturnSuccess() throws Exception {

        Event eventToSeachFor = eventList.get(eventList.size() - 1);
        long expectedEventsCount = eventList.stream().filter(current -> current.getEventLocation().equals(eventToSeachFor.getEventLocation())).count();
        CustomerEventsFilterSearchCriteria filterSearchCriteria = new CustomerEventsFilterSearchCriteria(eventToSeachFor.getEventLocation(), null, null, null);

        mockMvc.perform(MockMvcRequestBuilders.get("/customer/all-events?location="+filterSearchCriteria.getLocation())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.length()").value(expectedEventsCount))
                .andExpect(jsonPath("$[0].eventName").value(eventToSeachFor.getEventName()))
                .andExpect(jsonPath("$[0].eventDescription").value(eventToSeachFor.getEventDescription()));

        verify(eventService, times(1)).getAllEventsBySearchCriteria(any());
    }


    @Test
    public void filterEvents_ByEventDate_thenReturnSuccess() throws Exception {

        Event eventToSearchFor = eventList.get(eventList.size() - 1);
        long expectedEventsCount = eventList.stream().filter(current -> current.getEventDateTime().toLocalDate().isEqual(eventToSearchFor.getEventDateTime().toLocalDate())).count();
        CustomerEventsFilterSearchCriteria filterSearchCriteria = new CustomerEventsFilterSearchCriteria(null, null, null,
                eventToSearchFor.getEventDateTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());

        mockMvc.perform(MockMvcRequestBuilders.get("/customer/all-events?eventDate="+filterSearchCriteria.getEventDate())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", hasSize((int) expectedEventsCount)))
                .andExpect(jsonPath("$[0].eventName").value(eventToSearchFor.getEventName()))
                .andExpect(jsonPath("$[0].eventDescription").value(eventToSearchFor.getEventDescription()));

        verify(eventService, times(1)).getAllEventsBySearchCriteria(any());
    }


    @Test
    public void filterEvents_ByEventType_thenReturnSuccess() throws Exception {

        Event eventToSearchFor = eventList.get(eventList.size() - 1);
        long expectedEventsCount = eventList.stream().filter(current -> current.getEventType().getTypeName().equals(eventToSearchFor.getEventType().getTypeName())).count();
        CustomerEventsFilterSearchCriteria filterSearchCriteria = new CustomerEventsFilterSearchCriteria(null, eventToSearchFor.getEventType().getTypeName(), null,
                null);
        mockMvc.perform(MockMvcRequestBuilders.get("/customer/all-events?eventType="+filterSearchCriteria.getEventType())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", hasSize((int) expectedEventsCount)))
                .andExpect(jsonPath("$[0].eventName").value(eventToSearchFor.getEventName()))
                .andExpect(jsonPath("$[0].eventDescription").value(eventToSearchFor.getEventDescription()));

        verify(eventService, times(1)).getAllEventsBySearchCriteria(any());
    }

    @Test
    public void filterEvents_ByEventName_thenReturnSuccess() throws Exception {

        Event eventToSearchFor = eventList.get(eventList.size() - 1);
        long expectedEventsCount = eventList.stream().filter(current -> current.getEventName().equals(eventToSearchFor.getEventName())).count();
        CustomerEventsFilterSearchCriteria filterSearchCriteria = new CustomerEventsFilterSearchCriteria(null, null, eventToSearchFor.getEventName(),
                null);
        mockMvc.perform(MockMvcRequestBuilders.get("/customer/all-events?name="+filterSearchCriteria.getName())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", hasSize((int) expectedEventsCount)))
                .andExpect(jsonPath("$[0].eventName").value(eventToSearchFor.getEventName()))
                .andExpect(jsonPath("$[0].eventDescription").value(eventToSearchFor.getEventDescription()));

        verify(eventService, times(1)).getAllEventsBySearchCriteria(any());
    }

}