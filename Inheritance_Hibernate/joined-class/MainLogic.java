package com.mondee;

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
		
		
		CreditCard2 cc=new CreditCard2();
		cc.setPaymentId(1001);
		cc.setAmount(35000);
		cc.setCreditCardType("VISA");
		
		Cheque2 cq=new Cheque2();
		cq.setPaymentId(1002);
		cq.setAmount(47000);
		cq.setChequeType("ICICI");
		
		se.save(cc);
		se.save(cq);
		
		tx.commit();
		se.close(); 
	}
}
