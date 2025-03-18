package com.nt.stream;

import java.util.stream.Stream;

public class TakeWhileMethod {

	public static void main(String[] args) {

		Stream<Integer> numbers = Stream.of(10,11,9,13,2,1,100);
		numbers.takeWhile(n->n>9).forEach(System.out::println);
		System.out.println("-----------------");
		numbers=Stream.of(12,2,10,11,9,13,2,1,100);
		numbers.takeWhile(n->n%2==0).forEach(System.out::println);
		System.out.println("-----------------");
		numbers=Stream.of(1,2,3,4,5,6,7,8,9,10);
		numbers.dropWhile(n->n<7).forEach(System.out::println);
		System.out.println("-----------------");
		numbers=Stream.of(15,8,7,5,6,7,8,9,10);
		numbers.dropWhile(n->n>5).forEach(System.out::println);
	}

}
