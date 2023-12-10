package com.uol.smqa.whitebox.statement;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
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
import org.mockito.Spy;
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
import com.uol.smqa.util.EventGenerator;
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
	    
	    @SpyBean
	    private WishListRepository wishListRepository;


	    @Autowired
	    private ObjectMapper objectMapper;

	    private MockMvc mockMvc;

	    @Autowired
		private CustomerRepository customerRepository;
	    @Autowired
		 private WishListGenerator wishListGenerator;
	    @Autowired
	    private EventGenerator eventGenerator;

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
	    
	    @Test
	    public void testAddEventInWishList_Success() throws Exception {
	      
	    	List<WishList>list=this.wishListRepository.saveAll(wishLists);
	    	System.out.println(list.size()+"----");
	    	
	    	int customerId=list.get(0).getCustomer().getCustomerId();
	    	int eventId=list.get(0).getEvent().getEventId();
	        mockMvc.perform(MockMvcRequestBuilders.post("/customer/addEventInWishlist")
	                .param("eventId", String.valueOf(eventId))
	                .param("customerId", String.valueOf(customerId)))
	                .andExpect(status().isOk());

	        verify(wishlistService, times(1)).addEventInWishList(eventId, customerId);
	    }

	    @Test
	    public void testAddEventInWishList_Error() throws Exception {
	    	int eventId = 1;
	        int customerId = 2;
	       doThrow(new Exception("An error occurred while saving event in wishlist"))
        	.when(wishlistService).addEventInWishList(anyInt(), anyInt());

	        mockMvc.perform(MockMvcRequestBuilders.post("/customer/addEventInWishlist")
	                .param("eventId", String.valueOf(eventId))
	                .param("customerId", String.valueOf(customerId)))
	                .andExpect(status().isInternalServerError())
	                .andExpect(jsonPath("$.message").value("An error occurred while saving event in wishlist"));

	        verify(wishlistService, times(1)).addEventInWishList(anyInt(), anyInt());
	    }
	    
	    @Test
	    public void testAddEventInWishList_CustomerNotFound() throws Exception {
	    	List<WishList>list=this.wishListRepository.saveAll(wishLists);
	    	int eventId=list.get(0).getEvent().getEventId();
	        int customerId = 50;
	       	        mockMvc.perform(MockMvcRequestBuilders.post("/customer/addEventInWishlist")
	                .param("eventId", String.valueOf(eventId))
	                .param("customerId", String.valueOf(customerId)))
	                .andExpect(status().isNotFound())
	                .andExpect(jsonPath("$.message").value("Customer Id Not Found"));

	        verify(wishlistService, times(1)).addEventInWishList(anyInt(), anyInt());
	    }
	    
	    @Test
	    public void testAddEventInWishList_EventNotFound() throws Exception {
	    	List<WishList>list=this.wishListRepository.saveAll(wishLists);
	    	int customerId=list.get(0).getCustomer().getCustomerId(); 	
	    	int eventId = 50;
	       	        mockMvc.perform(MockMvcRequestBuilders.post("/customer/addEventInWishlist")
	                .param("eventId", String.valueOf(eventId))
	                .param("customerId", String.valueOf(customerId)))
	                .andExpect(status().isNotFound())
	                .andExpect(jsonPath("$.message").value("Event Id Not Found"));

	        verify(wishlistService, times(1)).addEventInWishList(anyInt(), anyInt());
	    }
	    
	    @Test
	    public void testDeleteEventFromWishList_Success() throws Exception {
	    	List<WishList>list=this.wishListRepository.saveAll(wishLists);
	    	
	    	int wishlistId = list.get(0).getWishlist_id();
	        mockMvc.perform(MockMvcRequestBuilders.delete("/customer/deleteEventFromWishList")
	                .param("wishlistId", String.valueOf(wishlistId)))
	                .andExpect(status().isOk())
	                .andExpect(jsonPath("$.message").value("Successfully deleted event from wishlist"));

	       verify(wishlistService, times(1)).deleteEventFromWishList(wishlistId);
	    }

	    @Test
	    public void testDeleteEventFromWishList_NotFound() throws Exception {
	        int wishlistId = 100;
	        mockMvc.perform(MockMvcRequestBuilders.delete("/customer/deleteEventFromWishList")
	                .param("wishlistId", String.valueOf(wishlistId)))
	                .andExpect(status().isNotFound())
	                .andExpect(jsonPath("$.message").value("WishList Id Not Found"));

	        verify(wishlistService, times(1)).deleteEventFromWishList(wishlistId);
	    }

	    @Test
	    public void testDeleteEventFromWishList_InternalServerError() throws Exception {
	        int wishlistId = 1;
	        
	        doThrow(new Exception("An error occurred while deleting event from wishlist"))
	        .when(wishlistService).deleteEventFromWishList(anyInt());
	        
	        mockMvc.perform(MockMvcRequestBuilders.delete("/customer/deleteEventFromWishList")
	                .param("wishlistId", String.valueOf(wishlistId)))
	                .andExpect(status().isInternalServerError())
	                .andExpect(jsonPath("$.message").value("An error occurred while deleting event from wishlist"));

	      verify(wishlistService, times(1)).deleteEventFromWishList(anyInt());
	    }
}
