package com.nt.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletApp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
	if(name.equalsIgnoreCase("kishu") &&password.equalsIgnoreCase("kishui@123"));
		
		pw.print("login sucessfully");
		
		
		
		
		
	}

}
