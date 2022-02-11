package com.mondee;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="CQ2")  
@AttributeOverrides({  
    @AttributeOverride(name="paymentId", column=@Column(name="CQpid")),  
    @AttributeOverride(name="amount", column=@Column(name="CQamount"))  
})    
public class Cheque2 extends Payment2 {
	
	@Column(name = "CQType")  
	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
	
}
