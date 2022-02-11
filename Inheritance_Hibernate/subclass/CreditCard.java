package com.mondee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("CC")
public class CreditCard extends Payment {

	@Column(name = "CCType")  
	private String creditCardType;
	
	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	

}
