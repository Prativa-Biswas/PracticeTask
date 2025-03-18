package com.nt.primitiveStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamDemo2 {
	public static void main(String[] args) {
		int []arr1= {1,2,3,4,5,6};
		int []arr2= {11,22,33,44,55,66};
		int []arr3= {111,222,333,444,555,666};
		
		List<int[]> list = Arrays.asList(arr1,arr2,arr3);
		IntStream intStream = list.stream().flatMapToInt(arry->Arrays.stream(arry));
		intStream.forEach((num)->System.out.println(num));
		System.out.println("------------------------------------------------------------");
		
		long []arr4= {1,2,3,4,5,6};
		long []arr5= {11,22,33,44,55,66};
		long []arr6= {111,222,333,444,555,666};
		
		List<long[]> list2 = Arrays.asList(arr4,arr5,arr6);
		 LongStream longStream = list2.stream().flatMapToLong(arr->Arrays.stream(arr));
		 longStream.forEach(System.out::println);

	}

}
