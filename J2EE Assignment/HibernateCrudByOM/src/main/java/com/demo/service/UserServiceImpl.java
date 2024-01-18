package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.MyUser;

public class UserServiceImpl implements UserService{
	private UserDao udao;

	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}

	public void addnewUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr user id");
		int uid=sc.nextInt();
		System.out.println("enetr user name");
		String uname=sc.next();
		System.out.println("enetr address id");
		int aid=sc.nextInt();
		System.out.println("enetr street");
		String street=sc.next();
		System.out.println("enetr city");
		String city=sc.next();
		MyUser u=new MyUser(uid,uname,new Address(aid,street,city));
		udao.save(u);
		
	}

	
	public List<MyUser> getAllUsers() {
		return udao.findAll();
	}

	
	public MyUser getById(int uid) {
		return udao.findById(uid);
	}

	
	public boolean removeById(int uid) {
		return udao.deleteById(uid);
	}

	
	public boolean modifyById(int uid, String unm, String street) {
		return udao.updateById(uid,unm,street);
		
	}


	public List<MyUser> sortById() {
		return udao.sortById();
	}

	
	public void closeMySessionFactory() {
		udao.closeMyServiceFactory();
		
	}

}