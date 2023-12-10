package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.controller.CustomerController;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Users;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.ReviewRepository;
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
import java.util.ArrayList;
import java.util.List;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CustomerControllerStatementTest extends TicketBookingSystemApplicationTests {

    private CustomerController customerController;

    @SpyBean
    private CustomerService customerService;

    @SpyBean
    private CustomerBookEventService customerBookEventService;

    @SpyBean
    private WishListService wishListService;

    @SpyBean
    private EventService eventService;

    @Autowired
    private EventGenerator eventGenerator;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;
    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        customerController = new CustomerController(customerService, customerBookEventService, wishListService, eventService, eventRepository, reviewRepository);
        mockMvc = MockMvcBuilders.standaloneSetup(customerController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();

        eventList = eventGenerator.generateEvents();
    }

    @Test
    public void CustomerBookMultipleTicket_WithValidCredentials_thenReturnSuccess() throws Exception {

        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(customer);

        Event eventToBookTicket = eventList.get(eventList.size() - 1);

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/bookMultipleTicketforEvent/{eventId}", eventToBookTicket.getEventId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(customer)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("Tickets Booked Successfully. Booking ID")));


        verify(customerBookEventService, times(1)).findByCustomerAndEvent(any(Customer.class), any(Event.class));
    }


    @Test
    public void CustomerBookMultipleTicket_WithInvalidEventId_thenReturnNotFoundResponse() throws Exception {

        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(customer);

        Event eventToBookTicket = eventList.get(eventList.size() - 1);

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/bookMultipleTicketforEvent/{eventId}", 999999)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(customer)))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$", containsString("Event not found with ID:")));


        verify(customerBookEventService, times(0)).findByCustomerAndEvent(any(Customer.class), any(Event.class));
    }

    @Test
    public void CustomerBookMultipleTicket_WithEmptyCustomer_thenReturnNotFoundResponse() throws Exception {

        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/bookMultipleTicketforEvent/{eventId}", 999999)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(customer)))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$", containsString("Invalid customer ID")));


        verify(customerBookEventService, times(0)).findByCustomerAndEvent(any(Customer.class), any(Event.class));
    }

}