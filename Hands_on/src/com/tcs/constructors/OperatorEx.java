package com.tcs.constructors;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator op = new Operator(10, 20);
		op.sum();
		op.mul();

	
		op.setValues(100, 200);
		op.sum();
		op.mul();
		op.updateBalance(5000);
		op.displayBalance();
	}

}
