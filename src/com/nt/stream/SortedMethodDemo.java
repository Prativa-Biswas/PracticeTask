package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedMethodDemo {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(23,67,89,78,900,54,32);
		stream.sorted((n1,n2)->n2.compareTo(n1)).forEach(num->System.out.println(num));
		
		List<String> list = Arrays.asList("Raj","aryan","Aryan","Prativa","Jacob","Prativa","Shila","Aakash","Raj");
		List<String> collect1 = list.stream().distinct().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(collect1);
		List<String> collect = list.stream().distinct().sorted((s1,s2)->s1.compareToIgnoreCase(s2)).collect(Collectors.toList());
		System.out.println(collect);
		list.stream().map(name->name.toLowerCase()).distinct().sorted((s1,s2)->s1.compareTo(s2)).map(name->name.toUpperCase()).forEach(System.out::println);
		
	}

}
