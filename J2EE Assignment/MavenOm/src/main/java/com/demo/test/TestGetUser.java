package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestGetUser {

	public static void main(String[] args) {

		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sess1= sf.openSession();
		Transaction tr1= sess1.beginTransaction();
		
		MyUser u= sess1.get(MyUser.class, 1);
//		MyUser u= sess1.load(MyUser.class, 1);
		
		System.out.println("before");
		System.out.println(u.getUname());
		System.out.println("after name");
		
		sess1.close();
		sf.close();
	}

}
