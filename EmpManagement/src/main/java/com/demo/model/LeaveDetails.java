package com.demo.model;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leavedetails")
public class LeaveDetails {
	@Id
	private String leave_id;
	private String leave_applied_on ;
	private String start_date;
	private String end_date;
	private String leave_type;
	private String leave_reason;
	private int empno;	
	
	public LeaveDetails() {
		super();
	}

	
	public LeaveDetails(String str,String leave_applied_on, String start_date, String end_date, String leave_type,
			String leave_reason, int empno) {
		super();
		this.leave_id = str;
		this.leave_applied_on = leave_applied_on;
		this.start_date = start_date;
		this.end_date = end_date;
		this.leave_type = leave_type;
		this.leave_reason = leave_reason;
		this.empno = empno;
	}

	public String getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(String str) {
		this.leave_id = str;
	}

	public String getLeave_applied_on() {
		return leave_applied_on;
	}

	public void setLeave_applied_on(String leave_applied_on) {
		this.leave_applied_on = leave_applied_on;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getLeave_type() {
		return leave_type;
	}

	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}

	public String getLeave_reason() {
		return leave_reason;
	}

	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "LeaveDeatails [leave_id=" + leave_id + ", leave_applied_on=" + leave_applied_on + ", start_date="
				+ start_date + ", end_date=" + end_date + ", leave_type=" + leave_type + ", leave_reason="
				+ leave_reason + ", empno=" + empno + "]";
	}
	
	
	
}
