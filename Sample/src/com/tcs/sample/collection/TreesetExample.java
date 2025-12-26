package com.tcs.sample.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet = new TreeSet<>(Comparator.reverseOrder());
		sortedSet.add(10);
		sortedSet.add(10);
		sortedSet.add(11);
		sortedSet.add(10);
		
		sortedSet.add(100);
		sortedSet.add(105);
		sortedSet.add(101);
		sortedSet.add(100);
		System.out.println("values "+sortedSet);
		System.out.println("size of list is "+sortedSet.size());
		System.out.println("now size is "+sortedSet.size());
		System.out.println("after remove one object "+sortedSet);
		System.out.println(sortedSet);
		
		System.out.println("get values one by one");
		
		Iterator<Integer> ite = sortedSet.iterator();//10  20  30
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("Using for loop");//java 1.5
		for(Object obj :sortedSet) {
			System.out.println(obj);
		}
		
		//Example2 program with Set set = new HashSet()   
		//Example3 SortedSet ss = new TreeSet();
		
	}

}
