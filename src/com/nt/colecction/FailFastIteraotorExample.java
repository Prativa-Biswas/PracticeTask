package com.nt.colecction;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailFastIteraotorExample {

	public static void main(String[] args) {

		Vector<String > v= new  Vector<>();
		v.add("Kolkata");
		v.add("Hyderabad");
		v.add("Bhubaneswar");
		v.add("DElhi");
		v.add("Mumbai");
		
		/*Enumeration<String> ven=v.elements();
		
		while(ven.hasMoreElements())
		{
			System.out.println(ven.nextElement());
			v.add("Pune");// no CurrentModificationException occurs
		}*/
		
		Iterator<String> vitr=v.iterator();
		while(vitr.hasNext())
		{
			System.out.println(vitr.next());
			v.add("Patna");// CurrentModificationException occurs
		}
	}

}
