package com.demo.model;

import java.sql.Date;

public class Leave_details {
	
	private String leave_id;
	private int empno;
	private Date start_date;
	private Date end_date;
	private String leave_type;
	private String leave_reason;
	public Leave_details() {
		super();
	}
	public Leave_details(int empno, Date start_date, Date end_date, String leave_type,
			String leave_reason) {
		super();

		this.empno = empno;
		this.start_date = start_date;
		this.end_date = end_date;
		this.leave_type = leave_type;
		this.leave_reason = leave_reason;
	}
	public String getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(String leave_id) {
		this.leave_id = leave_id;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
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
	@Override
	public String toString() {
		return "Leave_details [leave_id=" + leave_id + ", empno=" + empno + ", start_date=" + start_date + ", end_date="
				+ end_date + ", leave_type=" + leave_type + ", leave_reason=" + leave_reason + "]";
	}
	
	
}
