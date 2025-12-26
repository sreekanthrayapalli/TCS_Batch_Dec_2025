package com.tcs.java8.methodreference;

public class Example1 {
	public static void main(String[] args) {
		C1 obj = new C1();
		I1 i1Obj = obj::m1;
		
		i1Obj.method1();//1    M1
		
		i1Obj = obj::methodC1;
		i1Obj.method1();//2     methodC1
		
		i1Obj = C1::m2;
		i1Obj.method1();//3 m2 static
		
		i1Obj = C1::new;
		i1Obj.method1();//4 constructor 
		I2 i2Obj = C1::new;
		i2Obj.method2(10, 20);
	}
}
