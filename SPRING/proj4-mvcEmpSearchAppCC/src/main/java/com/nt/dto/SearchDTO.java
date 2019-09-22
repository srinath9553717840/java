package com.nt.dto;

import java.io.Serializable;

public class SearchDTO implements Serializable {
	
	private int no;
	private String name,desg;
	private int salary;
	
	public SearchDTO() {
		System.out.println("SearchDTO.SearchDTO()");
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
