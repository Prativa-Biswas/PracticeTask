package sortingInterfaceProgram;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {

		TreeMap<Integer,String> map=new TreeMap<>((t1,t2)->t2.compareTo(t1));
		
		map.put(103, "Mumbai");
		map.put(104, "Kolkata");
		map.put(105, "Chennai");
		map.put(100, "Pune");
		map.put(101, "Delhi");
		map.put(102, "Patna");
		map.put(106, "Hyderabad");
		map.put(107, "Bhubaneswar");
		
		System.out.println(map);
		
		TreeMap<Integer,String> map2= new TreeMap<Integer,String>(map);
		map2.forEach((p1,p2)->System.out.println(p1+" "+p2));
		map2.put(108, "Kerla");
		map2.put(112, "Pondichery");
		System.out.println("------------------------------");
		display(map2);
		System.out.println("-------------------------------");
		map2.forEach((k,v)->System.out.println("key : "+k+"  value: "+v ));
		
		
	}
	public static void display(TreeMap<Integer,String> map)
	{
		Set<Entry<Integer, String>> entrySet = map.entrySet();		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		//iterator.forEachRemaining(System.out::println);
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey()+"  "+next.getValue());
		}
	}

}
