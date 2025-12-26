package com.tcs.sample.constructor;

public class Employee {
	//instance variables
	int empno;
	String ename;
	int sal;
	Employee(){
		empno=100;
		ename="abc";
		sal=5000;
	}
	Employee(int empno, String ename, int sal){
		this.empno = empno;
		this.ename = ename;
		this.sal=sal;
	}
	Employee(int empno, String ename){
		this.empno=empno;
		this.ename=ename;
	}
	
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
