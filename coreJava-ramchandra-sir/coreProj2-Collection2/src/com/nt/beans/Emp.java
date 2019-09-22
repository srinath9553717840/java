package com.nt.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Emp {
	
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String> ();
	
	list.add("varun");
	list.add("nagaraju");
	list.add("kishore");
	list.add("hanmakonda");
	
		System.out.println("tranvering list through List iterator");
	ListIterator<String>list1=list.listIterator(list.size());
	while (list1.hasPrevious()) {
		String str=list1.previous();
		System.out.println(str);
}
	System.out.println("Transering list through for loop:");
	for (int i = 0; i < list.size(); i++) {
		
		System.out.println(list.get(i));
		
	}
	
	list.forEach(b->
	
		{
			
		System.out.println(b);
		
	}
			);
	
}}