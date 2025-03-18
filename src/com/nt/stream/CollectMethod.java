package com.nt.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMethod {

	public static void main(String[] args) {
       //Collectors.joining()
		List<String> listOfWords = List.of("J","A","V","A");
		String collect = listOfWords.stream().collect(Collectors.joining());
		System.out.println(collect);
		List<String> list = List.of("Java","is","Awesome");
		String collect2 = list.stream().collect(Collectors.joining(" "));
		System.out.println(collect2);
		//Collectors.groupingBy()
		List<String> listOfCities = List.of("Delhi","Mumbai","indore","Kolkata","Pune","Hyderabad","Chennai");
		 listOfCities.stream().collect(Collectors.groupingBy(String::length)).forEach((k,v)->System.out.println(k+"  "+v));;
		
		 //Collectors.toMap()
		 List<String> listOfCountries = List.of("USA","India","Asia","Russia","China","Bhutan","Canada","UK");
		 Map<String, Integer> countries = listOfCountries.stream().collect(Collectors.toMap(countryName->countryName, countryName->countryName.length()));
		 countries.forEach((k,v)->System.out.println(k+" "+v));
	}

}
