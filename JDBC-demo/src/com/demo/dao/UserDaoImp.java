package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.demo.beans.User;

public class UserDaoImp implements UserDao{
	
	static Connection conn=null;
	static PreparedStatement insert,seluser,seluname,deluser;
	static {
		try {
			conn=DBUtil.getMyConnection();
			insert= conn.prepareStatement("insert into userdata values(?,?)");
			seluser=conn.prepareStatement("select * from userdata;");
			seluname=conn.prepareStatement("select username from userdata;");
			deluser=conn.prepareStatement("delete from userdata where username=?;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(String uname, String pwd) {
		try {
			insert.setString(1, uname);
			insert.setString(2, pwd);
			insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("user added successfully...");
	}

	@Override
	public List<User> getUsers() {
		try {
			List<User> ulist=null;
			ResultSet rs= seluser.executeQuery();
			while(rs.next()) {
				ulist.add(new User(rs.getString(1),rs.getString(2)));
			}
			return ulist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> getUsernames() {
		List<String> unamelist= null;
		try {
			ResultSet rs= seluname.executeQuery();
			while(rs.next()) {
				unamelist.add(new String(rs.getString(1)));
			}
			return unamelist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void removeByuname(String uname) {
		try {
			deluser.setString(1, uname);
			deluser.executeUpdate();
			System.out.println("Deleted successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
