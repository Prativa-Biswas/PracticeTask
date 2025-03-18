package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Feb6_Assignment4 {

	public static void main(String[] args) {

		List<String> nameOfList = Arrays.asList("Hi Prativa"," How are you Uma","Hello Ankita","Hi Mishi","Hi Asa");
		Set<String> collect = nameOfList.stream().flatMap(sen->Stream.of(sen.split(" "))).map(str->str.toLowerCase()).collect(Collectors.toSet());
	    System.out.println(collect);
	}

}
