package com.tcs.exception;

//p1
public class Calculation {
//throws is giving indication to keep the method in try- catch block
	// it is giviing information about exception names
	void div(String input[]) throws ArrayIndexOutOfBoundsException, 
	ArithmeticException, NumberFormatException {
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = a / b;
		System.out.println(c);
	}
}
