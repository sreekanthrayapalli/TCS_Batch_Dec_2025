package com.tcs.exception;

public class Example1 {

	public static void main(String[] args) {
		
		String s="abc";
		char ch= s.charAt(1);
		int c=0;
		try {
			//open database connection
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a / b;
			
		} catch (NumberFormatException nfe) {
			System.out.println("please donot give chars");
		}catch(ArithmeticException ae) {
			System.out.println("donot give zero for second value");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("please two values");
		}finally {
			//close connection
		}
		System.out.println("div " + c);
	}

}
