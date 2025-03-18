package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class Feb6_Assignment3 {

	public static void main(String[] args) {

		List<String> nameOfList = Arrays.asList("Prativa","Uma","Ankita","Mishi","Asa");
		nameOfList.stream().sorted((s1,s2)->s1.length()!=s2.length()? s1.length()-s2.length():s1.compareTo(s2)).forEach(System.out::println);;
	}

}
