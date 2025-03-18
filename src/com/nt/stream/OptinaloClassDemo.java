package com.nt.stream;

import java.util.Optional;

public class OptinaloClassDemo {

	public static void main(String[] args) {

		String str=null;
		
		Optional<String> cntr=Optional.ofNullable(str);
		String orElse = cntr.orElse("No such value is avialable");
		System.out.println(orElse);
		str="Prativa";
		Optional<String> opt = Optional.ofNullable(str);
		if(opt.isPresent())
		          System.out.println(opt.get());
		else
			System.out.println("No such value is avialable");
		
	}

}
