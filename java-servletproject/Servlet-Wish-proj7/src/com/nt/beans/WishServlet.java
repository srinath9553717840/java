package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishServlet extends HttpServlet{

	
public void service(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException{
		
	
	Calendar calendar=null;
	
	 PrintWriter pw=null;
	
    int hour=0;
    
       
    pw=res.getWriter();
    
	res.setContentType("text/html");
	
        
     
         calendar=Calendar.getInstance();
         
         hour=calendar.get(Calendar.HOUR_OF_DAY);
         
         if(hour<=12)
        	 
        	 pw.println("<h1 style='color:red'><center>Good Morning</center></h1>");
        	 
         else if(hour<=17)
        	 
        	 pw.println("<h1 style='color:red'><center>Good After Noon</center></h1>");
           
        	 else if(hour<=20)
        		 
        		 pw.println("<h1 style='color:red'><center>Good Evening</center><h1>");
         
        	 else 
        		 
        		 pw.println("<h1 style='color:red'><center>Good night</center></h1>");
         
               pw.println("<a href='page.html'>home</a>");
	
         pw.close();
	}
}
