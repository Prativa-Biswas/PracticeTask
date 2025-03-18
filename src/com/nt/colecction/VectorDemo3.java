package com.nt.colecction;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		
		int arr[]= {30,40,50,60,10,20,70,80,90};
		for(int i=0;i<arr.length;i++)
		{
			vector.add(arr[i]);
		}
		System.out.println(vector);
		Collections.sort(vector);
		System.out.println("maximum element: "+Collections.max(vector));
		System.out.println("minimum element: "+Collections.min(vector));
		System.out.println("vector elements: ");
		vector.forEach(vect->System.out.println(vect));
		System.out.println("------------------------------------------------");
		Collections.reverse(vector);
		vector.forEach(vect->System.out.println(vect));

		
		
	}

}
