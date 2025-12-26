package com.tcs.springcoreexample.basic.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {

	@NotNull
	@Min(value = 1,message="give proper employee number")
	@Max(value=25000, message="employee number should be less then 25k")
	private int empno;
	
	@NotEmpty
	@Length(min = 4, max = 20,message = "Proper name")
	private String ename;
	private int sal;
	
	@Length(min = 10, max=15, message = "give proper phone number")
	private String phoneNumber;
	
	@NotEmpty
	@Length(min = 10, max=15, message = "give proper Address")
	private String address;
	
	@Email(message = "give proper email")
	private String email;
	
	public Employee(int empno, String ename, int sal, String phoneNumber, String address, String email) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
