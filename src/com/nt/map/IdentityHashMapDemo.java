package com.nt.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hmap=new HashMap<>();
		hmap.put("Nit", "Hyderabad");
		hmap.put(new String("Nit"), "Ameerpet");
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		System.out.println("---------------------------------------------------");
		
		IdentityHashMap<String ,String> imap= new IdentityHashMap<>();
		imap.put("Nit", "Hyderabad");
		imap.put(new String("Nit"), "Ameerpet");
		System.out.println(imap.size());
		System.out.println(imap);

	}

}
