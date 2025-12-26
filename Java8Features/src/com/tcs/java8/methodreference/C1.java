package com.tcs.java8.methodreference;

public class C1 {
	
	C1(){
		System.out.println("default");
	}

	C1(int a,int b){
		
	}
	void methodC1() {
		System.out.println("this is method in C1");
	}
	
	int methodC1(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	void method2C1(int a,int b) {
		
	}
	
	void m1() {
		System.out.println("this is m1");
	}
	
	static void m2() {
		System.out.println("this is m2 static");
	}
}
