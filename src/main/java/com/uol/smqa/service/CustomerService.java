package com.uol.smqa.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.model.CustomerBookEvent;
import com.uol.smqa.repository.CustomerBookEventRepository;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.model.CardDetails;

import com.uol.smqa.repository.UsersRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CustomerService{

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private CustomerBookEventRepository customerBookEventRepository;
	

	public Customer CustomerRegistration(Customer customer) {
		customer.getUsers().setPassword(passwordEncoder.encode(customer.getUsers().getPassword()));
		Customer customer2= this.customerRepository.save(customer);
		customer2.setUsers(customer.getUsers());

		customer.getUsers().setCustomer(customer2);
		usersRepository.save(customer.getUsers());
		return customer2;
	}

	
	  public Customer buyMembership(int customerId, CardDetails cardDetails) {
	        
	        // Fetch customer details
	        Customer customer = customerRepository.findById(customerId).orElse(null);
	        if (customer == null) {
	            throw new IllegalArgumentException("Invalid customer ID");
	        }

	        // Validate card details
	        if (isValidCardDetails(cardDetails)) {
	        	
	            
	        	 customer.setIsMember(true);
	            // Save the updated customer back to the database
	            customerRepository.save(customer);
	            return customer;
	        } else {
	           
	            throw new IllegalArgumentException("Invalid card details");
	        }
	    }
	  public static boolean isValidCardDetails(CardDetails cardDetails) {
	        return isValidCardNumber(cardDetails.getCardNumber()) &&
	               isValidExpiryDate(cardDetails.getExpiryDate()) &&
	               isValidCVV(cardDetails.getCvv());
	    }

	    private static boolean isValidCardNumber(String cardNumber) {
	        // Basic check: Card number should be numeric and have a valid length
	    	System.out.println(cardNumber);
	        return cardNumber != null && cardNumber.matches("\\d{12}");
	    }

	    private static boolean isValidExpiryDate(String expiryDate) {
	    	System.out.println(expiryDate);
	        // Basic check: Expiry date should be in the format "MM/YY"
	        return expiryDate != null && expiryDate.matches("\\d{2}/\\d{2}");
	    }

	    private static boolean isValidCVV(String cvv) {
	    	System.out.println(cvv);
	        // Basic check: CVV should be numeric and have a valid length
	        return cvv != null && cvv.matches("\\d{3}");
	    }

	 public Customer getCustomerById(int customerId) {
	        return customerRepository.findById(customerId)
	                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));
	    }
  
  
	public void updateCustomer(Customer existingCustomer) {
		
		customerRepository.save(existingCustomer);
	}
	
	 public ResponseEntity<String> validateEmailFormat(int customerId, String email) {
	        // Retrieve the customer by ID
	        Customer customer = customerRepository.findById(customerId)
	                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));

	        // Check if the provided email matches the customer's email
	        if (!email.equals(customer.getEmail())) {
	            return ResponseEntity.badRequest().body("Provided email does not match the registered email for customer ID: " + customerId);
	        }

	        // Basic email format validation logic
	        // This is a simple example and may not cover all edge cases
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        if (!email.matches(emailRegex)) {
	            return ResponseEntity.badRequest().body("Emmail is not valid");
	        }

	        return ResponseEntity.ok("Email Verified");
	    }



	 

  
	public  Map<String, Integer>  getAnalytics(Integer customerId) {
		   // Get the Customer
        Customer customer = this.getCustomerById(customerId);
        List<CustomerBookEvent> bookedEvents = customer.getBookedEvents();
        List<CustomerBookEvent> priorityBookedEvents =customerBookEventRepository.findByIsPriorityAndCustomer(true, customer);
        int numberOfBookedEvents = bookedEvents.size();
        int numberOfPriorityEvents=priorityBookedEvents.size();
        Map<String, Integer> map= new HashMap();
        map.put("TotalnumberOfBookedEvents", numberOfBookedEvents);
        map.put("NumberOfPriorityEvents", numberOfPriorityEvents);
        map.put("NumberOfNon-PriorityEvents",numberOfBookedEvents- numberOfPriorityEvents);
        
        return map;
	}
	
	

	public ResponseEntity<?> cancelMembership(int customerId) {
	    // Fetch customer details
	    Customer customer = customerRepository.findById(customerId).orElse(null);
	    if (customer == null) {
	        throw new IllegalArgumentException("Invalid customer ID");
	    }
	    // Check if the customer is a member
	    if (!customer.getIsMember()) {
	        return ResponseEntity.badRequest().body("Customer is not a member");
	    }
	    // Update customer membership status
	    customer.setIsMember(false);
	    // Save the updated customer back to the database
	    customerRepository.save(customer);
	    return ResponseEntity.ok(new BaseApiResponseDTO("Successfully canceled membership", customer, null));
	}

}

