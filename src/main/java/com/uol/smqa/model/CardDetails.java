package com.uol.smqa.model;
import com.fasterxml.jackson.annotation.JsonProperty;
public class CardDetails {
	
	 @JsonProperty("cardNumber") 
	    private String cardNumber;

	    @JsonProperty("expiryDate")
	    private String expiryDate;

	    @JsonProperty("cvv")
	    private String cvv;
	    
		public String getCardNumber() {
			
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getExpiryDate() {
			//System.out.println("Exipiry date: " +expiryDate);
			return expiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			
			this.expiryDate = expiryDate;
		}
		public String getCvv() {
		//	System.out.println("CVV: " +cvv);
			return cvv;
		}
		public void setCvv(String cvv) {
			this.cvv = cvv;
		}
}
