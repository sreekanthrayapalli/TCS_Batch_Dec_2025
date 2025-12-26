package com.tcs.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapExample {

	public static void main(String[] args) {
		List<Employee> list = Util.getEmployees();
		
		Map<Integer, String> maps = list.stream().collect(
				Collectors.toMap(x->x.getEmpNo(), y->y.getEname()));
		
		
		System.out.println(maps);
		//empno   sal  in the map
	}

}
