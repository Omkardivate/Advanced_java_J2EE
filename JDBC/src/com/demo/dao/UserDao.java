package com.demo.dao;


import java.util.List;

import com.demo.beans.User;

public interface UserDao {

	void save(String uname, String pwd);

	List<User> getUsers();

	List<String> getUsernames();

	void removeByuname(String uname);

	void modifyPwd(String uname, String pwd);

}