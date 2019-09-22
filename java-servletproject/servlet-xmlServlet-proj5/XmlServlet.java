package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet{
	
	public void service(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException{
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/xml");
		
		pw.println("<table border='1'>");
		
		pw.println("<tr><th>player</th><th>role</th></tr>");
		pw.println("<tr><td>Dohni</td><td>Caption</td></tr>");
		pw.println("<tr><td>Sachin</td><td>All rounder</td></tr>");
		
		pw.close();
		
	}

}
