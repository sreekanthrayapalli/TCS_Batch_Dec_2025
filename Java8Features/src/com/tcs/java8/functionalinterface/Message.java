package com.tcs.java8.functionalinterface;

@FunctionalInterface
public interface Message {
	//should have only one abstract method
	void giveMessage();
	
	//default methods
	default void method1() {
		System.out.println("this is m1 method");
	}
	
	//static methods
	static void method2() {
		System.out.println("this is m2 method");
	}
}
