package com.nt.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> li= new LinkedList<Integer>();
		
		li.add(23);
		li.add(33);
		li.add(43);
		li.add(53);
		li.add(63);
		li.add(73);
		li.add(63);
		li.add(83);
		System.out.println(li);
		li.addFirst(93);
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li.removeLastOccurrence(63));
		li.addLast(70);
		li.set(3, 103);
		System.out.println(li);
		li.remove();// remove the first element 
		System.out.println(li);
		Iterator<Integer> iterator = li.iterator();
		
		iterator.forEachRemaining(itr->System.out.println(itr));
		

	}

}
