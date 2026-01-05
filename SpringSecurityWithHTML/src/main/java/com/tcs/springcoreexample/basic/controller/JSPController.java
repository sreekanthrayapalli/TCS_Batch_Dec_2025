package com.tcs.springcoreexample.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tcs.springcoreexample.basic.bean.LoginRequest;

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

	@Autowired
	private AuthenticationManager authenticationManager;

	@RequestMapping(name = "/login",method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		Authentication auth = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(auth);
		return ResponseEntity.ok("Login successful");
	}
}
