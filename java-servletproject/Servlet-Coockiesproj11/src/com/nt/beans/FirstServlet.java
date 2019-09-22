package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException {
		
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("username");
		
		pw.println("welcome"+name);
		
		Cookie ck=new Cookie("username",name);
		
		res.addCookie(ck);
		
		pw.println("<form action='servlet2'>");
		
		pw.println("<input type='submit' value='go'>");
		
		pw.println("</form>");
		
		pw.close();
			
	
	}
	
	}


