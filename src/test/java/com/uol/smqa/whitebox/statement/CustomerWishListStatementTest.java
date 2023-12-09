package com.uol.smqa.whitebox.statement;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.CustomerController;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Users;
import com.uol.smqa.model.WishList;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.ReviewRepository;
import com.uol.smqa.repository.WishListRepository;
import com.uol.smqa.service.CustomerBookEventService;
import com.uol.smqa.service.CustomerService;
import com.uol.smqa.service.EventService;
import com.uol.smqa.service.WishListService;
import com.uol.smqa.util.WishListGenerator;

public class CustomerWishListStatementTest extends TicketBookingSystemApplicationTests {
	 private CustomerController customerController;

	    @SpyBean
	    private CustomerService customerService;

	    @Autowired
	    private  CustomerBookEventService customerBookEventService;
	    @SpyBean
	    private  WishListService wishlistService;
	    @Autowired
	    private  EventService eventService;
	    @Autowired
	    private  EventRepository eventRepository;
	    @Autowired
	    private  ReviewRepository reviewRepository;
	    
	    @Autowired
	    private WishListRepository wishListRepository;


	    @Autowired
	    private ObjectMapper objectMapper;

	    private MockMvc mockMvc;

	    @Autowired
		private CustomerRepository customerRepository;
	    @Autowired
		 private WishListGenerator wishListGenerator;

	    private List<WishList> wishLists = new ArrayList<>();
	    @Before
	    public void setup() {
	        MockitoAnnotations.initMocks(this);
	        customerController = new CustomerController(customerService, customerBookEventService, wishlistService, eventService, eventRepository, reviewRepository);
	        mockMvc = MockMvcBuilders.standaloneSetup(customerController)
	                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
	                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
	                .build();
	        wishLists = wishListGenerator.generateWishLists();
	    }
	   
	    @Test
	    public void testGetCustomerWishList_Success() throws Exception {
	    	List<WishList>list=this.wishListRepository.saveAll(wishLists);
	    	System.out.println(list.size()+"----");
	    	
	    	int customerId=list.get(0).getCustomer().getCustomerId();
	    	System.out.println("Cust:"+customerId);
	        mockMvc.perform(MockMvcRequestBuilders.get("/customer/getCustomerWishList")
	                .param("customerId", String.valueOf(customerId)))
	                .andExpect(status().isOk());

	        verify(wishlistService, times(1)).getCustomerWishList(anyInt());
	    }

	    @Test
	   public void testGetCustomerWishList_CustomerNotFound() throws Exception {
	        int customerId = 20;

	        mockMvc.perform(MockMvcRequestBuilders.get("/customer/getCustomerWishList")
	                .param("customerId", String.valueOf(customerId)))
	                .andExpect(status().isNotFound());

	           verify(wishlistService, times(1)).getCustomerWishList(anyInt());
	    }
	  
}
