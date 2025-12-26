package com.tcs.java8.predefinedfunctional;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Example1 {

	public static void main(String[] args) {
		UnaryOperator<Integer> un = (x)->x*x;
		
		BinaryOperator<Float> bo = (x,y)->x*y;
		
		BinaryOperator<Integer> bo2 = (x,y)->x+y;
		
		Function<String, Integer> fun = (a)->a.length();
		
		Predicate<Integer> p = (x)->x==10;
		
		
		Consumer<Integer> c1 = t ->{
			
		};
	}

}
