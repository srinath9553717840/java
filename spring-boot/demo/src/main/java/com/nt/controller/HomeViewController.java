package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeViewController {
	@RequestMapping(value="/home1.htm",method= {RequestMethod.GET,RequestMethod.POST})
	public String showHome() {
		return "welcome";
	}

	@RequestMapping(value="/direct.htm")
	

	
	public String helloHome() {
		return "Welcome to jsp";
	}
}
