package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		String name=req.getParameter("name");
		
		int age=Integer.parseInt(req.getParameter("age"));
	
		if(age>=18) {
			
			pw.println("<h1 style='color:red'>"+name+"you are eligible for vote</h1>");
			
		}
		
		else
		{
			pw.println("<h1 style='color:red'>"+name+"you are not eligible for vote</h1>");
		}
		pw.println("<a href='input.html'>home</a>");
		
		pw.close();
	}
	
	
	

}
