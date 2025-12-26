package com.tcs.java8.stream;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	
	void m1() {
		
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,10,50,30,12);
		
		list.stream().filter(x->x%2!=0).forEach(System.out::println);
		
		boolean result = list.stream().anyMatch(x->x%2!=0);
		System.out.println(result);
		
		
	}

}
