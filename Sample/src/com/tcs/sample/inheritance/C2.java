package com.tcs.sample.inheritance;

public class C2 extends C1 {

	public C2() {
		System.out.println("default C2");
	}
	
	public C2(int a,int b) {
		System.out.println("two parameter C2");
	}
	
	public C2(int a) {
		System.out.println("one parameter C2");
	}
}
