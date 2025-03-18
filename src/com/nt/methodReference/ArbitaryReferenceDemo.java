package com.nt.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

interface Trifunction<T,U,V,R>
{
	public R apply(T t, U u, V v);
}
class Sum{
	
	public Integer doSum(Integer a,Integer b)
	{
		return a+b;
	}
	public Integer doSum(String a,String b)
	{
		return Integer.parseInt(a)+Integer.parseInt(b);
	}
}

public class ArbitaryReferenceDemo {

	public static void main(String[] args) {
		//Lambda expression
		Trifunction<Sum,Integer,Integer,Integer> add=(sum,a,b)->sum.doSum(a, b);
		Integer apply = add.apply(new Sum(), 100, 200);
		System.out.println("The sum: "+apply);
		
		Trifunction<Sum,String,String,Integer> sum=Sum::doSum;
		System.out.println(sum.apply(new Sum(),"34", "56"));

		
		Stream<Integer> stream = Stream.of(45,67,8,90,1,2,3,4,5,6);
		List<Integer> sorted = stream.sorted(Integer::compareTo).toList();
		System.out.println(sorted); 
		
		String str[]={"Prativa","Ankita","Ashika","Rebati","chandrima"};
		Arrays.sort(str,String::compareTo);
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str,(s1,s2)->s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(str));
		
		List<Integer> list = Arrays.asList(34,56,78,90,23,12);
		Collections.sort(list, Integer::compareTo);
		System.out.println(list);
		
		List<String> names = Arrays.asList("John", "Jane", "Doe");
		names.forEach(String::length);
	}

}
