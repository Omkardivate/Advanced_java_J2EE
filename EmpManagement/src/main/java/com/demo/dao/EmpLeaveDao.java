package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.LeaveDetails;

public interface EmpLeaveDao extends JpaRepository<LeaveDetails, String>{

	@Query(value="select * from leavedetails where empno= :id" , nativeQuery = true)
	List<LeaveDetails> getAllLeaveDetails(int id);

}
