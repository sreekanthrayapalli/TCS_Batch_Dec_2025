package com.tcs.sample.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccountEx {

	public static void main(String[] args) {
		//List<Account> list = new ArrayList<>();
		SortedSet<Account> collections = new TreeSet<>();
		collections.add(new Account(100, "abc", 5000));
		collections.add(new Account(25, "dfdf", 5000));
		collections.add(new Account(32, "sldkjf", 5000));
		collections.add(new Account(4, "[pqr", 5000));
		collections.add(new Account(100, "xyz", 5000));
		
		
		for(Account a:collections) {
			a.displayInfo();
		}
		
	}

}
