package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapMethodDemo {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> list = asList.stream().map(n->n+10).toList();
		System.out.println(list);
		System.out.println("--------------------------");
		List<Integer> imutableList = List.of(1,2,3,4,5,6,7,8,9,10,2,3,4,6,8,9);
		Set<Integer> set = imutableList.stream().filter(num->num%2==0).map(n->n*n*n).collect(Collectors.toSet());
	System.out.println(set);
	}

}
