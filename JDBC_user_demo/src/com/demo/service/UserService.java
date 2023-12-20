package com.demo.service;

import java.util.List;

import com.demo.beans.User;

public interface UserService {

	void addUser(String uname, String pwd);

	List<User> getAllUsers();

	List<String> getAllUname();

	void deleteByUsernm(String uname);

	void updatePwd(String uname,String pwd);

	

}