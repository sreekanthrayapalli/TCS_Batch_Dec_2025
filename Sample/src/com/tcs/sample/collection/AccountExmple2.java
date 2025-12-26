package com.tcs.sample.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class AccountExmple2 {

	public static void main(String[] args) {
		Account a1 = new Account(110, "srinu", 5000);
		Account a2 = new Account(101, "Krishna", 6000);
		Account a3= new Account(124,"Sekhar",6000);
		a1.setCustomerRefNumber("1a");
		a2.setCustomerRefNumber("2a");
		a3.setCustomerRefNumber("3a");
		//new AccountRefSort() will the data sorted order of customerRefNumber
		SortedSet<Account> sortedSet = new TreeSet<>(new AccountRefSort());
		sortedSet.add(a1);
		sortedSet.add(a2);
		sortedSet.add(a3);
		
		for(Account a: sortedSet) {
			System.out.println(a.getAccountNumber()+"  "+a.getAccountName()+"   "+a.getCustomerRefNumber());
		}
	}

}
