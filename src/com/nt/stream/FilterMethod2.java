package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethod2 {

	public static void main(String[] args) {
                List<String> listOfName = Arrays.asList("Aryan","Ankita","Bimal","Alomati","Prativa","Ashika","Partha",
                		"Alomati","Nitin","Mishi","Ankita");
                
                //name start with A
                listOfName.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
                System.out.println();
                //Name start with A and no duplicates
                //listOfName.stream().filter(name->name.startsWith("A")).collect(Collectors.toSet()).forEach(System.out::println);;
                Set<String> set=listOfName.stream().filter(name->name.startsWith("A")).collect(Collectors.toSet());
                System.out.println(set);
                
              //Name start with A and with duplicates
                List<String> list = listOfName.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
                System.out.println(list);
                
                List<String> collect = Stream.of("Raj","Rahul","Ankita","Roshan","Raj","Scott","Rohit","Ratan","Ravi","Rahul").filter(name->name.startsWith("R")).sorted().distinct().collect(Collectors.toList());
	          System.out.println(collect);
	}
	
	

}
