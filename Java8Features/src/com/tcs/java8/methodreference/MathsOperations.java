package com.tcs.java8.methodreference;

public class MathsOperations {	
	public MathsOperations() {
		
	}
	public MathsOperations(int a,int b) {
		int c=a+b;
		System.out.println("sum is "+c);
	}
	public void multiplication(int a,int b) {
		int c=a*b;
		System.out.println("mul is "+c);
	}
	public static void div(int a,int b) {
		int c=a/b;
		System.out.println("div "+c);
	}

}
