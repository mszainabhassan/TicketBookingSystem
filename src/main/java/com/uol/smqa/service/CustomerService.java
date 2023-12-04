package com.uol.smqa.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uol.smqa.model.Customer;
import com.uol.smqa.repository.CustomerRepository;
import com.uol.smqa.model.CardDetails;

@Service
public class CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer CustomerRegistration(Customer customer) {
		
		return this.customerRepository.save(customer);
	}
	
	  public Customer buyMembership(int customerId, CardDetails cardDetails) {
	        
	        // Fetch customer details
	        Customer customer = customerRepository.findById(customerId).orElse(null);
	        if (customer == null) {
	            throw new IllegalArgumentException("Invalid customer ID");
	        }

	        // Validate card details
	        if (isValidCardDetails(cardDetails)) {
	        	
	            // Perform necessary operations (e.g., payment processing, updating membership details)
	        	 customer.setIsMember(true);
	            // Other logic...
	            return customer;
	        } else {
	            // Handle invalid card details
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

}
