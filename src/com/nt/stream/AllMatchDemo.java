package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchDemo {

	public static void main(String[] args) {

		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,-9);
		boolean allMatch = listOfNumbers.stream().allMatch(n->n>0);
		if(allMatch)
			System.out.println("All element are positive Elements");
		else
			System.out.println("No All element are not positive Elements");
		
		List<Integer> list = List.of(12,34,56,78);
		Predicate<Integer> isEven=n->n%2==0;
		boolean allEven = list.stream().allMatch(isEven);
		if(allEven)
			System.out.println("All Element in the list is Even Number");
		else
			System.out.println("NO all Element in the list is not Even Number");


	}

}
