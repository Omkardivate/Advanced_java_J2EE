package com.institute.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.instutitu.models.Course;
import com.instutitu.models.Faculty;

public class TestCourse {

	public static void main(String[] args) {
		Faculty f1 = new Faculty(1,"Adi boy");
		
		Course c1 = new Course(10, "history", f1);
		f1.setC(c1);


		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(f1);
		session.save(c1);
		tr.commit();
		session.close();

		SessionFactory sf1 = new Configuration().configure().buildSessionFactory();
		Session session1 = sf1.openSession();
		Transaction tr1 = session1.beginTransaction();
		
		Course c= session1.get(Course.class, 10);
		System.out.println("before:");
		System.out.println(c);
		System.out.println("after:");
		tr1.commit();
		session1.close();
	}

}
