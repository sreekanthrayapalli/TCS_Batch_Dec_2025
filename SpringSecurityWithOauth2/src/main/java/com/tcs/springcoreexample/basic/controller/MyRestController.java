package com.tcs.springcoreexample.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping("/msg")
	public String getHello() {
		return "Welcome to the page";
	}
	
}
