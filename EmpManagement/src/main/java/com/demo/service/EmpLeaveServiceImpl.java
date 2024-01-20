package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmpLeaveDao;
import com.demo.model.LeaveDetails;

@Service
public class EmpLeaveServiceImpl implements  EmpLeaveService{
	
	@Autowired
	private EmpLeaveDao edao;
	
	@Override
	public void addLeave(LeaveDetails ld) {
		edao.save(ld);
	}
	
	@Override
	public List<LeaveDetails> getAllLeaveDetails(int id){
		List<LeaveDetails> lst= edao.getAllLeaveDetails(id);
		return lst;
	}

}
