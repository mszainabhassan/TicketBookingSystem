package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.controller.CustomerController;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.model.CardDetails;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
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
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MvcResult;

import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.uol.smqa.repository.CustomerBookEventRepository;

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
    private CustomerBookEventRepository customerBookEventRepository;
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
    
   
    
    @Test
    public void cancelBooking_WithIncorrectEventId_thenReturnNotFound() throws Exception {
        // Create a booking and save it to the repository
        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(customer);


        Event event = eventList.get(eventList.size() - 1);
        CustomerBookEvent booking = new CustomerBookEvent(event, customer);
        customerBookEventRepository.save(booking);

        // Attempt to cancel the booking with an incorrect event ID
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.delete("/cancelBooking/{bookingId}", 999999))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andReturn();

        // Extract the JSON response as a Map
        Map<String, Object> responseMap = new ObjectMapper().readValue(result.getResponse().getContentAsString(), Map.class);

        // Assert the values in the responseMap
        assertThat(responseMap.get("type"), is("about:blank"));
        assertThat(responseMap.get("title"), is("Not Found"));
        assertThat(responseMap.get("status"), is(404));
        assertThat(responseMap.get("detail"), is("No endpoint DELETE /cancelBooking/999999."));
        assertThat(responseMap.get("instance"), is("/cancelBooking/999999"));

        // Verify that the cancelEventBooking method was not called
        verify(customerBookEventService, times(0)).cancelEventBooking(any(Long.class));
    }

    @Test
    public void provideEventRating_WithCorrectBookingIdAndRating_thenReturnSuccess() throws Exception {
        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(customer);

        Event event = eventList.get(eventList.size() - 1);
        CustomerBookEvent booking = new CustomerBookEvent(event, customer);
        customerBookEventRepository.save(booking);

        mockMvc.perform(post("/customer/provideRating/{bookingId}", booking.getBookingId())
                        .param("rating", "4")
                        .param("review", "Great event!"))
                .andExpect(status().isOk())
                .andExpect(content().string("Rating and review provided successfully!"));

        // Verify that provideEventRating method was called with the correct parameters
        verify(customerBookEventService, times(1)).provideEventRating(booking.getBookingId(), 4, "Great event!");
    }

     
    @Test
    public void buyMembership_WithValidCredentials_thenReturnSuccess() throws Exception {
        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(customer);

        CardDetails cardDetails = new CardDetails();
        cardDetails.setCardNumber("123456789123");
        cardDetails.setExpiryDate("12/25");
        cardDetails.setCvv("123");

        mockMvc.perform(post("/customer/buymembership")
                .param("customerId", String.valueOf(customer.getCustomerId()))
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(cardDetails)))
        .andDo(print())  // This line will print the request and response
        .andExpect(status().isOk())	
        .andExpect(jsonPath("$.isMember").value(true));

        verify(customerService, times(1)).buyMembership(anyInt(), any(CardDetails.class));
    }


    @Test
    public void cancelMembership_WithInvalidInput_thenReturnBadRequest() throws Exception {
        // Providing an invalid customer ID that does not exist
        mockMvc.perform(MockMvcRequestBuilders.post("/customer/cancelmembership")
                        .param("customerId", "999999"))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Invalid customer ID"));
    }

    @Test
    public void cancelMembership_WithValidInput_thenReturnSuccess() throws Exception {
        // Create a customer with membership to be canceled
    	 Customer customer = new Customer("Dummy User", "dummyuser@example.com", LocalDate.parse("1990-01-01"),
    	            Gender.MALE, "+1234567890", true, false, new Users("dummyuser@example.com", "dummyPassword"));
    	    this.customerRepository.save(customer);

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/cancelmembership")
                        .param("customerId", String.valueOf(customer.getCustomerId())))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Successfully Canceled membership"))
                .andExpect(jsonPath("$.data.message").value("Successfully canceled membership"));
           
    }


    @Test
    public void cancelMembership_ForNonMember_thenReturnBadRequest() throws Exception {
        Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", false, false, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(customer);

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/cancelmembership")
                        .param("customerId", String.valueOf(customer.getCustomerId())))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Customer is not a member"));

    }

    

    @Test
    public void testBookEvent_SuccessfulBooking() throws Exception {

        Event eventToBookTicket = eventList.get(eventList.size() - 1);

    	Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("customerId", 1);
        requestBody.put("eventId", eventToBookTicket.getEventId());
    	 Customer customer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                 Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
         this.customerRepository.save(customer);

         mockMvc.perform( MockMvcRequestBuilders.post("/customer/bookEvent")
        		 .contentType(MediaType.APPLICATION_JSON)
        		 .content(asJsonString(requestBody)))
         	    .andExpect(status().isOk())
         	   .andExpect(jsonPath("$", containsString("Event booked successfully! Booking ID: ")));
                 

         verify(customerBookEventService, times(1)).bookEvent(anyInt(),any(Customer.class));
   
    }
    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}