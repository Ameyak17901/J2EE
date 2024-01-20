package com.demo.service;

import java.sql.Date;
import java.util.List;

import com.demo.model.Leave_details;

public interface LeaveService {

	Leave_details getLeave(int id);

	void addLeave(int empno, Date start_date, Date end_date, String leave_type, String leave_reason);

	List<Leave_details> getall();

}
