package p1;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class QueueExample {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(1);
		s.add(2);
		for(Integer i: s) {
			System.out.println(i);
			s.add(3);
		}
		System.out.println("size after "+s.size());
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		
		for(Map.Entry<Integer, String> me: map.entrySet()) {
			System.out.println(me.getKey()+"  "+me.getValue());
			map.put(3, "threee");
			
		}
		System.out.println(map.size());
		
	}

}
