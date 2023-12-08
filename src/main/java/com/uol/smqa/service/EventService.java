package com.uol.smqa.service;



import com.uol.smqa.dtos.request.CustomerEventsFilterSearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Event;
import com.uol.smqa.repository.EventRepository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.uol.smqa.Enum.EventFrequency;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.BadRequestException;
import com.uol.smqa.exceptions.ResourceNotFoundException;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.CustomerRepository;

import static com.uol.smqa.dtos.specifications.EventSpecification.buildSearchPredicate;

@Service
public class EventService {

    private final EventTypeService eventTypeService;
	private final EventRepository eventRepository;
	private final CustomerRepository customerRepository;
	private final OrganizerServiceInterface organizerService;
	private final CustomerBookEventRepository customerBookEventRepository;
	private final EmailService emailService;

	@Autowired
	public EventService(EventRepository eventRepository,
						CustomerRepository customerRepository,
						EventTypeService eventTypeService,
						CustomerBookEventRepository customerBookEventRepository,
						OrganizerServiceInterface organizerService, EmailService emailService) {
		this.eventRepository = eventRepository;
		this.organizerService = organizerService;
		this.customerRepository = customerRepository;
		this.eventTypeService = eventTypeService;
		this.customerBookEventRepository = customerBookEventRepository;
		this.emailService = emailService;
	}

	public String ChangeEventStatus(int eventId, Boolean status) {
		Event event = this.eventRepository.findById(eventId);

		if (event != null) {
			event.setStatus(status);
			this.eventRepository.save(event);
			return "Event Status Changed!";
		} else {
			return "Event Id not present!";
		}
	}

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

	public List<Event> getAllEvents() {
		return this.eventRepository.findAll();
	}

	public List<Event> getAllEventsBySearchCriteria(CustomerEventsFilterSearchCriteria searchCriteria) {
		 return this.eventRepository.findAll(buildSearchPredicate(searchCriteria));
	}

	public List<Event> getAllEventsByOrganizerId(int organizerId) throws Exception {
		Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
		return this.eventRepository.findAllByOrganizer(organizer);
	}


	public void deleteEventByOrganizerId(int eventId, int organizerId) throws Exception {
		Organizer organizer = organizerService.findById(organizerId).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));
		Event event = eventRepository.findById(eventId);
		if (event == null) throw new ResourceNotFoundException("Event with id does not exist");
		if (event.getOrganizer() != organizer) throw new AuthorizationException("You can not delete an event that does not belong to you");
		this.eventRepository.deleteByEventIdAndOrganizer(event.getEventId(), organizer);
	}

	public void validateEventCreationRequest(Event eventRequest) {
		validateEventRequest(eventRequest);
	}

	private void validateEventRequest(Event eventRequest) {
		List<String> eventFrequencies = Arrays.stream(EventFrequency.values()).map(Enum::name).collect(Collectors.toList());
		if (eventRequest.getEventFrequency() != null && !eventFrequencies.contains(eventRequest.getEventFrequency())) {
			throw new BadRequestException("Invalid event frequency. Valid values are " + Arrays.stream(EventFrequency.values()).map(Enum::name).collect(Collectors.joining(", ")));
		}
		organizerService.findById(eventRequest.getOrganizer().getOrganizerId()).orElseThrow(() -> new ResourceNotFoundException("Organizer with id does not exist"));

		if (eventRequest.getEventDateTime().isBefore(LocalDateTime.now())) throw new AuthorizationException("This event is in the past. Kindly check again");

	}

	public void validateEventUpdateRequest(int eventId, Event eventToUpdate) {
		validateEventRequest(eventToUpdate);
		Event event = eventRepository.findById(eventId);
		if (event == null) throw new ResourceNotFoundException("Event with id does not exist");
		if (event.getOrganizer().getOrganizerId() != eventToUpdate.getOrganizer().getOrganizerId()) throw new AuthorizationException("You can not update an event that does not belong to you");
	}

	public Event updateEvent(Event event) throws Exception {
		return this.eventRepository.save(event);
	}

	public String deleteEvent(int eventId) {
		Event event = this.eventRepository.findById(eventId);

		if (event != null) 
		{	this.eventRepository.delete(event);
		return "Event: "+eventId+" deleted Successfully!";}
		else {
			return "Event not found!";
		}
	}

    public Event bookEvent(Integer eventId, Integer customerId) {
        Event event = getEventById(eventId);
        Customer customer = customerRepository.findById(customerId).orElseThrow();

        CustomerBookEvent booking = new CustomerBookEvent();
        booking.setCustomer(customer);
        booking.setEvent(event);

        customerBookEventRepository.save(booking);

        // Update the list of booked customers in the event
        List<CustomerBookEvent> bookedCustomers = event.getBookedCustomers();
        bookedCustomers.add(booking);
        event.setBookedCustomers(bookedCustomers);

        return eventRepository.save(event);
    }

    public int getNumberOfBookedUsers(Integer eventId) {
        Event event = getEventById(eventId);

        // Get the number of booked customers for the event
        List<CustomerBookEvent> bookedCustomers = event.getBookedCustomers();
        return bookedCustomers.size();
    }

    public Event getEventById(Integer eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId));
    }

    public void sendEventNotifications(Event event) {
        List<Customer> optedInCustomers = customerRepository.findByIsNotificationOn(true);

        for (Customer customer : optedInCustomers) {
            emailService.sendEventNotification(
                    customer.getEmail(),
                    event.getEventName(),
                    event.getEventLocation(),
                    event.getEventDateTime()
            );
        }
    }


}
