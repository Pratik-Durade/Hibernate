package com.mondee;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vendor_m")
public class Vendor {
	
	@Id
	@Column(name="vid")
	private int vendorId;
	@Column(name="vname")
	private String vendorName;
	
//	@OneToMany(fetch = FetchType.LAZY,targetEntity = Customer.class,cascade = CascadeType.ALL)
//	@JoinColumn(name="fkvid",referencedColumnName = "vid")
	
	@ManyToMany
	private Set<Customer> customer=new HashSet<Customer>();
	
	
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

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	
	
	
}
