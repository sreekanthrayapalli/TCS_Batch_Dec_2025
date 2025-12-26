package com.tcs.sample.inheritance;

public class C3 extends C2{

	public C3() {
		System.out.println("default C3");
	}
	
	public C3(int a,int b) {
		this();
		System.out.println("two parameter C3");
	}
	
	public C3(int a) {
		System.out.println("one parameter C3");
	}

}
