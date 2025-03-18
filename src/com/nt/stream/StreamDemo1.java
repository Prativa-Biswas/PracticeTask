package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(12,34,56,78,90);
		list.stream().forEach(System.out::println);
		
		int arr[]= {1,2,3,4};
		IntStream stream= Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		Stream.of(45,67,89,80).forEachOrdered(System.out::println);
		Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);
		Stream.iterate(10, n -> n+1).limit(10).forEach(System.out::println);
	}

}
