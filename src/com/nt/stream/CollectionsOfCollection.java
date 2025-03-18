package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionsOfCollection {

	public static void main(String[] args) {

		List<String> indTeam = Arrays.asList("Abhishek","Sanju","Surya","Tilak");
		List<String> engTeam = Arrays.asList("Salt","Batler","Rasid","Archer");
	    List<List<String>> icc = Arrays.asList(indTeam,engTeam);
	    System.out.println(icc);
	    
	   List<String> ipl = icc.stream().flatMap(listOfPlayer->listOfPlayer.stream()).collect(Collectors.toList());
	   System.out.println(ipl);
	   
	   int arr[]= {10,20,30,40,9};
	   IntStream stream= Arrays.stream(arr);
	   OptionalInt min = stream.min();
	   min.ifPresent(System.out::println);
	   
	   List<String> asList1 = Arrays.asList("A","B","C");
	   List<String> asList2 = Arrays.asList("D","E","F");
	   List<String> asList3 = Arrays.asList("A","B","C");
	   List<List<String>> asList = Arrays.asList(asList1,asList2,asList3);
	   System.out.println(asList);
	   Set<String> collect = asList.stream().flatMap(str->str.stream()).collect(Collectors.toSet());
	   System.out.println(collect);
	}

}
