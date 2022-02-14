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
		
		Vendor v=new Vendor();
		v.setVendorId(1);
		v.setVendorName("Amazon");
		
		Customer c=new Customer();
		c.setCustomerId(101);
		c.setCustomerName("Pratik");
		c.getVendor().add(v);
		
		Customer c2=new Customer();
		c2.setCustomerId(102);
		c2.setCustomerName("Akshay");
		c2.getVendor().add(v);
		
		v.getCustomer().add(c);
		v.getCustomer().add(c2);
		
		se.save(c);
		se.save(c2);
		se.save(v);
		
		
		tx.commit();
		se.close();
	}

}
