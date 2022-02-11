package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="CQ3")  
@PrimaryKeyJoinColumn(name="CQ_ID")     
public class Cheque3 extends Payment3 {
	
	@Column(name = "CQType")  
	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
	
}
