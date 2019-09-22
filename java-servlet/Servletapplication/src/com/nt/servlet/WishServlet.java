package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		
		Calendar calendar=Calendar.getInstance();
		
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		int hour1=0;
		
		if(hour1<=12)
			
		pw.println("<h1 style='color:red'>Good morning</center><h1>");
		
		else if(hour1<=17) 
			
			pw.println("<h1 style='color:red'>Good Afternoon</center><h1>");
			
			else if(hour1<=20) 
				
				pw.println("<h1 style='color:red'>Good Evening</center></h1>");
				
				else 
					pw.println("<h1 style='color:red'>Good night</center></h1>");
					
		pw.println("<br><a href='page.html'>home</a>");
	
					pw.close();
	
	}
}