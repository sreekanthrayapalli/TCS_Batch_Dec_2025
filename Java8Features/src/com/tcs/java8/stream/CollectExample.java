package com.tcs.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Util.getEmployees();
		
		List<String> names = list.stream().map(x->x.getEname()).
				collect(Collectors.toList());
		
		System.out.println(names.size());
		
		
		//w.a.p to extract Employee names into list whose employee number is more then 
		//103
	}

}
