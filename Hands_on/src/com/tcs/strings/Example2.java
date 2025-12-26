package com.tcs.strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//W.a.p to check given word is palindrome or not
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any STring");

		String input = sc.next();
		System.out.println(input);
		//input     ====>reverse the input    ===>check input word and reverse word.
		// ==>
		
		StringBuffer sb = new StringBuffer(input);
		String reverse = sb.reverse().toString();
		if(input.equals(reverse)) {
			System.out.println("it is Palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
		
		//String []emails = "abc@gmail.com","xyz@tcs.com", "pqr@yahoo.com"
		//find how many tcs emails are there
		
		
	}

}
