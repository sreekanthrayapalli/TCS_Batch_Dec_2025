package com.tcs.sample.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		for(Map.Entry<Integer, String> me:map.entrySet()) {
			map.put(4, "four");
			System.out.println(me.getKey()+"  "+me.getValue());
		}

		System.out.println(map.size()+"  "+map);
	}

}
