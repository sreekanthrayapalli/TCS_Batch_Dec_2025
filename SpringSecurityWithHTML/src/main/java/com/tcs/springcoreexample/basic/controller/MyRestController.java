package com.tcs.springcoreexample.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springcoreexample.basic.bean.LoginRequest;

@RestController
public class MyRestController {

	@RequestMapping("/msg")
	public String getHello() {
		return "Welcome to the page";
	}
	
//	
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@PostMapping("/login")
//	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
//		Authentication auth = authenticationManager
//				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
//		SecurityContextHolder.getContext().setAuthentication(auth);
//		return ResponseEntity.ok("Login successful");
//	}
}
