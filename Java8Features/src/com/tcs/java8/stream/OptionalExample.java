package com.tcs.java8.stream;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		//Optinal<Employee> op = Optional.of( object   )
		//Optional<Employee> op = Optional.empty();
		
		Optional<String> ops = Optional.empty();
		if(ops.isPresent()) {
			System.out.println("object is there");
		}else {
			System.out.println("object is not there");
		}
		
		Employee emp = new Employee(0, null, 0);
				
		Optional<Employee> ope = Optional.of(emp);
		if(ope.isPresent()) {
			System.out.println("emp is there");
		}else {
			System.out.println("emp is not there");
		}
		
		//second way
		ope.ifPresentOrElse(x->System.out.println("emp is there"), 
				()->System.out.println("emp is not there"));

		ope.ifPresentOrElse(x->System.out.println(x.getEmpNo()+"  "+x.getEname()), 
				()->System.out.println("emp is not there"));
		
		
		
		Employee emp2 =null;
		Optional<Employee> ope2 = Optional.ofNullable(emp2);
		if(ope2.isPresent()) {
			System.out.println("emp2 is there");
		}else {
			System.out.println("emp2 is not there");
		}
	}

}
