package com.nt.beans;


import java.io.IOException;
import java.util.ArrayList;

public class Emp {
	
public static void main(String[] args){

	
	ArrayList<String> student=new ArrayList<String>();
	

	student.add("kumar");
	student.add("nagaraju");
	student.add("mahesh");
	student.add("prashanth");
	
	System.out.println("Emp.main()");
	student.forEach((n)->System.out.println(n));
	
}
public static void print(String n) {

	System.out.println("student name is"+n);
}
}