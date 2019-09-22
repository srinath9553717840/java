package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListCellRenderer;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.EmpSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

public class EmpSearchServiceImpl implements EmpSearchService{
	
	private EmpSearchDAO dao;
		public void setDao(EmpSearchDAO dao) {
		this.dao = dao;
	}
		@Override
		public List<SearchResultDTO> process(SearchDTO dto) {
			
		SearchBO sbo=new SearchBO();
		
		  sbo.setNo(sdto.getNo());
		  sbo.setName(sdto.getName());
		  sbo.setDesg(sdto.getDesg());
		  sbo.setSalary(sdto.getNo());
		  
		  List<SearchResultDTO>listRBO=dao.search(sbo);
		  
		  List<SearchResultDTO>listDTO=new ArrayList<SearchResultDTO>();
		  for(SearchResultDTO rbo:listRBO) {
			  SearchResultDTO rdto=new SearchResultDTO();
			  rdto.setNo(rbo.getNo());
			  rdto.setName(rbo.getName());
			  rdto.setDesg(rbo.getDesg());
			  rdto.setSalary(rbo.getSalary());
			  rdto.setMgrno(rbo.getMgrno());
			  rdto.setDeptno(rbo.getDeptno());
			  listRDTO.add(rdto);
			  
		  }
		return listRBO;
		
	}

	}
	
	
