package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection conn=null;
	
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/test?useSSL=false";
				conn= DriverManager.getConnection(url,"root","welcome@om");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Connected to DB");
		return conn;
	}
	
	public static void closeMyConnection() {
		if(conn!=null) {
			try {
				conn.close();;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("DB Connection is closed");
	}
}