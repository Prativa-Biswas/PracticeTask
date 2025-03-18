package com.nt.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<Integer> set= new HashSet<Integer>();
		set.add(23);
		set.add(53);
		set.add(63);
		set.add(43);
		set.add(73);
		System.out.println(set);
	}

}
