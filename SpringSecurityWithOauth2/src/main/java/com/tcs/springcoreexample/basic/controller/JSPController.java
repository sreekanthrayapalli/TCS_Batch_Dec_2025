package com.tcs.springcoreexample.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {

	@RequestMapping("/sam")
	public String getJSPPage() {
		return "sample";
	}
	
	@RequestMapping("/login")
	public String getLPage() {
		return "login";
	}
	
	@RequestMapping("/wel")
	public String getWelcomePage() {
		return "welcome";
	}
}
