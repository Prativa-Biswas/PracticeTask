package com.nt.stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Feb_5Assigment {

	public static void main(String[] args) {
		
		//Q1
		/*Map<String,String> map = new HashMap<>();
		map.put("Ravi","Ampt");
		map.put(new String("Ravi"),"Hyd");
		
		System.out.println(map);*/
		
		//Q2
		/* Integer i1 = 128;
			Integer i2 = 128;		
			System.out.println(i1==i2);
			System.out.println(i1.equals(i2));*/
		//Q3
		/* Map<Integer,String> map = new HashMap<>();
		map.put(128,"Ampt");
		map.put(new Integer(128),"Hyd");
		System.out.println(map.size());*/
		//Q4
		/*HashMap hash = new HashMap<>();
		hash.put("nit", 500);
		hash.put("info", 644);
		hash.put("tech", "google");
		System.out.println(hash.get("tech"));
		System.out.println(hash.get("google"));
		System.out.println(hash.getOrDefault("nit", "Technology"));
		System.out.println(hash.get("info"));*/
		//Q5 same of 4
		//Q6
		/*Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);
		
		map.replaceAll((k, v) -> v * 2);
		
		System.out.println(map);*/
		//Q7
		
		/*HashMap participant = new HashMap();
		participant.put(1 + 1, "Dhoni");
		participant.put(1 + 1, "Kohli");
		participant.put(2 + 1, "Rohit");
		Set set = participant.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
		    Map.Entry m = (Entry) itr.next();
		    System.out.print(m.getKey() + " " + m.getValue()+" ");
		    }*/
		//Q8
		
		/* Map<ToDos, String> m = new HashMap<ToDos, String>();
		 ToDos t1 = new ToDos("Monday");
		 ToDos t2 = new ToDos("Monday");
		 ToDos t3 = new ToDos("Tuesday");
		 m.put(t1, "doLaundry");
		 m.put(t2, "payBills");
		 m.put(t3, "cleanAttic");
		 System.out.println(m.size());
		
		*/
		
		//Q9
		/* NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		 map.firstKey();
		 System.out.println(map.size()); // will throw NoSuchElementException
		 */
		
		//Q10
		 Map<String, Integer> map = new HashMap<String, Integer>();
         map.put("T", 1);
         map.put("M", 2);
         //map.keySet().add("A",3);// compilation error cause keyset will return set 
        // map.keySet().add("A"); UnsupportedOperationException (immutable set) cause When you call map.keySet(), it returns a Set view backed by the original HashMap.
         System.out.println(map.size());
	}

}

class ToDos 
{
      String day;

      ToDos(String d) 
      {
           day = d;
      }

      public boolean equals(Object o) 
      {
            return ((ToDos) o).day == this.day;
      }

	  //Comment hashcode method and see and analyse the result 
      public int hashCode() { return 9; }
}
