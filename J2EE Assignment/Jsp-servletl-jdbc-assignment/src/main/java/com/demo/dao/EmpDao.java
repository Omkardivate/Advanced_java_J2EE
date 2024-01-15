package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {
	List<Employee> getAllEmp();
	
	void deleteEmployee(int id);

	void addEmployee(int id, String name, String job);

	Employee getEmployee(int id);

	int updateEmp(Employee e);
}
