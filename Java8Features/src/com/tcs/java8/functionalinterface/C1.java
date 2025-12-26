package com.tcs.java8.functionalinterface;

public class C1 implements I1,I2{

	@Override
	public void method1(int a) {
		I1.super.method1(a);
		//I2.super.method1(a);
	}

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.method1(10);
	}
}
