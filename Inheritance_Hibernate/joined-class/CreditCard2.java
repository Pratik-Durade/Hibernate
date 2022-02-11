package com.mondee;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="CC2")  
@AttributeOverrides({  
    @AttributeOverride(name="paymentId", column=@Column(name="CCpid")),  
    @AttributeOverride(name="amount", column=@Column(name="CCamount"))  
})  
public class CreditCard2 extends Payment2 {

	@Column(name = "CCType")  
	private String creditCardType;
	
	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	

}
