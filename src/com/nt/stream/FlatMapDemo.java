package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
  public static void main(String[] args) {
	List<String> listOfNmae = Arrays.asList("Jaya","Aryan","Virat","Aakash");
	List<Character> collect = listOfNmae.stream().flatMap(name->Stream.of(name.charAt(0))).collect(Collectors.toList()); 
	System.out.println(collect);
     
  }
}
