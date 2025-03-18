package com.nt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap<String, Integer> hm1= new HashMap<String, Integer>();
		hm1.put("A", 1);
		hm1.put("A", 2);
		hm1.put(new String("A"), 3);
		System.out.println("Size of hm1 is: "+hm1.size());
		System.out.println(hm1);
		System.out.println("---------------------------");
		HashMap<Object, Object> hm2= new HashMap<Object, Object>();
		hm2.put("A", 1);
		hm2.put("A", 2);
		hm2.put(new String("A"), 3);
		hm2.put(65, 4);
		System.out.println("Size of hm2 is: "+hm2.size());
		System.out.println(hm2);
		System.out.println("---------------------------");
		HashMap<Integer, Integer> hm3= new HashMap<Integer, Integer>();
		hm3.put(128, 1);
		hm3.put(128, 2);
		
		System.out.println("Size of hm3 is: "+hm3.size());
		System.out.println(hm3);
		System.out.println("---------------------------");
		
            Map<Integer, Integer> map= new HashMap<Integer, Integer>();
            map.put(1, 11);
            map.put(2, 11);
            map.put(3, 11);
            map.put(4, 11);
            map.put(5, 11);
            map.put(6, 11);
            map.put(7, 11);
            map.put(8, 11);
            map.put(9, 11);
            map.put(10, 11);
            map.put(11, 11);
            map.put(12, 11);
            map.put(13, 11);
            map.put(14, 11);
            map.put(15, 11);
            map.put(16, 11);
            System.out.println(map.size());
            
            System.out.println("For each loop: ");
            
           for(Entry<Integer, Integer> map1:map.entrySet()) //HashMap.Entry<Integer, Integer> also allowed 
           {
        	   System.out.println("kay: "+map1.getKey()+" Value: "+map1.getValue());
           }
            
           System.out.println("Iterator.........");
           Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
           //iterator.forEachRemaining(itr->System.out.println(itr));
           iterator.forEachRemaining(itr->System.out.println("Key: "+itr.getKey()+" value: "+itr.getValue()));
           
           map.forEach((k,v)->System.out.println(k+" "+v));
	}

}
