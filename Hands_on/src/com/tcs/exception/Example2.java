package com.tcs.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any inputs");
		
		try {
		int a= sc.nextInt();
		int b = sc.nextInt();
		
		int c=a/b;
		System.out.println("div is "+c);
		}catch(InputMismatchException im) {
			System.out.println("give integers only");
		}catch(ArithmeticException ae) {
			System.out.println("donot give zero for second value");
		}finally {
			System.out.println("Program is completed...");
		}
	}

}
