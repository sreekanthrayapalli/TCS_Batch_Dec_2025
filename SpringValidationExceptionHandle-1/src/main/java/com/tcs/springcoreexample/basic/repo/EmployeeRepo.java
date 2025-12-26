package com.tcs.springcoreexample.basic.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tcs.springcoreexample.basic.bean.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	public List<Employee> findByEname(String ename);
	
	public List<Employee> findByEmail(String email);
	
	public List<Employee> findByEnameOrEmail(String ename, String email);
	
	@Query("select e from Employee e order by e.ename")
	public List<Employee> findAllEmployees();
	
	@Query("select e from Employee e where e.sal=:salary order by e.ename")
	public List<Employee> findAllEmployees(int salary);
	
}
