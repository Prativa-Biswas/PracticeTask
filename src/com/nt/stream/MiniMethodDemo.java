package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MiniMethodDemo {

	public static void main(String[] args) {

		List<Integer> list = List.of(2,3,45,65,7,8,1);
		Optional<Integer> min = list.stream().min((n1,n2)->n1.compareTo(n2));
		System.out.println(min);
		min.ifPresent(System.out::println);
		
		int arr[]={23,45,67,-9};
		IntStream stream = Arrays.stream(arr);
		OptionalInt min2 = stream.min();
		min2.ifPresent(System.out::println);
	}

}
