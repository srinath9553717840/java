package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.ProgressSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

public class ProgressSearchServiceImpl implements EmpSearchService {
	
	private ProgressSearchDAO dao;
	 public EmpSearchServiceImpl() {
		 System.out.println("EmpSearchServiceImpl.EmpSearchServiceImpl()");
	 }

	public void setDao(EmpSearchDAO dao) {
		this.dao = dao;
	}
   public List<SearchResultDTO>process(SearchDTO sdto){
	   SearchBO sbo=new SearchBO();
	   
	   sbo.setNo(sdto.getNo());
	   sbo.setName(sdto.getName());
	   sbo.setDesg(sdto.getDesg());
	   sbo.setSalary(sdto.getSalary());
	   System.out.println(sbo);
	   List<SearchResultBO>listRBO=dao.search(sbo);
	   
	   List<SearchResultDTO>listRDTO=new ArrayList<SearchResultDTO>();
	   
	   for (SearchResultBO rbo:listRBO) {
		   SearchResultDTO rdto=new SearchResultDTO();
		   rdto.setNo(rbo.getNo());
		   rdto.setName(rbo.getName());
		   rdto.setDesg(rbo.getDesg());
		   rdto.setSalary(rbo.getSalary());
		   rdto.setMgrno(rbo.getMgrno());
		   rdto.setDeptno(rbo.getDeptno());
		   System.out.println(rdto);
		    listRDTO.add(rdto);
		  
		
	}
	   return listRDTO;
   }

}
