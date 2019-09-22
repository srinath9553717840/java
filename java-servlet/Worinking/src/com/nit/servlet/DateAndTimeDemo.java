package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class DateAndTimeDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

     res.setContentType("text/html");
	 PrintWriter out=res.getWriter();
	 Calendar cal=Calendar.getInstance();
	System.out.println(cal.DAY_OF_YEAR);
	 
     out.println("<body bgcolor=green>"
     		+ "<h3> DAY OF WEEK::cal.DATE  "+Calendar.DATE+"</h3>"
     		+ "<h3> DAY OF Month::cal.DAY_OF_MONTH  "+Calendar.DAY_OF_MONTH+"</h3>"
     		+ "<h3> Month::cal.DATE  "+Calendar.DAY_OF_WEEK+"</h3>"
     	
     		+ ""
     		+ ""
     		+ ""
     		+"<a href='http://localhost:8076/DateAndTimeWebApplication/home.html'>URL</a>\r\n"
     		+ "</body>");
     
	}

}
