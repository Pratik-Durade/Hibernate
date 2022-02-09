package com.mondee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Logic_Insert {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Student pratik =new Student();
		pratik.setSid(103);
		pratik.setSname("Anil Kesti");
		pratik.setMarks(450);
		
		se.update(pratik);
		tx.commit();
		se.close();
	}

}
