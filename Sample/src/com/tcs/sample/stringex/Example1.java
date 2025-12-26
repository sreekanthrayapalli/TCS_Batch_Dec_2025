package com.tcs.sample.stringex;

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb.capacity()+"  "+sb.length());
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		
		String s = "Hello,hai,bye";
		String[]s1 = s.split(",");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		System.out.println("===========");
		StringTokenizer st = new StringTokenizer(s,",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
