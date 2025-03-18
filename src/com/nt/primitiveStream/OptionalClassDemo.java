package com.nt.primitiveStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {

		List<Optional<String>> list = new ArrayList<>();
		list.add(Optional.of("Apple"));
		list.add(Optional.of("Mango"));
		list.add(Optional.of("Kiwi"));
		list.add(Optional.of("Orange"));
		list.add(Optional.of("Lichi"));
		list.add(Optional.empty());
		list.add(Optional.ofNullable("Stowberry"));
		list.add(Optional.ofNullable(null));
		
		for(Optional<String> fruit: list)
		{
			if(fruit.isPresent())
				System.out.println(fruit.get());
			else
				System.out.println("Container is empty");
		}
		
	}

}
