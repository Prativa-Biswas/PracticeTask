package com.nt.colecction;

import java.util.ArrayList;
import java.util.Vector;

public class PerfomanceCheck {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		long startTime = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			arrayList.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken for ArrayList: "+(endTime-startTime));
		Vector<Integer> vector = new Vector<Integer>();
		 startTime = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			vector.add(i);
		}
		 endTime = System.currentTimeMillis();
		System.out.println("Total time taken for Vector: "+(endTime-startTime));

	}

}
