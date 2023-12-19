package com.demo.service;

import java.util.List;

import com.demo.beans.User;
import com.demo.dao.*;

public class UserServiceImp implements UserService{

	UserDao dao=new UserDaoImp();
	
	@Override
	public void addUser(String uname, String pwd) {
		dao.save(uname,pwd);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.getUsers();
	}

	@Override
	public List<String> getAllUname() {
		return dao.getUsernames();
	}

	@Override
	public void deleteByUsernm(String uname) {
		dao.removeByuname(uname);
	}

}
