package com.nt.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethod_partioningBy {

	public static void main(String[] args) {


		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n->n%2==1));
		System.out.println(collect);
		//Partition the given number based on the Predicate and convert to Set

		List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10,1,3,5);
		Map<Boolean, Set<Integer>> collect2 = list2.stream().collect(Collectors.partitioningBy(n->n%2==0, Collectors.toSet()));
	     System.out.println(collect2);
	   //Count how many elements are partition based on given predicate  
	     List<Integer> list3 = List.of(1,2,3,4,5,6,7,8,9,10,11);
	     Map<Boolean, Long> collect3 = list3.stream().collect(Collectors.partitioningBy(n->n%2==0,Collectors.counting()));
	     System.out.println(collect3);
	
	}

}
