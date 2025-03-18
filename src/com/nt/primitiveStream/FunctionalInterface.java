package com.nt.primitiveStream;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class FunctionalInterface {

	public static void main(String[] args) {

		UnaryOperator<String> word=s->s.concat("World");
		System.out.println(word.apply("Hello "));
		
		
		UnaryOperator<Integer> fn=s->s*s*s;
		Integer num = fn.apply(3);
		System.out.println(num);
		
		BinaryOperator<Integer> bfn=(a,b) ->a*b;
		Integer integer = bfn.apply(23, 45);
		System.out.println(integer);

	}
}
