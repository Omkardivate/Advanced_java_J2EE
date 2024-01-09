package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao{
	private static Connection conn;
	
	private static PreparedStatement selemp;
	
	static {
		try {
			conn= DBUtil.getMyConnection();
			selemp= conn.prepareStatement("select * from employees");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Employee> getAllEmp() {
		List<Employee> elist = new ArrayList<>();
		try {
			ResultSet rs= selemp.executeQuery();
			while (rs.next()) {
				int eid= rs.getInt(1);
				String ename= rs.getString(2);
				String ejob= rs.getString(3);
				Employee e= new Employee(eid,ename,ejob);
				elist.add(e);
			}
			return elist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
