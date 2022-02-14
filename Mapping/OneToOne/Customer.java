package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer1")
public class Customer {
	
	@Id
	@Column(name="cid")
	private int customerId;
	@Column(name="cname")
	private String customerName;
//	
//	@OneToOne(targetEntity=Vendor.class)  
//	private Vendor ven;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
