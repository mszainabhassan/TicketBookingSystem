package com.uol.smqa.whitebox.statement;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AdminController;
import com.uol.smqa.controller.OrganizerController;
import com.uol.smqa.model.Event;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.service.AdminService;
import com.uol.smqa.service.CustomerBookEventService;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.EventTypeService;
import com.uol.smqa.service.OrganizerService;
import com.uol.smqa.service.WishListService;
import com.uol.smqa.util.EventGenerator;

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
    
//    @Test
//    public void testAdminCreateEvent_Success() throws Exception {
//        Event inputEvent = eventList.get(eventList.size() - 1);
//        mockMvc.perform(MockMvcRequestBuilders.post("/admin/createEvent")
//                .content(new ObjectMapper().writeValueAsString(inputEvent)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.message").value("Event created successfully"));
//
//       verify(eventService, times(1)).createEventByAdmin(inputEvent);
//    }

}
