package com.tcs.inheritance;

public class Person {
	private String fname;
	private String lname;
	public Person(String fname, String lname) {
		
		this.fname = fname;
		this.lname = lname;
	}
	public void display() {
		System.out.print(fname+"   "+lname+"  ");
	}
	
	
}
