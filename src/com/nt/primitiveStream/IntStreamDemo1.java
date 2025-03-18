package com.nt.primitiveStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamDemo1 {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6};
		IntStream intStream = Arrays.stream(arr);
		intStream.filter(num->num%2==0).forEach(System.out::println);
		System.out.println();
		
		IntStream intStream2 = IntStream.of(10,23,45,67,89,342,54,12,3,5,6,7);
		intStream2.sorted().forEach(System.out::println);
		System.out.println();
		LongStream longStream = LongStream.of(67890,43321,45678,90876,54321,5678,453,908776543321l);
		longStream.forEach(System.out::println);
		System.out.println();
		DoubleStream doubleStream = DoubleStream.of(90.8,98.45,23.4,4,5,6,7);
		doubleStream.sorted().forEach(System.out::println);
		
		int []arr1= {1,2,3,4,5,6};
		int []arr2= {11,22,33,44,55,66};
		int []arr3= {111,222,333,444,555,666};
		System.out.println("------------------------------");
		List<int[]> list = Arrays.asList(arr1,arr2,arr3);
		list.stream().flatMapToInt(array->IntStream.of(array)).forEach(System.out::println);

	}

}
