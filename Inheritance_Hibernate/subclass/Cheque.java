package com.mondee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("CQ")  
public class Cheque extends Payment {
	
	@Column(name = "CQType")  
	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
	
}
