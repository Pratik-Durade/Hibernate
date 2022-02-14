package com.mondee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainLogic {
	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
		Metadata me=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=me.getSessionFactoryBuilder().build();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Customer c1=new Customer();    
	    c1.setCustomerId(1);
		c1.setCustomerName("Ayush");
		
		Customer c2=new Customer();    
		c2.setCustomerId(2);
		c2.setCustomerName("Pratik");
		
		
		
	    Vendor v1=new Vendor();    
	    v1.setVendorId(101);    
	    v1.setVendorName("Amazon");
	    
	    v1.setName(c1);
	    
	    
	    Vendor v2=new Vendor();    
	    v2.setVendorId(102);    
	    v2.setVendorName("Flipkart");
	    
	    v2.setName(c2);
	
	  //  se.save(v1);
	    se.save(v2);
		
		
		tx.commit();
		se.close();
	}

}
