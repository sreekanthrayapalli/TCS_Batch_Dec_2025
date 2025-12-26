package com.tcs.sample.exceptions;

public class ValidateUser {

	public void validate(String username, String password) throws LoginException {
		if(username.equals("admin") && password.equals("admin123")) {
			System.out.println("Welcome to the application ");
		}else {
			LoginException le = new LoginException("Invalid");
			throw le;
		}
	}
}
