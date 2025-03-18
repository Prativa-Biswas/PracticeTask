package com.nt.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodDemo {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate","Orange","CusterApple");
		stream.limit(5).forEach(System.out::println);
		//stream.skip(4).forEach(System.out::println);//java.lang.IllegalStateException
		System.out.println();
		Stream<String> stream2 = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate","Orange","CusterApple");
		stream2.skip(4).forEach(System.out::println);
		System.out.println();
		Stream<String> stream3 = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate","Orange","CusterApple");
//		List<Integer> collect = stream3.peek(name->System.out.println("Peeking from Original: "+name.toUpperCase())).map(fruit->fruit.length()).collect(Collectors.toList());
//	    System.out.println(collect);
		 Stream<String> peek = stream3.peek(name->name.toUpperCase());
		 List<String> collect = peek.collect(Collectors.toList());
	    System.out.println(collect);
		Stream<String> stream4 = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate","Orange","CusterApple");
		List<Integer> collect2 = stream4.map(fruit->fruit.length()).collect(Collectors.toList());
		System.out.println(collect2);

		
	}

}
