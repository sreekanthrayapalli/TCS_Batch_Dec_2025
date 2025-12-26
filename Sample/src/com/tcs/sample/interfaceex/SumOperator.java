package com.tcs.sample.interfaceex;

public class SumOperator implements Operator{

	@Override
	public void ope(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}

}
