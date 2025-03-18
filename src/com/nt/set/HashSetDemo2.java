package com.nt.set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		boolean b[]= new boolean[5]; 

		HashSet<Object> hst= new HashSet<Object>();
		
		b[0]=hst.add(23);
		b[1]=hst.add(23);
		b[2]=hst.add(new String("Prativa"));
		b[3]=hst.add(null);
		b[4]=hst.add("Prativa");
		
		System.out.println("arrays: "+Arrays.toString(b));
		
		
		
	}

}
