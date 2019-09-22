package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateSrv extends GenericServlet
{
     
     public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException
     {
         
          res.setContentType("text/html");
         
          PrintWriter pw = res.getWriter();
          
          Date date = new Date();
          
          pw.println("<h2>"+"Current Date & Time: "+date.toString()+"</h2>");
         
          pw.close();
     }
}