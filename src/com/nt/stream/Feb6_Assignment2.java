package com.nt.stream;

import java.util.stream.Stream;

public class Feb6_Assignment2 {
	public static void main(String[] args) {
		
		Stream.generate(()->(int)(Math.random()*100)+1).filter(num->num%2!=0).map(n->n*n).limit(10).forEach(System.out::println);		
		System.out.println();
	    Stream.iterate(1, n->n+1).filter(num->num%2!=0).map(n->n*n).limit(10).forEach(System.out::println);
	}

}
