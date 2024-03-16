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
			pw.println("<h1 style='text-align: center'>UserDetails</h1>");
			
			pw.println(
					
						"<style>"+
					
							"table, td, th {  border: 1px solid;border-collapse: collapse;text-align: center;margin: auto; border: 2px solid rgb(1, 166, 155);}"+
							
							"table{width: 80%; border-collapse: collapse;}"
							
							
						+"</style>"
					);
			
			pw.println("<br><table>"+
					  "<tr>"+
					    "<th>User ID</th>"+
					    "<th>Name</th>"+
					    "<th>Email ID</th>"+
					    "<th >Age</th>"+
					    "<th >Date of birth</th>" +
					  "</tr><br>"
					);
			Spliterator<DetailsBean> sp = al.spliterator();
			
			sp.forEachRemaining((k)->{
				DetailsBean b = (DetailsBean)k;
		
						  
				pw.println(
						"<tr>"
						+ "<td>"+b.getId()+"</td>"
						+ "<td >"+b.getuName()+"</td> "
						+ "<td>"+ b.getuEmail()+"</td>"
						+ "<td >"+ b.getAge()+"</td>"
						+ "<td>"+ b.getuDOB()+"</td>"
						+"<tr>"
						);
				
						
			});
			pw.println("</table><br>");
		}
		
		pw.println("<h1><a href='index.html' style='margin-left: 48%; text-decoration: none;'>home</a></h1>");
				
		
	}
	
	@Override
	 public void destroy() {
	 //NoCode
	 }

	
	
	
	
	
	
}
