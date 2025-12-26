package com.tcs.sample.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		//add 1 to 20 to list
		for(int i=1;i<=20;i++) {
			list.add(i);
		}
		int sum =0;
		for(Integer i:list) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum of odds from list is "+sum);

	}

}
