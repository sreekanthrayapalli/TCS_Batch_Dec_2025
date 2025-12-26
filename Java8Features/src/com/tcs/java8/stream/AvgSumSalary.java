package com.tcs.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class AvgSumSalary {

	public static void main(String[] args) {
		List<Employee> list = Util.getEmployeesWithDeptno();
		Double avgSal = list.stream().collect(Collectors.averagingInt(x->x.getSal()));
		
		
		Long sal = list.stream().collect(Collectors.summarizingInt(
				x->x.getSal())).getSum();
	}

}
