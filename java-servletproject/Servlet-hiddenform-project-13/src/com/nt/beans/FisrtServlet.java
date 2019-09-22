package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FisrtServlet extends HttpServlet{
	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException {
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		
		
		String n=req.getParameter("username");
		
		pw.print("<form action='servlet2'>");  
		
        pw.print("<input type='hidden' name='uname' value='"+n+"'>");
        
        pw.print("<input type='submit' value='go'>");  
        
        pw.print("</form>");  
        
        pw.close();  
		
		pw.close();
	}

}
