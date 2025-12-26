package com.tcs.sample.interfaceex;

public class Operatorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator ope;
		
		ope = new SumOperator();
		ope.ope(10, 20);//1
		
		ope = new SubOperator();
		ope.ope(10, 20);//2
		
		
	}

}
