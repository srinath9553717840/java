package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	
	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException{
		
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("userName");
		
		pw.println("welcome"+name);
		
		
	}

}
