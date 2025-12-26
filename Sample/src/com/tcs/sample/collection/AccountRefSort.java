package com.tcs.sample.collection;

import java.util.Comparator;
//
public class AccountRefSort implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getCustomerRefNumber().compareTo(o2.getCustomerRefNumber());
	}
}
