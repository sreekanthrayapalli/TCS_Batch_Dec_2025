package com.tcs.springmvcexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping("/getmsg")
	public String getMessage() {
		return "Hello Welcome to Spring MVC";
	}
	
}



