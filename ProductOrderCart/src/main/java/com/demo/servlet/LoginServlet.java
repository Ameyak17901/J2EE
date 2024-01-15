package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/validate")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginService lservice = new LoginServiceImpl();
		MyUser u = lservice.validateUser(uname,pass);
		
		if(u!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			
			if(u.getRoles().equals("admin")) {
				RequestDispatcher rd = request.getRequestDispatcher("displayproduct");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("findallprices");
				rd.forward(request, response);
			}
		}
		else {
			out.println("Wrong credentials");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
		
	}

}
