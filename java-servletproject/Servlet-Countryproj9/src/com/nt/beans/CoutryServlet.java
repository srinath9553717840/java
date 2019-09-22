package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoutryServlet extends HttpServlet     {

	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException{
		
		
		String stateIndian[]= {"AP","TS","MH","UP"};
		
		String usStates[]= {"CA","LA","NY","CR","AZ"};
		
		String ausisStates[]= {"TMS","BB","CBR"};
		
		String country=null;
		

		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		country=req.getParameter("country");
		
		if (country.equals("Indian")) {
			
			pw.println("states="+Arrays.toString(stateIndian));
		}
		
		else if (country.equals("us")) {
                       
			pw.println("states="+Arrays.toString(usStates));
			
		}
		
		else {
			
			pw.println("states="+Arrays.toString(ausisStates));
			
			
		}
		    pw.close();
	}
}
