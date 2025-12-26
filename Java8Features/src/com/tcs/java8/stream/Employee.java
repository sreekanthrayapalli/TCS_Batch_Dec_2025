package com.tcs.java8.stream;

public class Employee {

	private int empNo;
	private String ename;
	private int sal;
	private String deptno;

	public Employee(int empNo, String ename, int sal) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.sal = sal;
	}
	
	public Employee(int empno, String ename, int sal, String deptno) {
		this(empno, ename, sal);
		this.setDeptno(deptno);
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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

	public String toString() {
		return empNo+" "+ename+" "+sal;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
}
