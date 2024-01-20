package com.demo.service;

import java.util.List;

import com.demo.model.LeaveDetails;

public interface EmpLeaveService {
	
	void addLeave(LeaveDetails ld);
	
	List<LeaveDetails> getAllLeaveDetails(int id);
}
