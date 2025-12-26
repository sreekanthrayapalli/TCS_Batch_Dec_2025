package com.tcs.java8.stream;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(i=0;i<=10;i++)
		IntStream is = IntStream.rangeClosed(1, 10);
		is.forEach(System.out::println);
		
		IntStream is1 = IntStream.rangeClosed(1, 5);
		is1.forEach(x->{
			IntStream is2 = IntStream.rangeClosed(1, x);
			is2.forEach(y->{
				System.out.print("x");
			});
			System.out.println();
		});

	}

}
