package com.nt.colecction;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo5 {

	public static void main(String[] args) {

		Vector<Integer> listOfNumber = new Vector<Integer>();
		listOfNumber.add(900);
		listOfNumber.add(200);
		listOfNumber.add(300);
		listOfNumber.add(100);
		listOfNumber.add(800);
		listOfNumber.add(5000);

		System.out.println("Original listOfNumber: " + listOfNumber);
		Collections.sort(listOfNumber);
		System.out.println("Ascending Order" + listOfNumber);

		Collections.sort(listOfNumber, Collections.reverseOrder());
	    System.out.println("Descending Order"+ listOfNumber);

				/*Collections.reverse(listOfNumber);
				System.out.println("Descending Order" + listOfNumber);*/
	    
	    System.out.println("Converting Collection to Array");
	    
	    Object[] arr= listOfNumber.toArray();

	    for(Object number: listOfNumber)
	    {
	    	System.out.println(number);
	    }
	}

}
