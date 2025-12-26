package com.tcs.sample.basics;

public class Employee {

	//instance variables
	int empno;
	String ename;
	int sal;

	//to set values to empno, ename,sal
	void setValues(int num, String name, int s) {
		empno = num;
		ename = name;
		sal = s;
	}

	void displayInfo() {
		System.out.println(empno + "   " + ename + "   " + sal);
	}

	static void displayAddress() {
		
	}
}
