package com.nt.controller;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;

public class EmpSearchController extends AbstractCommandController{

	
	private EmpSearchService service;
	
	public void setService(EmpSearchService service) {
		this.service = service;
	}
	public EmpSearchController() {
		System.out.println("EmpSearchController.EmpSearchController()");
	}

		@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse res,
			Object cmd,
			BindException be) throws Exception {
		
			SearchCommand command=(SearchCommand)cmd;
			System.out.println(command);
			SearchDTO dto=new SearchDTO();
			dto.setNo(command.getNo());
			dto.setName(command.getName());
			dto.setDesg(command.getDesg());
			dto.setSalary(command.getSalary());
			System.out.println(dto);
			List<SearchResultDTO> listRDTO=service.process(dto);
			
			return new ModelAndView("listEmps","searchResult",listRDTO);
		
	}
	

}
