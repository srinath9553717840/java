package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException {
		
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		res.sendRedirect("http://www.google.com");
		
		pw.close();
	}

}
