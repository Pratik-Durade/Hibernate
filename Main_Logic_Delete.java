package com.mondee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Logic_Delete{

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		
		Student s=(Student)se.load(Student.class, 101);
		System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMarks());
		
		se.delete(s);
				
		tx.commit();
		se.close();
	}

}
