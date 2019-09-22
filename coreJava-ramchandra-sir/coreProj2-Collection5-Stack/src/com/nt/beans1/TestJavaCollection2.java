package com.nt.beans1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<String>();
		
		stack.add("thrivikram");
		stack.add("vinayak");
		stack.add("dil raj");
		stack.add("manoju");
		
		Iterator itr=stack.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}}