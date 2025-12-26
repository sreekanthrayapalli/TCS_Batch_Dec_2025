package com.tcs.springrest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springrest.bean.Employee;

@RestController
public class EmployeeController {

	private Map<Integer, Employee> maps;
	
	public EmployeeController() {
		maps = new HashMap<>();
		maps.put(1, new Employee(1,"Ramesh",5000));
		maps.put(2, new Employee(2,"Ravi",3000));
		maps.put(3, new Employee(3,"Ramu",8000));
		maps.put(4, new Employee(4,"Raju",7000));
		maps.put(5, new Employee(5,"Rajesh",6000));
	}
	
	@RequestMapping("/getallemps")
	public List<Employee> getAllEmps(){
		return new ArrayList<>(maps.values());
	}
	
	@RequestMapping("/getemp/{empno}/{ename}")
	public Employee getEmployee(@PathVariable int empno) {
		return maps.get(empno);
	}
	
	@RequestMapping("/getemployee")
	public Employee getEmployee2(@RequestParam int empno) {
		return maps.get(empno);
	}
	
	@PostMapping("/saveemp")
	public String saveEmployee(@RequestBody Employee emp) {
		if(maps.containsKey(emp.getEmpno())) {
			return "Employee number already exists";
		}
		maps.put(emp.getEmpno(), emp);
		return "Employee object has been saved";
	}
	
	@DeleteMapping("/deleteemp")
	public String deleteEmp(@RequestParam int empno) {
		if(maps.containsKey(empno)) {
			maps.remove(empno);
			return "Employee data has been removed";
		}else {
			return "Employee data is not there";
		}		
	}
	
	@PutMapping("/updateemp")
	public String updateEmp(@RequestBody Employee emp) {
		if(maps.containsKey(emp.getEmpno())) {
			maps.put(emp.getEmpno(), emp);
			return "Employee data has been updated";
		}else {
			return "Employee data is not there";
		}
	}	
}
