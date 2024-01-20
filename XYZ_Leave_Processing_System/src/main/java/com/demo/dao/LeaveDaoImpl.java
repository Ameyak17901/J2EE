package com.demo.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Leave_details;

@Repository
public class LeaveDaoImpl implements LeaveDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Leave_details getLeave(int id) {
		return jdbcTemplate.queryForObject("select * from leavedetails where leave_id=?",new Object[] {id}, BeanPropertyRowMapper.newInstance(Leave_details.class));
	}

	public void addleave(Leave_details l) {
		jdbcTemplate.update("insert into leavedetails (leave_applied_on,start_date,end_date,leave_type,leave_reason,empno) values(current_date(),?,?,?,?,?)",new Object[] {l.getStart_date(),l.getEnd_date(),l.getLeave_type(),l.getLeave_reason(),l.getEmpno()});
	}

	public List<Leave_details> getAll() {
		return jdbcTemplate.query("select * from leavedetails",(rs,num)->{
			Leave_details l = new Leave_details(rs.getInt(7),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6));
			return l;
		});
	}

}
