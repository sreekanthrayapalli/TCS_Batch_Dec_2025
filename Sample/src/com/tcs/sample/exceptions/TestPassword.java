package com.tcs.sample.exceptions;

public class TestPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password1= "abcdd1";
		ValidPassword vp = new ValidPassword();
		ValidateUser vu = new ValidateUser();
		try {
			vp.validatePassword(password1);
			vu.validate("admin", "admin123");
		} catch (Exception e) {
			
			//e.printStackTrace();
			
			System.out.println(e);
		}

	}

}
