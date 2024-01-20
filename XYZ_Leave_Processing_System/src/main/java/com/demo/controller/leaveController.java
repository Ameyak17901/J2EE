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

import com.demo.model.Leave_details;
import com.demo.service.LeaveService;

@Controller
@RequestMapping("/leave")
public class leaveController {
	
	static int cnt=1;
	@Autowired
	LeaveService lservice;
	
	@GetMapping("/form")
	public ModelAndView showleavepage() {
		return new ModelAndView("leave");
	}
	
	@PostMapping("/addleave")
	public ModelAndView addleave(@RequestParam int empno, @RequestParam Date start_date,@RequestParam Date end_date,@RequestParam String leave_type,@RequestParam String leave_reason) {
		lservice.addLeave(empno,start_date,end_date,leave_type,leave_reason);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("/history")
	public ModelAndView displayleave() {
		List<Leave_details> list = lservice.getall();
		return new ModelAndView("history","list",list);
	}
}
