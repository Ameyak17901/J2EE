package com.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LeaveDao;
import com.demo.model.Leave_details;

@Service
public class LeaveServiceImpl implements LeaveService{

	@Autowired
	LeaveDao ldao;
	public Leave_details getLeave(int id) {
		return ldao.getLeave(id);
	}
	public void addLeave(int empno, Date start_date, Date end_date, String leave_type, String leave_reason) {
		Leave_details l = new Leave_details(empno,start_date,end_date,leave_type,leave_reason);
		ldao.addleave(l);
	}
	public List<Leave_details> getall() {
		return ldao.getAll();
	}

}
