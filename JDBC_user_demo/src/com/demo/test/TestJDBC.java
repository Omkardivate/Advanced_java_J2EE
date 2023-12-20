package com.demo.test;

import java.sql.Connection;

import com.demo.dao.DBUtil;

public class TestJDBC {

	public static void main(String[] args) {
		Connection con=DBUtil.getMyConnection();
		if(con!=null) {
			System.out.println("checked");
		}
		DBUtil.closeMyConnection();

	}

}
