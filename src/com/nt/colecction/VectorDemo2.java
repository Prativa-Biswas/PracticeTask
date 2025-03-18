package com.nt.colecction;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<>(100,10);
		for(int i=0;i<100;i++)
		{
			v.add(i);
		}
		System.out.println("After adding 100th elements caacity: "+v.capacity());
		v.add(110);
		System.out.println("After adding 101th elements caacity: "+v.capacity());
		for(int i=0;i<v.size();i++)
		{
			if(i%5==0)
			   System.out.println();
			
			System.out.print(v.get(i)+"\t");
		}
		
        System.out.println();
		System.out.println("After adding elements caacity: "+v.capacity());
		
		Vector<Integer> v1= new Vector<>(10);

		for(int i=0;i<10;i++)
		{
			v1.add(i);
		}
		System.out.println("After adding 10th elements v1 capacity: "+v1.capacity());
        System.out.println(v1);
        for(int i=0;i<10;i++)
		{
			v1.add(i);
		}
        System.out.println("After adding 11th elements v1 capacity: "+v1.capacity());
        System.out.println(v1);
        for(int i=0;i<10;i++)
		{
			v1.add(i);
		}
        System.out.println("After adding 21th elements v1 capacity: "+v1.capacity());
        System.out.println(v1);
	
	}
}
