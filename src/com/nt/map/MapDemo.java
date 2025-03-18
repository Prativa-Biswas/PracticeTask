package com.nt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Spliterator;

public class MapDemo {

	public static void main(String[] args) {

		Map<Object ,Object> map= new HashMap<Object, Object>();
		System.out.println(map.put(1,23));
		System.out.println(map.put(2, 34));
		System.out.println(map.put(1, 56));
		
		System.out.println(map.putIfAbsent(3, 78));
		System.out.println(map.putIfAbsent(2, 100));
		
		System.out.println(map);
		map.put(5, "Prativa");
		map.put(4, "Ankita");
		map.put(6, "Prativa");
		map.put(7, "Kolkata");
		map.put(8, "NIT");
		map.put(9, null);
		System.out.println(map.get(6));
		System.out.println(map.get(9));
		System.out.println(map.getOrDefault(10, "key is not available"));
		
		System.out.println(map.containsKey(23));
		System.out.println(map.containsValue(34));
		System.out.println(map.isEmpty());
		System.out.println("size: "+map.size());
		Map<Object ,Object> map2= new HashMap<Object, Object>();
       map2.put("java", "Ravi sir");
       map2.put("Oracle", "Sudhakar sir");
       map2.put("Spring", "Natraj sir");
		map.putAll(map2);
		System.out.println(map);
	System.out.println(map.remove(9));
	System.out.println(map);
		map2.clear();
		System.out.println(map2);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		Iterator<Entry<Object, Object>> iterator = map.entrySet().iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("-------------------------------------------------------");
		Spliterator<Entry<Object, Object>> spliterator = map.entrySet().spliterator();
		spliterator.forEachRemaining(System.out::println);
	}

}
