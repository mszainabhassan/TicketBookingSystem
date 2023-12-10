package com.uol.smqa.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uol.smqa.Enum.Gender;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Event;
import com.uol.smqa.model.EventType;
import com.uol.smqa.model.Organizer;
import com.uol.smqa.model.WishList;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.repository.EventRepository;
import com.uol.smqa.repository.WishListRepository;

@Component
public class WishListGenerator {
	@Autowired
	private WishListRepository wishListRepository;
	@Autowired
	private CustomerRepository customerRepository;
	 @Autowired
	    private EventRepository eventRepository;
	 
	
	 
	 @Autowired
	 private EventGenerator eventGenerator;
	 public List<WishList> generateWishLists() {
	        List<WishList> wishLists = new ArrayList<>();
	        List<Customer> customerList = generateCustomers();
	        List<Event> eventList = generateEvents();
	        // Creating 5 events and adding them to the list
	        for (int i = 0; i < 5; i++) {
	            WishList wishList = createWishList(i + 1, customerList,eventList); // Event IDs start from 1
	            wishLists.add(wishList);
	        }

	        return wishListRepository.saveAll(wishLists);
	    }
	 
	 private WishList createWishList(int wishListId, List<Customer> customerList,List<Event> eventList) {
	       
	        Customer customer = getRandomCustomer(customerList);
	        Event event = getRandomEvent(eventList);
	        
	        return new WishList(customer,event);
	    }

	 private Customer getRandomCustomer(List<Customer> customerList) {
	        Random random = new Random();
	        return customerList.get(random.nextInt(customerList.size()));
	    }
	 
	 private Event getRandomEvent(List<Event> eventList) {
	        Random random = new Random();
	        return eventList.get(random.nextInt(eventList.size()));
	    }


	    private List<Customer> generateCustomers() {
	        List<Customer> customerList = new ArrayList<>();
	        for (int i = 0; i < 5; i++) {
	            customerList.add(generateRandomCustomer(i));
	        }

	        return customerRepository.saveAll(customerList);
	    }
	    
	    private List<Event> generateEvents() {
	        List<Event> eventList = new ArrayList<>();
	        List<Organizer> organizerList = eventGenerator.generateOrganizers();
	        for (int i = 0; i < 5; i++) {
	            eventList.add(generateRandomEvent(i,organizerList));
	        }

	        return eventRepository.saveAll(eventList);
	    }

	    public Customer generateRandomCustomer(int id) {
	        Random random = new Random();

	        String name = "Random Customer" + id; // Example: generateRandomString(8)
	        String email = "customer" + id + "@uol.com"; // Example: generateRandomEmail(name, orgName)
	        LocalDate dob = LocalDate.of(1990, 4, 12); // Example: generateRandomDOB()
	        Gender gender = Gender.values()[random.nextInt(Gender.values().length)]; // Example: random gender from Enum
	        String contactNumber = "+99 888 777 223" + id; // Example: generateRandomPhoneNumber()
	        Boolean isMemberBoolean=true;
	        Boolean isNotify=true;
	        return new Customer(name,  email, dob, gender, contactNumber,isMemberBoolean,isNotify);
	    }
	    
	    public Event generateRandomEvent(int eventId, List<Organizer> organizerList) {
	        Random random = new Random();
	        String eventName = "Event " + eventId;
	        String eventDescription = "Description for Event " + eventId;
	        String eventLocation = "Location " + eventId;
	        LocalDateTime eventDateTime = LocalDateTime.now().plusMonths(12); // Replace with actual date and time
	        Integer seatsAvailable = 100; // Replace with available seats count
	        Integer noOfPrioritySeats = 20; // Replace with priority seats count
	        Integer availablePrioritySeatsInteger = 15; // Replace with available priority seats count
	        Float prioritySeatFees = 10.0f; // Replace with priority seat fees
	        Float eventFees = 20.0f; // Replace with event fees
	        EventType eventType = eventGenerator.getOrCreateEventType(); // Replace with actual event type
	        Boolean isLimitedSeats = true; // Replace with true or false
	        String eventFrequency = "WEEKLY"; // Replace with event frequency
	        Boolean status = true; // Replace with true or false
	        Organizer organizer = eventGenerator.getRandomOrganizer(organizerList);

	        return new Event(eventName, eventDescription, eventLocation, eventDateTime,
	                seatsAvailable, noOfPrioritySeats, availablePrioritySeatsInteger, prioritySeatFees,
	                eventFees, eventType, isLimitedSeats, eventFrequency, status, organizer);
	       }
}