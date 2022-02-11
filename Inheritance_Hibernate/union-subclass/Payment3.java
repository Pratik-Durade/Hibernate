package com.mondee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name="Payment")
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  // TABLE_PER_CLASS = create subclass table
											   // SINGLE_TABLE = create parent class table
											  // JOINED = create P + C classes
public class Payment3 {
	
	@Id
	@Column(name = "Pid")  
	private int paymentId;
	
	@Column(name = "amount")  
	private double amount;
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
