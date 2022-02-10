package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mondee.util.HibernateUtils;

public class MainLogic_Select {
	public static void main(String[] args) {
		
		Session se=HibernateUtils.getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();
		 		
		 Query qr=se.createQuery("from Student s where s.sid in (:x,:y)"); 
		 qr.setParameter("x",102);
		 qr.setParameter("y",103);
		 List li=qr.list(); 
		 Iterator i=li.iterator();
		 System.out.println("\n\t"+li);
		 System.out.println("\n\t Perticular RECORDS : \n");
		 while(i.hasNext()) 
		 { 
			 Student x=(Student)i.next();
			 System.out.println(x.getSid()+" "+x.getSname()+" "+x.getMarks());
		 }
		 
		 
		 
		 Query qr1=se.createQuery("from Student"); 
		 List li1=qr1.list(); 
		 Iterator i1=li1.iterator();
		 System.out.println("\n\t"+li1);
		 
		 System.out.println("\n\t ALL RECORDS : \n");
		 while(i1.hasNext()) 
		 { 
			 Student x=(Student)i1.next();
			 System.out.println(x.getSid()+" "+x.getSname()+" "+x.getMarks());
		 }
		 
		 tx.commit();
		 se.close();
		 
	}
}
