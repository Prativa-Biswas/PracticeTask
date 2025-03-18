package com.nt.stream;

import java.util.List;

public class AnyMatchDemo {

	public static void main(String[] args) {

		List<String> listOfName = List.of("Rahul","Raj","Dev","Rekha","Akash");
		boolean anyMatch = listOfName.stream().anyMatch(name->name.startsWith("A"));
		if(anyMatch)
			System.out.println("At least one Name Start with A  present in list");
		else
			System.out.println(" No Name Start with A  present in list");

	}

}
