package com.tcs.sample.basics;

public class Sample {
	public static void main(String[] args) {
		Employee emp1 = new Employee();

		//emp1.setValues(100, "abc", 5000);
        
        emp1.displayInfo();
        
        Employee emp2 = new Employee();
        emp2.empno=101;
        emp2.ename="xyz";
        emp2.sal=6000;
        emp2.displayInfo();
        emp1.displayAddress();
	}
}


