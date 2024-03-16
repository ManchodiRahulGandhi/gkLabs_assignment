package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Spliterator;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.nt.DetailsBean;
import com.nt.DAO.viewDetailsDAO;

@SuppressWarnings("serial")
@WebServlet("/view")
public class viewAllUserDeatilsServlet extends GenericServlet{
	
	@Override
	 public void init()throws ServletException{
	 //NoCode
	 }
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		viewDetailsDAO l = new viewDetailsDAO();
		
		ArrayList<DetailsBean> al =l.retrieve();
		
				
		if(al.size()==0) {
			pw.println("User Details are not availble....<br>");
		}else {
			pw.println("UserDetails");
			Spliterator<DetailsBean> sp = al.spliterator();
			
			sp.forEachRemaining((k)->{
				DetailsBean b = (DetailsBean)k;
		
				pw.println("<br>" +b.getId()+"&nbsp&nbsp"+
						 b.getuName()+"&nbsp&nbsp"+
						 b.getuEmail()+"&nbsp&nbsp"+
						 b.getAge()+"&nbsp&nbsp"+
						 b.getuDOB()+"<br>");
			});
		}
		
		pw.println("<a href='index.html'>home</a>");
				
		
	}
	
	@Override
	 public void destroy() {
	 //NoCode
	 }

	
	
	
	
	
	
}
