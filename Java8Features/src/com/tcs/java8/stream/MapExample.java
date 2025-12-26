package com.tcs.java8.stream;

import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Employee> list = Util.getEmployees();
		
		list.stream().map(x->x.getEname()).
				forEach(x->System.out.println(x))
				;
		//display only employee numbers;
		list.stream().map(x->x.getEmpNo()).forEach(System.out::println);
		
		//display employee salaries which are less then 5000
		list.stream().filter(x->x.getSal()<5000).map(x->x.getSal()).
		forEach(System.out::println);
		
	}

}
