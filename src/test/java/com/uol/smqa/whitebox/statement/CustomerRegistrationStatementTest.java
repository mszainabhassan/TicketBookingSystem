package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.CustomerController;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Users;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.ReviewRepository;
import com.uol.smqa.service.CustomerBookEventService;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.WishListService;
import com.uol.smqa.util.EventGenerator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class CustomerRegistrationStatementTest extends TicketBookingSystemApplicationTests {

    private CustomerController customerController;

    @SpyBean
    private CustomerService customerService;

    @Autowired
    private  CustomerBookEventService customerBookEventService;
    @Autowired
    private  CustomerBookEventRepository customerBookEventRepository;
    @Autowired
    private  WishListService wishlistService;
    @Autowired
    private  EventService eventService;
    @Autowired
    private  EventRepository eventRepository;
    @Autowired
    private  ReviewRepository reviewRepository;


    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;

    @Autowired
	private CustomerRepository customerRepository;
    
    @Autowired
    private EventGenerator eventGenerator;
    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        customerController = new CustomerController(customerService, customerBookEventService, wishlistService, eventService, eventRepository, reviewRepository);
        mockMvc = MockMvcBuilders.standaloneSetup(customerController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();
        eventList = eventGenerator.generateEvents();
    }

    @Test
    public void whenCustomerRegisters_thenReturnSuccess() throws Exception {

        Customer customerToRegister = new Customer("Zainab", "Zainab@tbs.com", LocalDate.now().minusYears(30),
                Gender.FEMALE, "+99 888 777 6665", true, true, new Users("Zainab@tbs.com", "password"));
        mockMvc.perform(MockMvcRequestBuilders.post("/customer/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(customerToRegister)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Customer Registered Successfully!"))
                .andExpect(jsonPath("$.data.name").value(customerToRegister.getName()))
                .andExpect(jsonPath("$.data.email").value(customerToRegister.getEmail()));


        verify(customerService, times(1)).CustomerRegistration(any(Customer.class));
    }
    
    @Test
    public void whenCustomerRegistersWithDuplicateEmail_thenReturnConflict() throws Exception {
        Customer existingCustomer = new Customer("Existing", "existing@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("existing@tbs.com", "password"));
        this.customerRepository.save(existingCustomer);

        Customer existingCustomerClone = new Customer("Existing", "existing@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("existing@tbs.com", "password"));

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(existingCustomerClone)))
                .andDo(print())
                .andExpect(status().isConflict())
                .andExpect(jsonPath("$.message").value("Duplicate customer Email!"));

      verify(customerService, times(1)).CustomerRegistration(any(Customer.class));
    }

    @Test
    public void whenInternalErrorOccursDuringRegistration_thenReturnInternalServerError() throws Exception {
        Customer customerToRegister = new Customer("John", "john@example.com", LocalDate.now().minusYears(30),
               Gender.MALE, "+99 888 777 6665", true, true, null);
     
        mockMvc.perform(MockMvcRequestBuilders.post("/customer/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(customerToRegister)))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while registering customer"));

        verify(customerService, times(1)).CustomerRegistration(any(Customer.class));
    }
    
    @Test
    public void customerGetEventAnalytics_WithValidRequest_thenReturnSuccessResponse() throws Exception {
    	 Customer existingCustomer = new Customer("Existing", "existing@tbs.com", LocalDate.now().minusYears(25),
                 Gender.FEMALE, "+99 888 777 6666", true, true, new Users("existing@tbs.com", "password"));
         this.customerRepository.save(existingCustomer);
       int customerId=existingCustomer.getCustomerId();
       Event eventToBook = eventList.get(eventList.size() - 1);
       CustomerBookEvent customerBookEvent = new CustomerBookEvent(eventToBook,existingCustomer);;
       this.customerBookEventRepository.save(customerBookEvent);
       mockMvc.perform(MockMvcRequestBuilders.get("/customer/getAnalytics")
        		 .param("customerId", String.valueOf(customerId))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", containsString("Customer Analytics for CustomerId:")));

        verify(customerService, times(1)).getAnalytics(anyInt());
    }
    @Test
    public void customerGetEventAnalytics_WithInValidCustomerIdRequest_thenReturnNotFoundResponseMessage() throws Exception {
    	int customerId=10;
        mockMvc.perform(MockMvcRequestBuilders.get("/customer/getAnalytics")
         		 .param("customerId", String.valueOf(customerId))
                         .contentType(MediaType.APPLICATION_JSON_VALUE))
                 .andDo(print())
                 .andExpect(status().isOk())
                 .andExpect(jsonPath("$").isNotEmpty())
                 .andExpect(jsonPath("$", containsString("Customer not found with ID: ")));

         verify(customerService, times(1)).getAnalytics(anyInt());
    
    }
    @Test
    public void customerGetEventAnalytics_WithInValidRequest_thenReturnInternalServerError() throws Exception {
    	int customerId=10;
    	 doThrow(new Exception("Error retrieving customer analytics:"))
     	.when(customerService).getAnalytics(anyInt());
        mockMvc.perform(MockMvcRequestBuilders.get("/customer/getAnalytics")
         		 .param("customerId", String.valueOf(customerId))
                         .contentType(MediaType.APPLICATION_JSON_VALUE))
                 .andDo(print())
                 .andExpect(status().isOk())
                 .andExpect(jsonPath("$").isNotEmpty())
                 .andExpect(jsonPath("$", containsString("Error retrieving customer analytics: ")));

         verify(customerService, times(1)).getAnalytics(anyInt());
    
    }
}