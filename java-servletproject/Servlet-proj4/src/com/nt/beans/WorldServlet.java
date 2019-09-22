package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WorldServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res )throws ServletException,IOException{
		
		res.setContentType("application/msword");
		
		PrintWriter pw=res.getWriter();
		
		pw.println("<table border='0'>");
		
		pw.println("<tr><th>Play</th><th>Role</th></tr>");
		pw.println("<tr><td>Dhoni</td><td>Caption</td></tr>");
		pw.println("<tr><td>Sachin</td><td>All Rounder</td></tr>");
		
		pw.close();
	}

}
