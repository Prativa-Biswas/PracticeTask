package com.nt.primitiveStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertingArrayToList {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		IntStream stream = Arrays.stream(arr);
		List<Integer> list = stream.boxed().collect(Collectors.toList());
		System.out.println(list);
		
	}

}
