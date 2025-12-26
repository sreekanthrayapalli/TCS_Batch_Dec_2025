package com.tcs.inheritance;

public class Student extends Person{

	private int stdno;
	private String stdAddress;
	
	public Student(String fname, String lname, int stdno, String stdname) {
		super(fname,lname);
		this.stdno=stdno;
		this.stdAddress=stdname;
	}
	
	public void display() {
		super.display();
		System.out.println(stdno+"  "+stdAddress);
	}
}
