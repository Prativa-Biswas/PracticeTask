package com.nt.stream;

import java.util.List;
import java.util.function.Predicate;

public class NoneMatchDemo {

	public static void main(String[] args) {

		Predicate<Integer> isEven=n->n%2==0;
		boolean nonEven = List.of(23,45,65).stream().noneMatch(isEven);
		if(nonEven)
			System.out.println("No even number avaiable in List");
		else
			System.out.println("There is at least one even number.");

	}

}
