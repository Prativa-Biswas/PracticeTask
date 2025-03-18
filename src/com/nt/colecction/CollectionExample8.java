package com.nt.colecction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample8 {
	public static void main(String[] argv) 
    {
		/*Collection c = new ArrayList();
		c.add("1");
		c.add("2");
		c.add("3");
		Collection c1 = new ArrayList();
		c1.add("1");
		c.retainAll(c1);
		System.out.println(c);*/
		
		List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.indexOf("a"));
        System.out.println(list.indexOf("c"));
        System.out.println(list.indexOf("d"));
        System.out.println(list.indexOf("f"));

    }

}
