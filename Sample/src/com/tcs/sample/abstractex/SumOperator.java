package com.tcs.sample.abstractex;

public class SumOperator extends Operator{

	@Override
	void ope(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}

}
