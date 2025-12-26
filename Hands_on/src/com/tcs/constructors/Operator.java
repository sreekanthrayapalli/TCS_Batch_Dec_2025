package com.tcs.constructors;

public class Operator {
	private int a, b, c, d;
	private int bal;

	Operator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void sum() {
		c = a + b;
		System.out.println("sum is " + c);
	}

	void mul() {
		d = a * b;
		System.out.println("Mul is " + d);
	}

	void setValues(int a, int b) {
		this.a = a;
		this.b = b;

	}
	
	void updateBalance(int amount) {
		if(amount>0) {
			bal= bal+amount;
		}
	}
	
	void displayBalance() {
		System.out.println(bal);
	}
}
