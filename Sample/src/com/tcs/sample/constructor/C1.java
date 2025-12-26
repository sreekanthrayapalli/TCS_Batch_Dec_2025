package com.tcs.sample.constructor;

public class C1 {
	C1(){
		this(10);
		System.out.println("default");
	}
	C1(int a){
		System.out.println("one param");
	}
	C1(int a,int b){
		this(a);
		System.out.println("two param");
	}
	C1(int a,int b, int c){
		this(a,b);
		System.out.println("three param");
	}
	public static void main(String[] args) {
		C1 obj = new C1();//Use C1 obj = new C1(10);   C1 obj = new C1(10,20,30);
	}
}
