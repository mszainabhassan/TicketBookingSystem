package com.uol.smqa.whitebox.statement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.uol.smqa.Enum.EventFrequency;
import com.uol.smqa.Enum.Gender;
import com.uol.smqa.TicketBookingSystemApplicationTests;
import com.uol.smqa.advice.CustomExceptionHandler;
import com.uol.smqa.advice.GlobalControllerAdvice;
import com.uol.smqa.controller.OrganizerController;
import com.uol.smqa.model.*;
import com.uol.smqa.repository.*;
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

    @Autowired
    private EventGenerator eventGenerator;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private AdminService adminService;

    @SpyBean
    private EventReviewService eventReviewService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EventReviewRepository eventReviewRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ReviewReplyRepository reviewReplyRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private EventTypeRepository eventTypeRepository;

    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;
    private List<Event> eventList = new ArrayList<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        organizerController = new OrganizerController(eventTypeService, organizerService, eventService, adminService, eventReviewService);
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

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events")
                        .param("organizerId", String.valueOf(eventToSearchFor.getOrganizer().getOrganizerId()))
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

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events")
                        .param("organizerId", String.valueOf(14444444))
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
                .when(eventService).getAllEventsByOrganizerId(eq(eventToSearchFor.getOrganizer().getOrganizerId()));

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events")
                        .param("organizerId", String.valueOf(eventToSearchFor.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while retrieving events for organizer"));


        verify(eventService, times(1)).getAllEventsByOrganizerId(eq(eventToSearchFor.getOrganizer().getOrganizerId()));
    }





    @Test
    public void organizerEditEvent_WithValidRequestBody_thenReturnSuccess() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        eventToEdit.setEventName("Edited event name");

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/events/{eventId}", eventToEdit.getEventId())
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


    @Test
    public void organizerEditEvent_WithInvalidEventId_thenReturnNotFoundError() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        eventToEdit.setEventName("Edited event name");

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/events/{eventId}", 28999999)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToEdit)))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Event with id does not exist"));

        verify(eventService, times(0)).updateEvent(any(Event.class));
    }


    @Test
    public void organizerEditEvent_WithInvalidEventFrequency_thenReturnBadRequestError() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);
        eventToEdit.setEventFrequency("Invalid Frequency");

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/events/{eventId}", eventToEdit.getEventId())
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToEdit)))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message", containsString("Invalid event frequency. Valid values are")));

        verify(eventService, times(0)).updateEvent(any(Event.class));
    }


    @Test
    public void organizerEditEvent_WithAnotherOrganizerEventId_thenReturnAuthorizationError() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);

        Optional<Event> eventOfAnotherOrganizer = eventList.stream().filter(event -> event.getOrganizer().getOrganizerId() != eventToEdit.getOrganizer().getOrganizerId()).findFirst();
        Assertions.assertTrue(eventOfAnotherOrganizer.isPresent());


        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/events/{eventId}", eventOfAnotherOrganizer.get().getEventId())
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToEdit)))
                .andDo(print())
                .andExpect(status().isForbidden())
                .andExpect(jsonPath("$.message").value("You can not update an event that does not belong to you"));

        verify(eventService, times(0)).updateEvent(any(Event.class));
    }


    @Test
    public void organizerEditEvent_WithUnexpectedError_thenReturnInternalServerError() throws Exception {
        Event eventToEdit = eventList.get(eventList.size() - 1);


        doThrow(new Exception("An error occurred while updating organizer"))
                .when(eventService).updateEvent(any(Event.class));

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/events/{eventId}", eventToEdit.getEventId())
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(eventToEdit)))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while updating events for organizer"));

        verify(eventService, times(1)).updateEvent(any(Event.class));
    }



    @Test
    public void organizerDeleteEvent_WithValidRequestBody_thenReturnSuccess() throws Exception {
        Event eventToDelete = eventList.get(eventList.size() - 1);

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/events/{eventId}", eventToDelete.getEventId())
                        .param("organizerId", String.valueOf(eventToDelete.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNoContent())
                .andExpect(jsonPath("$.message").value("Successfully deleted event"));

        verify(eventService, times(1)).deleteEventByOrganizerId(anyInt(), anyInt());

        Event updatedEventFromDatabase = eventRepository.findById(eventToDelete.getEventId());
        Assertions.assertNull(updatedEventFromDatabase);
    }


    @Test
    public void organizerDeleteEvent_WithInvalidEventId_thenReturnNotFoundError() throws Exception {
        Event eventToDelete = eventList.get(eventList.size() - 1);

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/events/{eventId}", 100000000)
                        .param("organizerId", String.valueOf(eventToDelete.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Event with id does not exist"));

        verify(eventService, times(1)).deleteEventByOrganizerId(anyInt(), anyInt());
    }

    @Test
    public void organizerDeleteEvent_WithUnexpectedError_thenReturnInternalServerError() throws Exception {
        Event eventToDelete = eventList.get(eventList.size() - 1);

        doThrow(new Exception("An error occurred while deleting organizer"))
                .when(eventService).deleteEventByOrganizerId(anyInt(), anyInt());

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/events/{eventId}", eventToDelete.getEventId())
                        .param("organizerId", String.valueOf(eventToDelete.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while deleting organizer"));

        verify(eventService, times(1)).deleteEventByOrganizerId(anyInt(), anyInt());
    }

    @Test
    public void organizerDeleteEvent_WithCustomerBookings_thenReturnBadRequest() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToDelete = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToDelete.getEventId(), newCustomer);

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/events/{eventId}", eventToDelete.getEventId())
                        .param("organizerId", String.valueOf(eventToDelete.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("You can not delete an event that already has bookings"));

        verify(eventService, times(1)).deleteEventByOrganizerId(anyInt(), anyInt());
    }


    @Test
    public void organizerViewEventReviews_thenReturnSuccessResponse() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events/{eventId}/reviews", eventToViewReviews.getEventId())
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Successfully retrieved reviews"));

        verify(eventReviewService, times(1)).getAllEventsReviewsByOrganizer(anyInt(), anyInt());
    }


    @Test
    public void organizerViewEventReviews_WithInvalidEventId_thenReturnNotFoundError() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events/{eventId}/reviews", 888777666)
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Event with id not found"));

        verify(eventReviewService, times(1)).getAllEventsReviewsByOrganizer(anyInt(), anyInt());
    }

    @Test
    public void organizerViewEventReviews_WithInvalidOrganizerId_thenReturnNotFoundError() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);

        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/events/{eventId}/reviews", eventToViewReviews.getEventId())
                        .param("organizerId", String.valueOf(999888777))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Organizer with id does not exist"));

        verify(eventReviewService, times(1)).getAllEventsReviewsByOrganizer(anyInt(), anyInt());
    }

    @Test
    public void organizerReplyEventReviews_WithValidRequest_thenReturnSuccess() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Successfully replied to review"));

        verify(eventReviewService, times(1)).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }



    @Test
    public void organizerReplyEventReviews_WithInvalidReviewId_thenReturnNotFound() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/event-reviews/{reviewId}/reply", 999911122)
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Event review id not found. Please specify a valid review in the request"));

        verify(eventReviewService, times(1)).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }


    @Test
    public void organizerReplyEventReviews_WithInvalidUser_thenReturnBadRequestResponse() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, null, true);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Please provide a valid reply user"));

        verify(eventReviewService, times(1)).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }

    @Test
    public void organizerReplyEventReviews_WithInvalidReviewDetails_thenReturnBadRequestResponse() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), null, eventToViewReviews.getOrganizer().getUsers(), true);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Please provide a valid review"));

        verify(eventReviewService, times(1)).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }

    @Test
    public void organizerReplyEventReviews_WithInvalidOrganizer_thenReturnBadRequestResponse() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));

        Users organizerUser = eventToViewReviews.getOrganizer().getUsers();
        organizerUser.setOrganizer(null);
        usersRepository.save(organizerUser);

        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Only organizers can reply to this review"));

        verify(eventReviewService, times(1)).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }

    @Test
    public void organizerReplyEventReviews_WithUnexpectedException_thenReturnInternalServerError() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);

        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));

        Users organizerUser = eventToViewReviews.getOrganizer().getUsers();
        organizerUser.setOrganizer(null);
        usersRepository.save(organizerUser);


        doThrow(new Exception("An error occurred while replying event review"))
                .when(eventReviewService).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));

        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while replying event review"));

        verify(eventReviewService, times(1)).replyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }


    @Test
    public void organizerEditEventReviewReply_WithValidRequest_thenReturnSuccess() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        reviewReplyRepository.save(firstReply);

        firstReply.setReplyText("I really gained a lot from the program");

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Successfully updated review reply"));

        verify(eventReviewService, times(1)).editReplyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }



    @Test
    public void organizerEditEventReviewReply_WithUnexpectedException_thenReturnInternalServerError() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);

        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));

        Users organizerUser = eventToViewReviews.getOrganizer().getUsers();
        organizerUser.setOrganizer(null);
        usersRepository.save(organizerUser);


        doThrow(new Exception("An error occurred while editing event review reply"))
                .when(eventReviewService).editReplyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));

        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/event-reviews/{reviewId}/reply", review.getId())
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("An error occurred while editing event review reply"));

        verify(eventReviewService, times(1)).editReplyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }


    @Test
    public void organizerEditEventReviewReply_WithNonExistentReplyId_thenReturnBadRequest() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        reviewReplyRepository.save(firstReply);

        firstReply.setReplyText("I really gained a lot from the program");
        firstReply.setId(0);

        mockMvc.perform(MockMvcRequestBuilders.put("/organizer/event-reviews/{reviewId}/reply", 9999999)
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Please provide a valid reply id to edit"));

        verify(eventReviewService, times(1)).editReplyEventReviewsByOrganizer(anyInt(), any(ReviewReply.class));
    }


    @Test
    public void organizerDeleteEventReviewReply_WithValidRequest_thenReturnSuccess() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        reviewReplyRepository.save(firstReply);

        firstReply.setReplyText("I really gained a lot from the program");

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/event-reviews/reply/{replyId}", firstReply.getId())
                        .param("organizerId", String.valueOf(eventToViewReviews.getOrganizer().getOrganizerId()))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNoContent())
                .andExpect(jsonPath("$.message").value("Successfully deleted review reply"));

        verify(eventReviewService, times(1)).deleteReplyEventReviewsByOrganizer(anyInt(), anyInt());
    }


    @Test
    public void organizerDeleteEventReviewReply_WithInvalidOrganizerId_thenReturnNotFoundError() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        reviewReplyRepository.save(firstReply);

        firstReply.setReplyText("I really gained a lot from the program");

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/event-reviews/reply/{replyId}", firstReply.getId())
                        .param("organizerId", String.valueOf(9999))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Organizer with id does not exist"));

        verify(eventReviewService, times(1)).deleteReplyEventReviewsByOrganizer(anyInt(), anyInt());
    }


    @Test
    public void organizerDeleteEventReviewReply_ForAnotherOrganizerReply_thenReturnBadRequest() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);


        Event eventToViewReviews = eventList.get(eventList.size() - 1);
        customerBookEventService.bookEvent(eventToViewReviews.getEventId(), newCustomer);
        EventReview review = eventReviewRepository.save(new EventReview("Nice event. This was properly planned", 5, LocalDateTime.now(), eventToViewReviews, newCustomer.getUsers()));


        ReviewReply firstReply = new ReviewReply("Thanks for attending our event", LocalDateTime.now(), review, eventToViewReviews.getOrganizer().getUsers(), true);
        reviewReplyRepository.save(firstReply);

        firstReply.setReplyText("I really gained a lot from the program");

        Optional<Organizer> differentOrganizerOptional = organizerRepository.findFirstByOrganizerIdNot(eventToViewReviews.getOrganizer().getOrganizerId());
        Assertions.assertTrue(differentOrganizerOptional.isPresent());
        Organizer differentOrganizer = differentOrganizerOptional.get();

        mockMvc.perform(MockMvcRequestBuilders.delete("/organizer/event-reviews/reply/{replyId}", firstReply.getId())
                        .param("organizerId", String.valueOf(differentOrganizer.getOrganizerId()))
                        .content(objectMapper.writeValueAsString(firstReply))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("You can not delete a reply that does not belong to you"));

        verify(eventReviewService, times(1)).deleteReplyEventReviewsByOrganizer(anyInt(), anyInt());
    }



    @Test
    public void organizerCreateEvent_WithValidRequest_thenReturnSuccess() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);

        EventType eventType = eventTypeRepository.findAll().get(0);
        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, eventType, false, EventFrequency.MONTHLY.name(), true, organizer);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/createEvent")
                        .content(objectMapper.writeValueAsString(eventToCreate))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.eventName").value(eventToCreate.getEventName()))
                .andExpect(jsonPath("$.eventDescription").value(eventToCreate.getEventDescription()))
                .andExpect(jsonPath("$.eventLocation").value(eventToCreate.getEventLocation()))
                .andExpect(jsonPath("$.seatsAvailable").value(eventToCreate.getSeatsAvailable()));

        verify(eventService, times(1)).createEvent(any(Event.class));
    }


    @Test
    public void organizerCreateEvent_WithInvalidEventType_thenReturnBadRequestResponse() throws Exception {

        Customer newCustomer = new Customer("Random Customer", "customer@tbs.com", LocalDate.now().minusYears(25),
                Gender.FEMALE, "+99 888 777 6666", true, true, new Users("customer@tbs.com", "password"));
        this.customerRepository.save(newCustomer);

        Organizer organizer = organizerRepository.findAll().get(0);
        Event eventToCreate = new Event("Test Event Name", "TEst Event Description", "Test Event Location", LocalDateTime.now().plusYears(1),
                900, 50, 788, 800f,
                700f, new EventType("Non existing event name"), false, EventFrequency.MONTHLY.name(), true, organizer);

        mockMvc.perform(MockMvcRequestBuilders.post("/organizer/createEvent")
                        .content(objectMapper.writeValueAsString(eventToCreate))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$").value("Invalid event type"));

        verify(eventService, times(0)).createEvent(any(Event.class));
    }



    @Test
    public void organizerGetEventAnalytics_WithValidRequest_thenReturnSuccessResponse() throws Exception {

        Event event = eventList.get(eventList.size() - 1);
        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/eventAnalytics/{eventId}", event.getEventId())
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", containsString("Event Analytics for Event ID")));

        verify(eventService, times(1)).getEventById(anyInt());
    }


    @Test
    public void organizerGetEventAnalytics_WithUnexpectedError_thenReturnError() throws Exception {

        doThrow(new RuntimeException("An error occurred while retrieving events analytics"))
                .when(eventService).getEventById(anyInt());

        Event event = eventList.get(eventList.size() - 1);
        mockMvc.perform(MockMvcRequestBuilders.get("/organizer/eventAnalytics/{eventId}", event.getEventId())
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$", containsString("Error retrieving event analytics:")));

        verify(eventService, times(1)).getEventById(anyInt());
    }

}