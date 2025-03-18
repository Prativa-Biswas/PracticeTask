package com.nt.colecction;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		//Stack class methods

		Stack<String> stk=new Stack<>();
		stk.push("wool");
		stk.push("Parrot");
		stk.push("Crow");
		stk.push("Picock");
		stk.push("Penguine");
		System.out.println("After push() method of stack: "+stk);
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println("After pop() method of stack: "+stk);
		System.out.println("Stak is emplty: "+stk.empty());
		
		//Collection interface method
		Stack<Integer> stk2=new Stack<Integer>();
		stk2.add(12);
		stk2.add(22);
		stk2.add(32);
		stk2.add(42);
		stk2.add(52);
		stk2.add(62);
		System.out.println(stk2);
		Stack<String> stk3=new Stack<String>();
		stk3.add("Prativa");
		stk3.add("Ankita");
		stk3.add("Dipesh");
		stk3.add("Nilesh");
		stk3.add("Kabita");
		System.out.println("------------------------------------------");
		Enumeration<String> elements = stk3.elements();
		while(elements.hasMoreElements())
			System.out.println(elements.nextElement());
		System.out.println("------------------------------------------");

		
		Iterator<String> asIterator = elements.asIterator();
		while(asIterator.hasNext())
			System.out.println(asIterator.next()); /// will not print anything as the enumeration already retrieve all element now cursor is in last position
			
		Stack<Double> stk4=new Stack<Double>();
		stk4.add(12.0);
		stk4.add(22.0);
		stk4.add(32.0);
		stk4.add(42.0);
		stk4.add(52.0);
		stk4.add(62.0);
		
		stk4.forEach(x->System.out.println(x));
		System.out.println("-------------------------------");
		
			System.out.println(stk4.peek());
			System.out.println(stk4.empty());
			
			Stack<String> stk5=new Stack<String>();
			stk5.add("Prativa");
			stk5.add("Ankita");
			stk5.add("Dipesh");
			stk5.add("Nilesh");
			stk5.add("Kabita");
			
			System.out.println("Offest positon Prativa is: "+stk5.search("Prativa"));
			System.out.println("Offest positon Kabita is: "+stk5.search("Kabita"));
			System.out.println("Index positon Kabita is: "+stk5.indexOf("Kabita"));

		

	}

}
