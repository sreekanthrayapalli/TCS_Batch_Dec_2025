package com.tcs.sample.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(10);
		list.add(11);
		list.add(10);
		
		list.add(100);
		list.add(105);
		list.add(101);
		list.add(100);
		System.out.println("values "+list);
		System.out.println("size of list is "+list.size());
		Integer io = 10;
		boolean b = list.remove(io);
		System.out.println("now size is "+list.size());
		System.out.println("after remove one object "+list);
		System.out.println(list);
		
		System.out.println("get values one by one");
		
		Iterator ite = list.iterator();//10  20  30
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("Using for loop");//java 1.5
		for(Object obj :list) {
			System.out.println(obj);
		}
		
		//Example2 program with Set set = new HashSet()   
		//Example3 SortedSet ss = new TreeSet();
		
	}

}
