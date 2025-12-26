package com.tcs.sample.inheritance2;

public class Parent extends GrandParent{

	private int a;
	private int b;
	
	Parent(){
		super(10);
		System.out.println("this is default of parent");
	}

	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("this is  Paremter of parent");
	}
}
