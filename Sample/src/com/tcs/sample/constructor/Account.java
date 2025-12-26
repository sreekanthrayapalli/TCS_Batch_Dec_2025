package com.tcs.sample.constructor;

public class Account {
	int accountNumber;
	String accountName;
	int balance;
	String ifscCode;
	public Account(int accountNumber, String accountName, int balance, String ifscCode) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.ifscCode = ifscCode;
	}
	public Account(int accountNumber, String accountName) {
		this(accountNumber,accountName,0,null);
	}
	public Account(int accountNumber, String accountName, int balance) {
		this(accountNumber, accountName, balance, null);
	}
	
}
