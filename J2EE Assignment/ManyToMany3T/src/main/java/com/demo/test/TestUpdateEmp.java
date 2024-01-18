package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class TestUpdateEmp {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e=session.get(Employee.class, 1);
		e.setEname("omkar");
		session.save(e);
		tr.commit();
		System.out.println(e);


	}

}
