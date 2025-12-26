package com.tcs.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListExample {

	public static void main(String[] args) {
		
		Account a1 = new Account(100, "abc", 4000);
		Account a2 = new Account(101, "xyz", 4000);
		Account a3 = new Account(102, "pqr", 4000);
		a1.setCustomerRefNumber("a1"); a2.setCustomerRefNumber("a2");
		a3.setCustomerRefNumber("a3"); 
		List<Account> l1 = new ArrayList<>();
		l1.add(a1);l1.add(a2);l1.add(a3);
		
		Collections.sort(l1, (x1,x2)->x1.getCustomerRefNumber().compareTo(x2.getCustomerRefNumber()));
		
		for(Account a: l1) {
			System.out.println(a.getAccountName()+"  "+a.getCustomerRefNumber());
		}
		
		
	}

}
