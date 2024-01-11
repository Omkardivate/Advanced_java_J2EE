package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class TestMyUserAddress {

	public static void main(String[] args) {
		Address add1=new Address(1,"SB road","Pune");
		MyUser u1= new MyUser(1,"omkar",add1);
				
		Address add2=new Address(2,"College road","Nashik");
		MyUser u2= new MyUser(2,"Aditya",add2);
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session1= sf.openSession();
		Transaction tr1= session1.beginTransaction();
		
		session1.save(add1);
		session1.save(add2);
		
		session1.save(u1);
		session1.save(u2);
	
		tr1.commit();
		
	}

}
