package com.tcs.springcoreexample.basic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springcoreexample.basic.bean.Employee;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	private Map<Integer, Employee> maps;
	
	public EmployeeController() {
		maps = new HashMap<>();
	}
	
	@PostMapping("/saveemp")
	public ResponseEntity<String> saveEmployee(@Valid @RequestBody Employee obj) {
		maps.put(obj.getEmpno(), obj);
		return new ResponseEntity<>("Employee data saved",HttpStatus.OK);
	}
	
	@RequestMapping("/getallemps")
	public ResponseEntity<List<Employee>> getAllEmps(){
		return  new ResponseEntity<>(new ArrayList<>(maps.values()),HttpStatus.OK);
	}
	
	@RequestMapping("/getemp/{empno}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int empno) {
		if(empno<0) {//1
			NullPointerException ne = new NullPointerException("-ve value for input");
			throw ne;
		}//2
		return new ResponseEntity<>(maps.get(empno),HttpStatus.OK);
	}
	
	@RequestMapping("/getemployee")
	public ResponseEntity<Employee> getEmployee2(@RequestParam int empno) {
		return  new ResponseEntity<>(maps.get(empno),HttpStatus.OK);
	}
}
