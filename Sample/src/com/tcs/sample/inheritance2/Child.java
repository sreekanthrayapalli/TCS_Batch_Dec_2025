package com.tcs.sample.inheritance2;

public class Child extends Parent{

	Child(){
		System.out.println("this is default of child");
	}
	
	Child(int a,int b){
		super(a,b);
		System.out.println("this is parameter of child");
	}
}
