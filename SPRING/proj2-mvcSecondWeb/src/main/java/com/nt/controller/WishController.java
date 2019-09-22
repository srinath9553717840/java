package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Calendar cal=null;
		int hour=0;
		String wMsg=null;
		
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour<=12) 
			wMsg="Good Morning";
		
		 else if(hour<=20)
			 wMsg="Good Evening";
		
		 else  
			wMsg="Good Night";
			 
		return new ModelAndView("result","msg",wMsg);
	}

}
