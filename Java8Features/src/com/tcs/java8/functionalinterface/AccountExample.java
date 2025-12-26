package com.tcs.java8.functionalinterface;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccountExample {

	public static void main(String[] args) {
		Comparator<Account> c1 = (a1,a2)->a1.getCustomerRefNumber().
				compareTo(a2.getCustomerRefNumber());
		
		SortedSet<Account> ss = new TreeSet<>(c1);
		SortedSet<Account>ss2 = new TreeSet<>((a1,a2)->a2.getCustomerRefNumber().
				compareTo(a1.getCustomerRefNumber()));
		Account a1 = new Account(100, "abc", 4000);
		Account a2 = new Account(101, "xyz", 4000);
		Account a3 = new Account(102, "pqr", 4000);
		a1.setCustomerRefNumber("a1"); a2.setCustomerRefNumber("a2");
		a3.setCustomerRefNumber("a3");  ss.add(a2);ss.add(a1);ss.add(a3);
		ss2.add(a2);ss2.add(a1);ss2.add(a3);
		for(Account a: ss) {
			System.out.println(a.getAccountNumber()+"  "+a.getAccountName()+"  "+a.getCustomerRefNumber());
		}
		System.out.println("============");
		for(Account a: ss2) {
			System.out.println(a.getAccountNumber()+"  "+a.getAccountName()+"  "+a.getCustomerRefNumber());
		}

		
		
	}

}
