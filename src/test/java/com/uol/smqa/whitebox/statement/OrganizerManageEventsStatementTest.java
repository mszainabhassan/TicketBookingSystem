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
import org.junit.jupiter.api.Assertions;
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
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
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

    @Autowired
    private ObjectMapper objectMapper;

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
    public void organizerViewEvents_WithValidOrganizerId_thenReturnSuccess() throws Exception {
        Event eventToSearchFor = eventList.get(eventList.size() - 1);
        long expectedOrganizerEventsCount = eventList.stream().filter(current -> current.getOrganizer().getOrganizerId() == eventToSearchFor.getOrganizer().getOrganizerId()).count();

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events?organizerId="+eventToSearchFor.getOrganizer().getOrganizerId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Successfully retrieved all organizers"))
                .andExpect(jsonPath("$.data").isNotEmpty())
                .andExpect(jsonPath("$.data", hasSize((int) expectedOrganizerEventsCount)));

        verify(eventService, times(1)).getAllEventsByOrganizerId(anyInt());
    }


    @Test
    public void organizerViewEvents_WithInvalidOrganizerId_thenReturnNotFoundError() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events?organizerId="+ 14444444)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Organizer with id does not exist"));


        verify(eventService, times(1)).getAllEventsByOrganizerId(anyInt());
    }

    @Test
    public void organizerViewEvents_WithUnexpectedSystemError_thenReturnInternalServerError() throws Exception {
        Event eventToSearchFor = eventList.get(eventList.size() - 1);

        doThrow(new Exception("An error occurred while retrieving events for organizer"))
                .when(eventService).getAllEventsByOrganizerId(anyInt());

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events?organizerId="+ eventToSearchFor.getOrganizer().getOrganizerId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while retrieving events for organizer"));


        verify(eventService, times(1)).getAllEventsByOrganizerId(anyInt());
    }





    @Test
    public void organizerEditEvent_WithValidRequestBody_thenReturnSuccess() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        eventToEdit.setEventName("Edited event name");

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/events/"+ eventToEdit.getEventId())
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToEdit)))
                .andDo(print())
                .andExpect(status().isNoContent())
                .andExpect(jsonPath("$.message").value("Successfully updated event"));

        verify(eventService, times(1)).updateEvent(any(Event.class));

        Event updatedEventFromDatabase = eventRepository.findById(eventToEdit.getEventId());
        Assertions.assertNotNull(updatedEventFromDatabase);
        Assertions.assertEquals(eventToEdit.getEventName(), updatedEventFromDatabase.getEventName());
    }

}