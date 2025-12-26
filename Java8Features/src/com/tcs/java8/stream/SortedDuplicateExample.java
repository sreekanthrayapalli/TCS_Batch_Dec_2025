package com.tcs.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDuplicateExample {

	public static void main(String[] args) {
		
		List<Employee> list = Util.getEmployees();
		List<String> names =list.stream().map(x->x.getEname()).distinct().collect
		(Collectors.toList());
		
		System.out.println(names.size());
		System.out.println("names in ascending order");
		list.stream().map(x->x.getEname()).sorted().forEach(System.out::println);
		
		System.out.println("names in descending order");
		list.stream().map(x->x.getEname()).sorted(Comparator.reverseOrder()).
		forEach(System.out::println);
		
		
		list.stream().map(x->x.getEname()).sorted((x,y)->y.compareTo(x)).
		forEach(System.out::println);
	}

}
