package com.mondee;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity  
@Table(name="CC3")  
@PrimaryKeyJoinColumn(name="CC_ID") 
public class CreditCard3 extends Payment3 {

	@Column(name = "CCType")  
	private String creditCardType;
	
	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	

}
