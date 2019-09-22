package com.nt.beans1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("srinath");
		al.add("sriram");
		al.add("manoju");
		al.add("balju");
		
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
	
	}}
