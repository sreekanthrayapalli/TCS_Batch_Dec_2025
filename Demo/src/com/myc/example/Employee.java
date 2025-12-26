package com.myc.example;

import java.util.ArrayList;
import java.util.List;

public final class Employee {

	private final int empno;
	private final String ename;
	private final List<String> address;

	public Employee(int empno, String ename, List<String> address) {
		this.empno = empno;
		this.ename = ename;

		List<String> newAddress = new ArrayList<>();
		for (String add : address) {
			newAddress.add(add);
		}
		this.address = newAddress;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public List<String> getAddress() {
		List<String> newAddress = new ArrayList<>();
		for (String add : address) {
			newAddress.add(add);
		}
		return newAddress;
	}
}
