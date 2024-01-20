package com.demo.dao;

import java.util.List;

import com.demo.model.Leave_details;

public interface LeaveDao {

	Leave_details getLeave(int id);

	void addleave(Leave_details l);

	List<Leave_details> getAll();

}
