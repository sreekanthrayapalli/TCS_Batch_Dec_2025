package com.tcs.springcoreexample.basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springcoreexample.basic.bean.Operation;

@RestController
public class OperationController {

	@PostMapping("/sum")
	public ResponseEntity<Operation> sum(@RequestBody Operation ope){
		validateInputValues(ope);
		ope.setResult(ope.getInput1()+ope.getInput2());
		return new ResponseEntity<>(ope,HttpStatus.OK);
	}
	
	@PostMapping("/div")
	public ResponseEntity<Operation> div(@RequestBody Operation ope){
		validateInputValues(ope);
		ope.setResult(ope.getInput1()/ope.getInput2());
		return new ResponseEntity<>(ope,HttpStatus.OK);
	}
	
	public void validateInputValues(Operation ope) {
		if(ope.getInput1()==0&& ope.getInput2()==0) {
			throw new NumberFormatException("Zero values");
		}
	}
}
