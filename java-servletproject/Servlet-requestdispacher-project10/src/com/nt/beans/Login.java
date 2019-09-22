package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("userName");
		
		String p=req.getParameter("userPass");
		
		if (p.equals("sri")) {
			
			RequestDispatcher rd=req.getRequestDispatcher("/welcomeurl");
			
			rd.forward(req, res);
			
			
		}
			else {
				
				pw.println("servlet not successfull");
				
				RequestDispatcher rd=req.getRequestDispatcher("/input.html");
						
						rd.include(req, res);
			}
			
	
			}
		}
	
	


