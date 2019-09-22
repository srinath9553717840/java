package com.t.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet{
	
	private static final long serialVersionUID=1L;
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException{
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		
		
	}
}
