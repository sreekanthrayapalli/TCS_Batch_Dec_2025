package com.tcs.sample.exceptions;

public class ThrowExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		ThrowExample te = new ThrowExample();
		te.div(10, -11);
		}catch(ArithmeticException ae) {
			System.err.println("donot give -ve values");
			ae.printStackTrace();
		}
	}

}
