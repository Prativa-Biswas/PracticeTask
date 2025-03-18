package com.nt.colecction;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	 public static void main(String[] args) 
     {
			/*List<Number> list = new ArrayList<Number>();
			list.add(7);
			list.add(8);
			list.add(7);
			Number index = list.get(Integer.valueOf(7));
			System.out.println(index);*/
		 
		 List<String> list1 = new ArrayList<String>();
			list1.add("Dohni");
			list1.add("Sahwag");
			list1.add("Bumrah");
			list1.set(0, "Virat");
			list1.add(0, "Rohit");
			System.out.println(list1);
      }

}
