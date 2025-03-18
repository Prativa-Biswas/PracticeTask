package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Feb6_Assignment1 {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Aakash","Uma","Inshan","Mishi","Rebati");
		List<String> collect = asList.stream().filter(str->str.startsWith("A")||str.startsWith("O")||str.startsWith("U")||str.startsWith("E")||str.startsWith("I"))
				.filter(name->name.length()>5).collect(Collectors.toList());
		System.out.println(collect);
		List<String> collect2 = asList.stream().filter(str->(str.startsWith("A")||str.startsWith("O")||str.startsWith("U")
				||str.startsWith("E")||str.startsWith("I"))&& str.length()>5).collect(Collectors.toList());
	 System.out.println(collect2);
	}

}
