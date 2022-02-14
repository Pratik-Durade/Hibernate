package com.mondee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vendor1")
public class Vendor {
	
	@Id
	@Column(name="vid")
	private int vendorId;
	@Column(name="vname")
	private String vendorName;
	
	@OneToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)  
	private Customer name;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Customer getName() {
		return name;
	}

	public void setName(Customer name) {
		this.name = name;
	}  
		
}
