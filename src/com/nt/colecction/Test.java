package com.nt.colecction;

import java.util.ArrayList;
import java.util.List;

public class Test {
	 public static void main(String[] args) 
     {
           List<Number> list = new ArrayList<Number>();
           System.out.format("%b %b %b %d",
               list.add(7),
               list.add(null),
               list.add(7),
               list.size());
     }

}
