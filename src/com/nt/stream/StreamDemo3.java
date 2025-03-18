package com.nt.stream;

import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		Stream<Integer> of = Stream.of(90,87,67,65);
		of.forEach(System.out::println);// stream closed
		System.out.println();
		of.forEach(System.out::println);// will throw java.lang.IllegalStateException


	}

}
