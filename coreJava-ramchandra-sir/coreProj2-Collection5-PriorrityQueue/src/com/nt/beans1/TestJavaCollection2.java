package com.nt.beans1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
	PriorityQueue<String> pq=new PriorityQueue<String>();
	
	pq.add("kavitha");
	pq.add("shirisha");
	pq.add("swetha");
	pq.add("rajeswary");
	pq.add("mounika");
	
	
	
	Iterator itr=pq.iterator();
	
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	}}