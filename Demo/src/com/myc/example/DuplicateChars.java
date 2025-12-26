package com.myc.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChars {

	public static void main(String[] args) {
		String s = "aabbcd";
		Map<String, Long> map = new HashMap<>();
		char[] ch= s.toCharArray();
		for(char c : ch) {
			
		}
		
		
		//map= s.chars().mapToObj(x->(char)x+"").collect(Collectors.toMap(x->x, y->1,(x,y)->x+y));
		map= s.chars().mapToObj(x->(char)x+"").collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
}
