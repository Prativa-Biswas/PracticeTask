package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		//case 1 with stream() method of connection or Arrays
		List<Integer> list =new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(16);
		
		list.stream().forEach(System.out::println);
		System.out.println();
		int []arr= {23,24,34,45,56};
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		System.out.println();

		//case2 of(T ...values) for static Stream interface
		Stream.of(32,43,54,65).forEach(System.out::println);;
		System.out.println();
        //case3 Stream.generate(Supplier<T>)
		Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);
		System.out.println();
		//case 4 Stream.iterate(seed,UnaryOprator)
		Stream.iterate(10, n->n-1).limit(10).forEachOrdered(System.out::println);
	}

}
