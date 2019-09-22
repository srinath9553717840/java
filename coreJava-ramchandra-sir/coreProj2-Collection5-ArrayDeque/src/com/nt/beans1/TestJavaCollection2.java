package com.nt.beans1;

import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
	Deque<String> deque=new ArrayDeque<String>();
	
	
	deque.add("shivudu");
	deque.add("shenkarudu");
	deque.add("parvathi");
	deque.add("venkateshvarulu swamy");
	deque.add("mallikarjuna swamy");
	
	Iterator itr=deque.iterator();
	
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
	
	
	}}