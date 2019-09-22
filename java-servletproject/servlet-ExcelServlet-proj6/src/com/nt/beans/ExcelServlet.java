package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExcelServlet extends HttpServlet{
	
	public void server(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException{
		
		res.setContentType("application/vnd.ms-excel");
		
		PrintWriter pw=res.getWriter();
		pw.println("<tr><th>Player</th><th>Role</th></tr>");
		pw.println("<tr><td>Dhoni</td><td>Caption</td></tr>");
		pw.println("<tr><td>Sachin</td><td>All rounder</td></tr>");
		
		pw.close();
	}
	

}
