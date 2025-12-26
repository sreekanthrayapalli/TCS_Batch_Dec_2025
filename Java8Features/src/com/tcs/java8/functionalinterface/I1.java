package com.tcs.java8.functionalinterface;

public interface I1 {

	default void method1(int a) {
		System.out.println("this is default method1 in i1");
	}
}
