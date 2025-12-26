package com.tcs.sample.abstractex;

public class SubOperator extends Operator {

	@Override
	void ope(int a, int b) {
		int sub = a-b;
		System.out.println("Subtraction is "+sub);
	}
	

}
