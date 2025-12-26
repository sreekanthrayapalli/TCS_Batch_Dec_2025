package com.tcs.java8.stream;

import java.util.Arrays;
import java.util.List;

public class CountMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,2,1,5,3,-1,4);
		
		//count even numbers
		long count=list.stream().filter(x->x%2==0).count();
		System.out.println("number even are "+count);
		
		
		//first find even numbers and multiple with 3 again 
		//display the result or take those into list
		
		list.stream().filter(x->x%2==0).map(x->x*3).forEach(System.out::println);
		
	}

}
