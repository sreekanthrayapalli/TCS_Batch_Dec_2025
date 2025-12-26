package com.tcs.java8.functionalinterface;

public class Account implements Comparable<Account>{

	private int accountNumber;
	private String accountName;
	private int balance;
	
	//Adding this variable and sort based this variable in TreeSet
	private String customerRefNumber;
	
	public Account(int accountNumber, String accountName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public void displayInfo() {
		System.out.println(accountNumber+"  "+accountName+"  "+balance);
	}

	public int compareTo(Account o) {
		
		return this.accountNumber-o.getAccountNumber();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomerRefNumber() {
		return customerRefNumber;
	}

	public void setCustomerRefNumber(String customerRefNumber) {
		this.customerRefNumber = customerRefNumber;
	}

}
