package com.tcs.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100, "Raghu", 5000));
		list.add(new Employee(101, "Raghav", 7000));
		list.add(new Employee(102, "Rajesh", 8000));
		list.add(new Employee(103, "Ravi", 4000));
		list.add(new Employee(104, "Ramu", 2000));
		
		list.add(new Employee(105, "Raghu", 8000));
		list.add(new Employee(106, "Raghav",9000));
		list.add(new Employee(107, "Rajesh", 11000));
		return list;
	}
	
	public static List<Employee> getEmployeesWithDeptno(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100, "Raghu", 5000,"IT"));
		list.add(new Employee(101, "Raghav", 7000,"IT"));
		list.add(new Employee(102, "Rajesh", 8000,"HR"));
		list.add(new Employee(103, "Ravi", 4000,"Sales"));
		list.add(new Employee(104, "Ramu", 2000,"Sales"));
		
		list.add(new Employee(105, "Raghu", 8000,"Management"));
		list.add(new Employee(106, "Raghav",9000,"Support"));
		list.add(new Employee(107, "Rajesh", 11000,"Support"));
		return list;
	}
}