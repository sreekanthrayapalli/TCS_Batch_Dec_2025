package com.tcs.java8.stream;

import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		//forEach method from Stream
		List<Employee> list = Util.getEmployees();
		//
		list.stream().forEach(x->{
			System.out.println(x);
		});
		System.out.println("Employees are getting salary more then 5k");
		//display employees who are getting salary more then 
		//5000
		list.stream().filter(x->x.getSal()>5000).forEach(x->System.out.println(x));
	}

}
