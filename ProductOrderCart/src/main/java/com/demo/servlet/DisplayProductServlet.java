package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class DisplayProductServlet
 */
@WebServlet("/displayproduct")
public class DisplayProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		MyUser user = (MyUser) session.getAttribute("user");
		
		if(user != null && user.getRoles().equals("admin")) {
			ProductService pservice = new ProductServiceImpl(); 
			List<Product> plist = pservice.getAllProducts();
			out.println("<h3>Welcome "+user.getUser_name()+"</h3>");
			out.println("<table border='2'><tr><th>Product Id </th><th>Name</th><th>Quantity</th><th>Price</th><th>Action</th></tr>");
			for(Product p:plist) {
				out.println("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>");
				out.println("<td><a href='deleteproduct?pid="+p.getId()+"'>delete</a> / <a href='editproduct?pid="+p.getId()+"'>edit</a> </td> </tr>");
			}
			out.println("</table>");
			//after clicking on the link a form will appear to accept new product details
			out.print("<a href='addproduct.html'>Add new Product</a>&nbsp;&nbsp;");
			out.print("<a href='logout'>Logout</a>");
		}else {
			System.out.println("reached without login");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			out.println("Pls enetr credentials!!");
			rd.include(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
