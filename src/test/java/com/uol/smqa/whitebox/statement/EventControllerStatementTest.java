package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.DiscountType;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.AuthController;
import com.uol.smqa.controller.EventController;
import com.uol.smqa.dtos.request.DiscountRequestDTO;
import com.uol.smqa.dtos.request.LoginRequestDTO;
import com.uol.smqa.model.Discount;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.DiscountRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.OrganizerRepository;
import com.uol.smqa.service.AuthService;
import com.uol.smqa.service.EventService;
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

import java.util.ArrayList;
import java.util.List;

import static com.uol.smqa.utils.Constants.INVALID_LOGIN_CREDENTIALS_MESSAGE;
import static com.uol.smqa.utils.Constants.SUCCESS_LOGIN_CREDENTIALS_MESSAGE;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EventControllerStatementTest extends TicketBookingSystemApplicationTests {

    private EventController eventController;

    @SpyBean
    private EventService eventService;

    @Autowired
    private EventGenerator eventGenerator;

    @Autowired
    private DiscountRepository discountRepository;

    @Autowired
    private EventRepository eventRepository;

    private MockMvc mockMvc;
    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        eventController = new EventController(eventService);
        mockMvc = MockMvcBuilders.standaloneSetup(eventController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new CustomExceptionHandler(), new GlobalControllerAdvice())
                .build();

        eventList = eventGenerator.generateEvents();
    }

    @Test
    public void CustomerApplyCouponCode_WithValidRequest_thenReturnSuccess() throws Exception {
        Event couponEvent = eventList.get(eventList.size() - 1);

        Discount discount = new Discount("0099887766", 900f, DiscountType.FIXED_AMOUNT, couponEvent.getOrganizer(), couponEvent);
        discountRepository.save(discount);

        DiscountRequestDTO discountRequestDTO = new DiscountRequestDTO(discount.getDiscountCode(), couponEvent.getEventId());

        mockMvc.perform(MockMvcRequestBuilders.post("/events/apply-coupon")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(discountRequestDTO)))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.message").value("Successfully applied discount"))
                .andExpect(jsonPath("$.discountAmount").isNotEmpty());

        verify(eventService, times(1)).applyCouponCode(any(DiscountRequestDTO.class));
    }

    @Test
    public void CustomerApplyCouponCode_WithForAnInvalidCouponCode_thenReturnNotFound() throws Exception {
        Event couponEvent = eventList.get(eventList.size() - 1);
        DiscountRequestDTO discountRequestDTO = new DiscountRequestDTO("0099887766", couponEvent.getEventId());

        mockMvc.perform(MockMvcRequestBuilders.post("/events/apply-coupon")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(discountRequestDTO)))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Invalid coupon code. Kindly check and try again"));

        verify(eventService, times(1)).applyCouponCode(any(DiscountRequestDTO.class));
    }


    @Test
    public void CustomerApplyCouponCode_WithForAnInvalidEventId_thenReturnNotFound() throws Exception {
        DiscountRequestDTO discountRequestDTO = new DiscountRequestDTO("0099887766", 999000777);

        mockMvc.perform(MockMvcRequestBuilders.post("/events/apply-coupon")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(discountRequestDTO)))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Invalid coupon code. Kindly check and try again"));

        verify(eventService, times(1)).applyCouponCode(any(DiscountRequestDTO.class));
    }


    @Test
    public void CustomerApplyCouponCode_ForEventWithInvalidFees_thenReturnNotFound() throws Exception {
        Event couponEvent = eventList.get(eventList.size() - 1);
        couponEvent.setEventFees(null);
        eventRepository.save(couponEvent);

        Discount discount = new Discount("0099887766", 900f, DiscountType.FIXED_AMOUNT, couponEvent.getOrganizer(), couponEvent);
        discountRepository.save(discount);

        DiscountRequestDTO discountRequestDTO = new DiscountRequestDTO("0099887766", couponEvent.getEventId());

        mockMvc.perform(MockMvcRequestBuilders.post("/events/apply-coupon")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(discountRequestDTO)))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Invalid event fees. Kindly contact administrator"));

        verify(eventService, times(1)).applyCouponCode(any(DiscountRequestDTO.class));
    }


    @Test
    public void CustomerApplyCouponCode_WithUnexpectedError_thenReturnInternalServerError() throws Exception {
        Event couponEvent = eventList.get(eventList.size() - 1);
        couponEvent.setEventFees(null);
        eventRepository.save(couponEvent);

        Discount discount = new Discount("0099887766", 900f, DiscountType.FIXED_AMOUNT, couponEvent.getOrganizer(), couponEvent);
        discountRepository.save(discount);

        DiscountRequestDTO discountRequestDTO = new DiscountRequestDTO("0099887766", couponEvent.getEventId());

        doThrow(new Exception("An unexpected error occurred while applying coupon code"))
                .when(eventService).applyCouponCode(any(DiscountRequestDTO.class));

        mockMvc.perform(MockMvcRequestBuilders.post("/events/apply-coupon")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(discountRequestDTO)))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An unexpected error occurred while applying coupon code"));

        verify(eventService, times(1)).applyCouponCode(any(DiscountRequestDTO.class));
    }





}