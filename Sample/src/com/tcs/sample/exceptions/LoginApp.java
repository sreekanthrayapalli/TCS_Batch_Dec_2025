package com.tcs.sample.exceptions;

import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username and password");
		String username = sc.next();
		String password = sc.next();
		
		ValidateUser vu = new ValidateUser();
		try {
			vu.validate(username, password);
		} catch (LoginException e) {
			System.err.println("Please give valid username and password");
		}
	}

}
