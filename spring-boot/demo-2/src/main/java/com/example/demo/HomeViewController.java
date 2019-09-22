package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeViewController {

	@RequestMapping(value="/home.htm",method= {RequestMethod.GET,RequestMethod.POST})
	public String showHome() {
		return "welcome";
	}

	@RequestMapping(value = "/direct.htm")
	@ResponseBody

	public String helloHome() {
		return "Welcome to jsp";
	}
}
