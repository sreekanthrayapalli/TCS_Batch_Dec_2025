package com.tcs.springcoreexample.basic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springcoreexample.basic.bean.Employee;
import com.tcs.springcoreexample.basic.service.EmployeeService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	public EmployeeController() {

	}

	@PostMapping("/saveemp")
	public ResponseEntity<String> saveEmployee(@Valid @RequestBody Employee obj) {
		service.saveEmp(obj);
		return new ResponseEntity<>("Employee data saved", HttpStatus.OK);
	}

	@GetMapping("/getemployee/{empno}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int empno) {
		Employee emp = service.getEmployee(empno);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> list = service.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getallbyname/{ename}")
	public ResponseEntity<List<Employee>> getAllByName(@PathVariable String ename) {
		List<Employee> list = service.getEmployeeByName(ename);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getallbyemail")
	public ResponseEntity<List<Employee>> getAllByEmail(@RequestParam String email) {
		List<Employee> list = service.getEmployeeByEmail(email);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getallbynamesort")
	public ResponseEntity<List<Employee>> getAllByNameSort() {
		List<Employee> list = service.getEmployeesOrderByName();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getallbynamesort/{sal}")
	public ResponseEntity<List<Employee>> getAllByNameSort(@PathVariable int sal) {
		List<Employee> list = service.getEmployeesOrderByName(sal);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getall/{pageNumber}/{pageSize}")
	public ResponseEntity<List<Employee>> getEmployeeOnPagination(@PathVariable int pageNumber,
			@PathVariable int pageSize) {

		return new ResponseEntity<>(service.getEmployeesPage(pageNumber, pageSize),
				
				HttpStatus.OK);

	}
}