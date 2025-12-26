package com.tcs.sample.constructor;

public class Student {
	int stdno;
	String stdname;
	int m1,m2,m3;
	
	Student(int stdno, String stdname){
		this.stdno=stdno;
		this.stdname=stdname;
	}
	
	void setMarks(int m1, int m2, int m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void displayStdDetails() {
		System.out.println(stdno+"  "+stdname);
	}

	void displayStdPermance() {
		System.out.println("Marks are "+m1+"   "+m2+"  "+m3);
		float percentage = (m1+m2+m3)/3.0f;
		System.out.println("Percentage is "+percentage);
	}
	
	static void displaySchoolAddress() {
		System.out.println("Hyd");
	}
}
