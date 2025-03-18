package com.nt.primitiveStream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Feb7th_Asignent1 {
	 static class Employee
	    {
	        private Integer id;
	        private String name;
	        public Integer getId() {
	            return id;
	        }
	        public String getName() {
	            return name;
	        }
	        public Employee(Integer id, String name) {
	            super();
	            this.id = id;
	            this.name = name;
	        }
	        @Override
	        public String toString() {
	            return "Employee [id=" + id + ", name=" + name + "]";
	        }
	    }
	public static void main(String[] args) {
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(114);
		List<Integer> list2 = list.stream().distinct().toList();
		System.out.println(list2);*/
		//Q2
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(13);
		list.add(16);
		list.add(18);
		List<Integer> list2 = list.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(list2)*/;
    //Q3
	/*  List<Integer> list = new ArrayList<Integer>();
	   list.add(12);
	   list.add(13);
	   list.add(16);
	   list.add(14);
	   Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
	   System.out.println(max);*/
		//Q4
		/*	 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		    arrayList.add(20);
		    arrayList.add(21);
		    arrayList.add(22);
		    arrayList.add(23);
		    List<Integer> collect = arrayList.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		    System.out.println(collect);*/
		//Q5
		
		/*ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
		System.out.println(list);*/
		//6
		/*ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().dropWhile(x->x<=10).toList();
		System.out.println(list);*/
		//Q7
		/*	ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().takeWhile(x->x<=10).toList();
		System.out.println(list);*/
		//Q8
		/*ArrayList<Integer> al=new ArrayList<Integer>();
		  al.add(-1);
		  al.add(-2);
		  al.add(-5);
		  al.add(0);
		  al.add(1);
		  al.add(2);
		  List<Integer> list = al.stream().skip(1).filter(y->y<=0).peek(x->{}).toList();
		  System.out.println(list);*/
		//Q9
		/*TreeSet<Integer> treeSet=new TreeSet<Integer>((x,y)->y.compareTo(x));
		treeSet.add(10);
		treeSet.add(14);
		treeSet.add(13);
		System.out.println(treeSet);
		treeSet.stream().sorted(new Comparator<Integer>() {
		    @Override
		    public int compare(Integer o1, Integer o2) {
		        return o1 + o2;
		    }
		}).forEach(System.out::println);*/
		//Q10
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		List<Integer> list = al.stream().limit(4).toList();
		System.out.println(list);*/
		//Q11
		/* List<Integer> list = Arrays.asList(1,2,3,4,5);
		  list.stream().map(k -> k*2+3-k).forEach(k -> System.out.print(k +" "))*/;
		
		  //Q12
			/*List<List<String>> list= Arrays.asList(Arrays.asList("1","2","3","4","5"),Arrays.asList("6","7","8","9","10"));
			  list.stream().flatMap(x -> list.stream())
			  .forEach(System.out::print);*/
		//Q13
		/*List<String> words = Arrays.asList("apple", "banana", "cherry");
		  long count = words.stream()
		                    .map(String::toUpperCase)
		                    .filter(s -> s.startsWith("A"))
		                    .count();
		  System.out.println(count);*/
	//Q19
	/* List<String> words = Arrays.asList();
	   String result = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).orElse("NULL");
	   System.out.println(result); */
	/*//Q26
			  Comparator<Integer> comparator = new Comparator<Integer>() {
	        public int compare(Integer o1, Integer o2) {
	            return o2.compareTo(o1);
	        }
	    };
	    List<Integer> list = List.of(54,34,234,23,364,3);
	    list.stream().sorted(comparator).filter(k -> k%2 == 1).forEach(k -> System.out.print(k + " "));
	*/
	//Q20
	/*  List<String> al = Arrays.asList("A", "B", "C", "D");
	    List<String> list = al.stream().skip(1).filter(x -> x.startsWith("B")).peek(x -> {}).toList();
	    System.out.println(list);*/  
//Q21
	/*List<Integer> list = List.of(2, 3, 4, 5, 6);
	  list.stream().takeWhile(x -> x >= 0).map(x -> x * 0 + 2 + 3).peek(System.out::print).toList();  
	*/
	//Q22
	/* List<Integer> list = List.of(54,34,234,23,364,3);
	   list.stream().map(k -> k-k+2).filter(k -> k!=0).map(k -> 100)
	   .forEach(k -> System.out.print(k - 10 + " "));
	 */
		  
  //Q27	 
	/* List<Employee> list = List.of(new Employee(1, "John") ,
	         new Employee(5, "Ram") ,
	         new Employee(7, "Tear") ,
	         new Employee(4, "Jerry") ,
	         new Employee(22, "You"));
	list.stream().limit(3).sorted((o1,o2)->o1.getId() - o2.getId()).forEach(System.out::println);
	*/
	//Q29
		  List mylist = new ArrayList();
	        int[] val = {15, 5565, 646, 233, 100};
	        for (int element : val)
	            mylist.add(new Integer(element));
	        System.out.println(mylist);
	        Iterator iterator = mylist.iterator();
	        int i = mylist.size();  //i =
	        while (iterator.hasNext()) {
	            Integer element = (Integer) iterator.next();
	            int value = element.intValue();
	            i--;
	            if ((value < 100) || mylist.get(i).equals(100))
	                iterator.remove();
	        }
	        System.out.println(mylist);
		  
	//Q28
	        
	        ArrayDeque<String> de = new ArrayDeque<String>();
	        de.push("well !!");
	        de.push("prepare");
	        System.out.println("Hi Everyone All The Best!!!");
	        for (Object element : de) {
	            System.out.println(element);
	        }
	 //Q30
	      
	        class demo
	        {  String name;Integer id;
	            public demo(String name, Integer id)
	            {    this.name = name;this.id = id;
	            }
	            public String getName() {return name;}
	            public Integer getId() {return id;}
	            static void meth()
	            {
	                TreeMap<demo, Integer> tm
	                                = new TreeMap<>((a,b)->a.getName().compareTo(b.getName()));
	                tm.put(new demo("Hello", 01), 1);
	                tm.put(new demo("zello", 05), 2);
	                tm.put(new demo("Bello", 011), 3);
	                tm.put(new demo("Oello", 010), 4);
	                WeakHashMap<demo, Integer> wm = new WeakHashMap<>(tm);
	                wm.forEach(new BiConsumer<demo, Integer>()
	                {
	                    public void accept(demo t, Integer u)
	                    {
	                        System.out.println(t.getName()+ " " + t.getId() + " " + u);
	                    }
	                });}}
	        demo.meth();
	}

}
