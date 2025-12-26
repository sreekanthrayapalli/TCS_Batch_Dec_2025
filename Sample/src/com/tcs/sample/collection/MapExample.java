package com.tcs.sample.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "pqr");
		System.out.println(map.size());

		System.out.println(map.remove(3));
		map.put(1, "pqr");

		System.out.println(map);

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + "   " + map.get(key));
		}

		System.out.println("Using entrySet method");

		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Map.Entry<Integer, String> me : entries) {
			System.out.println(me.getKey() + "   " + me.getValue());
		}

	}

}
