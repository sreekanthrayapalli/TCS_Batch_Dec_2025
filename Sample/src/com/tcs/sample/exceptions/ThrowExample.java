package com.tcs.sample.exceptions;

public class ThrowExample {

	public void div(int a,int b) throws ArithmeticException {
		if(b<0) {
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
		System.out.println("values "+a+"  "+b);
	}
}
