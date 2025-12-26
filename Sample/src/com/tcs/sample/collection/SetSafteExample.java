package com.tcs.sample.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetSafteExample {

	public static void main(String[] args) {
		Set<Integer> list= new ConcurrentSkipListSet<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for(Integer i:list) {
		
			System.out.println(i);
			Random r = new Random();
			int num = r.nextInt(1000,9999);
			list.add(num);
		}
		
		System.out.println("size of list is "+list.size()+"  "+list);


	}

}
