package com.nt.stream;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Feb_5Assigment3 {

	public static void main(String[] args) {

		HashMap<String,Integer> map=new HashMap<>();
		map.put("Prativa", 234);
		map.put(new String("Prativa"), 675);
		
		System.out.println(map);
		System.out.println(map.size());
		
		IdentityHashMap <String,Integer> imap= new IdentityHashMap<String, Integer>();
		imap.put("Prativa", 234);
		imap.put(new String("Prativa"), 675);
		System.out.println(imap);
		System.out.println(imap.size());
		
	}

}
