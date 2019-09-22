package com.nt.beans;

public class Programer extends Employee{
	
	int bouns=200;
	boolean b=true;
	float f=0.12f;
	public static void main(String[] args) {
		
		Programer p=new Programer();

		
		   System.out.println("Progeramer salary is"+p.salary);
	   System.out.println("Bouns of programer is"+p.bouns);
	   System.out.println("Working"+p.working);
	   System.out.println("boolean"+p.b);
	   System.out.println("float"+p.f);
} 

}
