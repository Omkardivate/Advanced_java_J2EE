package com.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.LeaveDetails;
import com.demo.service.EmpLeaveService;

@Controller
@RequestMapping("/leaves")
public class LeaveController {
	
	@Autowired
	private EmpLeaveService service;
	
	@GetMapping("/home")
	public String gethome() {
		return "home";
	}
	
	@GetMapping("/leaveform")
	public String getleaveform() {
		return "leaveform";
	}
	
	@GetMapping("/details")
	public String getdetails() {
		return "details";
	}
	
	@PostMapping("/showdetails")
	public ModelAndView getleavedetails(@RequestParam int empno) {
		List<LeaveDetails> lst= service.getAllLeaveDetails(empno);
		return new ModelAndView("displaydetails","lst",lst);
	}
	
	@PostMapping("/insert")
	public ModelAndView addleavedetails(@RequestParam String lid,@RequestParam String ladate , @RequestParam int empno,@RequestParam String sdate ,
			@RequestParam String edate ,@RequestParam String ltype ,@RequestParam String lreason  ) {
		  
		LeaveDetails ld= new LeaveDetails(lid,ladate,sdate,edate,ltype,lreason,empno);
		System.out.println(ld);
		service.addLeave(ld);
		return new ModelAndView("redirect:/leaves/home", "" ,null);
	}
	
}
