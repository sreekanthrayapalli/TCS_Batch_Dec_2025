package com.tcs.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,21,30,41,50);
		//before stream
		for(Integer i: list) {
			if(i%10==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("after stream.....");
		
		list = Arrays.asList(12,4,16,18,11);
		Stream<Integer> s1= list.stream();//1    12 4   6   8   11
		Stream<Integer> s2 = s1.filter(x->x>=10); //12    11   16 18
		Stream<Integer> s3 = s2.filter(x->x%3==0);//   12    18
		s3.forEach(x->{
			System.out.println(x);
		});
		list.stream().filter(x->x>=10).filter(x->x%3==0).
		forEach(x->System.out.println(x));
		
		
		
		
	}

}
