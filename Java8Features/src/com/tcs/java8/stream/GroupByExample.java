package com.tcs.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {
		List<Employee> list = Util.getEmployeesWithDeptno();
		//IT  --->1,
		//Sales--->   2, 3,
		//HR-->
		
		Map<String,List<Employee>> maps = list.stream().collect(
				Collectors.groupingBy(x->x.getDeptno()));
		
		maps.forEach((x,y)->{
			System.out.println(x+"  "+y);
		});
		System.out.println("=====");
		list.stream().collect(Collectors.groupingBy(x->x.getDeptno())).
		forEach((x,y)->{
			System.out.println(x+"  "+y);
		});
	}
}
