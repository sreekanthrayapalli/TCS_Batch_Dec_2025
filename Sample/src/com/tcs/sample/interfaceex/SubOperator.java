package com.tcs.sample.interfaceex;

public class SubOperator implements Operator {

	@Override
	public void ope(int a, int b) {
		int sub = a-b;
		System.out.println("Subtraction is "+sub);
	}

}
