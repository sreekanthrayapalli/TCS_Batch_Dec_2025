package com.tcs.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SkipLimitExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,70,80);
		list.stream().limit(4).forEach(System.out::println);
		System.out.println("skip method");
		list.stream().skip(4).forEach(System.out::println);
		
		//w.a.p to find 3rd max value
		list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).limit(1).forEach(System.out::println);
	}
}