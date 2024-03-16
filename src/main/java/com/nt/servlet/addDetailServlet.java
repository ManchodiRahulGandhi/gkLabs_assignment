package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.nt.DetailsBean;
import com.nt.DAO.addDetailsDAO;

@SuppressWarnings("serial")
@WebServlet("/add")
public class addDetailServlet extends GenericServlet {
	
	
	@Override
	public void init() throws ServletException {
		
	}
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		DetailsBean b = new DetailsBean();
		
		b.setuName(req.getParameter("name"));
		
		b.setuEmail(req.getParameter("email"));
		
		b.setAge(Integer.parseInt(req.getParameter("age")));
		
		b.setuDOB(req.getParameter("dob"));
		
		int k =new addDetailsDAO().insert(b);
		
		if (k>0) {
			pw.println("Product Added Success Fully...<br>");
			
			RequestDispatcher rd =req.getRequestDispatcher("home.html");
			
			rd.include(req, res);
		}
	}
	
	
	@Override
	public void destroy() {
		
	}
	
	
}
