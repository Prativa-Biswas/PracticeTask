package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountMethodDemo {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,90,89,87,67,76,56,54,45);
		long count = stream.count();
		System.out.println(count);
		
		//count the name whose length is greater than 3
		List<String> list = List.of("Raj","Ravi","Virat","Rohit","Ram","Bumrah","Sachin");
		long count2 = list.stream().filter(name->name.length()>3).count();
		System.out.println("Name length greater than 3: "+count2);
		//count unique elements by using Stream API
		List<String> list2 = List.of("Raj","Raj","Ravi","Virat","Raj");
		long count3 = list2.stream().distinct().count();
		System.out.println("Unique element count : "+count3);
		
		//Count the names which are containing the character A
		List<String> asList = Arrays.asList("Raj","Ravi","Rohit","Virat","Raj","Aradhya","Scott");
		long count4 = asList.stream().map(name->name.toUpperCase()).distinct().filter(s->s.contains("A")).count();
System.out.println("Name contains A: "+count4);
	}

}
