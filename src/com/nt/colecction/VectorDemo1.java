package com.nt.colecction;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector<String > v= new  Vector<>();
		v.add("Kolkata");
		v.add("Hyderabad");
		v.add("Bhubaneswar");
		v.add("DElhi");
		v.add("Mumbai");
		
		System.out.println(v.capacity());
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		v.remove("DElhi");
		System.out.println(v);
	}
}
