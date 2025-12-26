package com.tcs.sample.basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// w.a.p to print reverse of the given number
		
		int input;
		int bc;
		for(bc=1;bc<500;bc++) {
		input = bc;
		//125   521
		int r,rev=0;
		while(input!=0) {
			r=input%10;//5    2       1
			rev=rev*10+r;//5      52    521
			input = input/10; //12      1
		}
		
		
		if(bc==rev) {
			System.out.print(bc+"  ");
		}
		}
	}
}
