package com.tcs.strings;

public class Example3 {

	public static boolean condition1(String input) {
		return input.contains("@") && input.contains(".");
	}

	public static boolean condition2(String input) {
		return input.split("@").length == 2;
	}

	public static boolean condition3(String input) {
		String[] str = input.split("@");// abc@gmail.com
		boolean result = str[1].split("\\.")[0].length() >= 4;
		return result;
	}

	public static boolean condition4(String input) {
		String[] str = input.split("@");// abc@gmail.com
		boolean result = str[0].length() >= 3;
		return result;
	}

	public static boolean condition5(String input) {
		return input.endsWith(".com");
	}

	public static void main(String[] args) {
		String s1 = "abc@gmail.com";
		boolean result = false;
		if (condition1(s1) && condition2(s1) && condition3(s1) && condition4(s1) && condition5(s1)) {
			System.out.println("valid email");
		} else {
			System.out.println("Invalid email");
		}

	}

}
