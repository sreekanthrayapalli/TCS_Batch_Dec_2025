package com.tcs.springcoreexample.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AbstractPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tcs.springcoreexample.basic.bean.Employee;
import com.tcs.springcoreexample.basic.repo.EmployeeRepo;

import jakarta.validation.Valid;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	public void saveEmp(@Valid Employee obj) {
		repo.save(obj);
	}
	
	public Employee getEmployee(int empno) {
		return repo.getReferenceById(empno);
	}
	
	public List<Employee> getAll(){
		return repo.findAll();
	}
	
	public List<Employee> getEmployeeByName(String ename){
		return repo.findByEname(ename);
	}
	
	public List<Employee> getEmployeeByEmail(String email){
		return repo.findByEmail(email);
	}
	
	public List<Employee> getEmployeesOrderByName(){
		return repo.findAllEmployees();
	}
	
	public List<Employee> getEmployeesOrderByName(int sal){
		return repo.findAllEmployees(sal);
	}
	
	public List<Employee> getEmployeesPage(int pageNumber, int pageSize){
		Pageable p = PageRequest.of(pageNumber,pageSize);
		return repo.findAll(p).toList();
	}
}
