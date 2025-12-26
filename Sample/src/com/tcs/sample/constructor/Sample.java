package com.tcs.sample.constructor;

public class Sample {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"xyz",7000);
		emp1.displayInfo();
		
		Employee emp2 = new Employee();
		emp2.displayInfo();
		
		Employee emp3= new Employee(3,"pqr");
		emp3.displayInfo();
	}
}


