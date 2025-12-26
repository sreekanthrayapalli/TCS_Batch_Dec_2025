package com.tcs.strings;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

		String s1 ="Hi how are you I am good";
		
		String []str = s1.split(" ");
		System.out.println(Arrays.toString(str));
		String maxWord="";
		
		for(int i=0;i<str.length;i++) {
			if(maxWord.length()<str[i].length()) {
				maxWord=str[i];
			}
		}
		System.out.println("max word is "+maxWord);
	}

}
