package com.mondee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mondee.util.HibernateUtils;

public class MainLogic_Insert {

	public static void main(String[] args) {
		
		Session se=HibernateUtils.getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();

		Student pratik =new Student();
		pratik.setSid(102);
		pratik.setSname("Sushant Babar");
		pratik.setMarks(499);
		
		se.save(pratik);
		tx.commit();
		se.close();
	}

}
