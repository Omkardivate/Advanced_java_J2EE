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
	
	private static PreparedStatement selemp,delemp,insemp,getemp,updemp;
	
	static {
		try {
			conn= DBUtil.getMyConnection();
			selemp= conn.prepareStatement("select * from employees");
			delemp = conn.prepareStatement("delete from employees where empno=?");
			insemp = conn.prepareStatement("insert into employees values(?,?,?)");
			getemp= conn.prepareStatement("select * from employees where empno=?");
			updemp= conn.prepareStatement("update employees set ename=?,job=? where empno=?");
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

	@Override
	public void deleteEmployee(int id) {
		try {
			delemp.setInt(1, id);
			delemp.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addEmployee(int id, String name, String job) {
		try {
			insemp.setInt(1, id);
			insemp.setString(2, name);
			insemp.setString(3, job);
			insemp.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee getEmployee(int id) {
		try {
			getemp.setInt(1, id);
			ResultSet rs=getemp.executeQuery();
			rs.next();
			
			int eid= rs.getInt(1);
			String ename= rs.getString(2);
			String ejob= rs.getString(3);
			Employee e= new Employee(eid,ename,ejob);
			System.out.println("getting employee- "+e);
			return e;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateEmp(Employee e) {
		try {
			updemp.setString(1, e.getEname() );
			updemp.setString(2, e.getEjob());
			updemp.setInt(3, e.getEid());
			
			int status= updemp.executeUpdate();
			return status;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return -1;
	}
}
