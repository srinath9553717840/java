package com.nt.beans1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
	HashSet<String> hs=new HashSet<String>();
	
	hs.add("book");
	hs.add("pen");
	hs.add("ability");
	
	
	Iterator itr=hs.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	}}