package com.nt.beans;

public class Emp {
	
	
	int id;
	String name;
	Address address;
	
	
	public Emp(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void disply() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		
	}
	
	public static void main(String[] args) {
		Address a=new Address("sad", "dvvadsre","dsagva");
		Address a1=new Address("awegino","abivb","jdsvnia");
		
		Emp e=new Emp(101, "varun",a);
		Emp e1=new Emp(102,"vikram",a1);
		
		e.disply();
		e1.disply();
		
	}
}

	

