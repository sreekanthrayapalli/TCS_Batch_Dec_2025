package com.tcs.springcoreexample.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springcoreexample.basic.bean.PFBankDetails;
import com.tcs.springcoreexample.basic.service.PFService;

@RestController
public class PFController {

	@Autowired
	private PFService service;
	
	@GetMapping("/getpfdetails")
	public ResponseEntity<PFBankDetails> getPFBankDetails(@RequestParam String pfNum){
		
		return new ResponseEntity<PFBankDetails>(service.getDetails(pfNum),HttpStatus.OK);
		
	}
}
