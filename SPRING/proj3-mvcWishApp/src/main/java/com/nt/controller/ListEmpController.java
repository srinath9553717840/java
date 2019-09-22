package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmpDTO;
import com.nt.service.ListEmpService;

public class ListEmpController extends AbstractController{

	private ListEmpService Service;
	
	
	public void setService(ListEmpService service) {
		Service = service;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		List<EmpDTO> listEmpDTO=Service.getAllEmps();
		
		return new ModelAndView("list_emps","empList",listEmpDTO);
	}
	
	

}
