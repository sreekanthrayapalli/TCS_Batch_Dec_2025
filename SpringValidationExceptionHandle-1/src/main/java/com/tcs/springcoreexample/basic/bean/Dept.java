package com.tcs.springcoreexample.basic.bean;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="dept_info")
@Data
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String deptno;
	
	@Column
	private String dname;
	
	@Column
	private String loc;
	
	@Column
	private int capacity;
	
	@OneToMany
	@JoinColumn(name = "deptno")
	List<Employee> emps;
}
