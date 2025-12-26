package com.tcs.sample.constructor;

public class StudentEx {

	public static void main(String[] args) {
		Student s1= new Student(1,"abc");
		//Student s2= new Student(2,"xyz");
		//Student s3= new Student(3,"pqr");
		
		s1.setMarks(96, 97, 99);
		s1.displayStdPermance();
		
	}

}
