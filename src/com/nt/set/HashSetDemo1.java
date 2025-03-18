package com.nt.set;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet<Object> hst=new HashSet<Object>();
		
		hst.add("Nit");
		hst.add(new String("Nit"));
		hst.add(new String("Nit"));
		
		
		hst.add(new StringBuffer("NIT"));
		hst.add(new StringBuffer("NIT"));
		System.out.println("HashSet size: "+hst.size());
		System.out.println("elements: "+hst);
		
	}

}
