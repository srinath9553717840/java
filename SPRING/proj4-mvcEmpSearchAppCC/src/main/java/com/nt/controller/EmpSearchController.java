package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.service.EmpSearchService;


public class EmpSearchController<SearchResultDTO> extends AbstractController {

	private EmpSearchService service;
	
	public void setService(EmpSearchService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		SearchCommand command=(SearchCommand)command;
		SearchDTO dto=new SearchDTO();
		dto.setNo(command.getNo());
		dto.setName(command.getName());
		dto.setDesg(command.getDesg());
		dto.setSalary(command.getSalary());
		
		List<SearchResultDTO>listRDTO=(List<SearchResultDTO>) service.process(dto);
		
		return new ModelAndView("listEmps","searchResults",listRDTO);
	}

	

}
