package com.tcs.java8.methodreference;

public class MathsMain {

	public static void main(String[] args) {
		Operation ope = (a, b) -> {
			int c = a - b;
			System.out.println("Minus is " + c);
		};
		ope.performAction(20, 10);// 10
		ope = MathsOperations::new;
		ope.performAction(20, 10);// 30
		ope = MathsOperations::div;
		ope.performAction(20, 10);// 2
		MathsOperations mo = new MathsOperations();
		ope = mo::multiplication;
		ope.performAction(20, 10);// 200
	}

}
