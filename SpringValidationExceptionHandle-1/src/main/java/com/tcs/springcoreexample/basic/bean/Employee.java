package com.tcs.springcoreexample.basic.bean;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "empno")
public class Employee {

	@Id
	@NotNull
	@Min(value = 1,message="give proper employee number")
	@Max(value=25000, message="employee number should be less then 25k")
	private int empno;
	
	@Column
	@NotEmpty
	@Length(min = 4, max = 20,message = "Proper name")
	private String ename;
	
	@Column
	private int sal;
	
	@Column
	@Length(min = 10, max=15, message = "give proper phone number")
	private String phoneNumber;
	
	@Column
	@NotEmpty
	@Length(min = 10, max=15, message = "give proper Address")
	private String address;
	
	@Column
	@Email(message = "give proper email")
	private String email;
	
	@Column
	private String deptno;
	
	@OneToOne
	@JoinColumn(name = "deptno")
	private Dept d;
	
	@OneToOne
	@JoinColumn(name = "empno")
	private PFBankDetails pfDetails;
	
	public PFBankDetails getPfDetails() {
		return pfDetails;
	}
	public void setPfDetails(PFBankDetails pfDetails) {
		this.pfDetails = pfDetails;
	}
	public Employee(int empno, String ename, int sal, String phoneNumber, String address, String email) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	public Employee() {
		
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
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
}
