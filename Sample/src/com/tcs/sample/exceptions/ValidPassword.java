package com.tcs.sample.exceptions;

import java.util.regex.Pattern;

public class ValidPassword {

	public void validatePassword(String password) throws PasswordException {
		int l = password.length();
		boolean flag = false;
		if (l > 6 && l <= 10) {
			flag = true;
		}

		String regex = "^(?=.*\\d)(?=.*[^a-zA-Z0-9\\s]).*$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(password).matches()  && flag) {
			System.out.println("Valid Password..");
			
		}else {
			PasswordException pe = new PasswordException("Invalid");
			throw pe;
		}
	}
}
