package com.nt.beans1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		
		v.add("manoj");
		v.add("laxmi");
		v.add("lackey");
		v.add("srikanth");
		
		Iterator itr=v.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
	
	}