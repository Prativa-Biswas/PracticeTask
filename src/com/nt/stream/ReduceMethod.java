package com.nt.stream;



import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

record Sales(String items,Double amount ) 
{
	
}

public class ReduceMethod {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		//list.stream().reduce(Integer::sum);
		Optional<Integer> reduce = list.stream().reduce((n1,n2)->n1*n2);
		reduce.ifPresent(System.out::println);
		System.out.println("---------------------");
		Integer reduce2 = list.stream().reduce(2,(n1,n2)->n1*n2);
		System.out.println(reduce2);
		System.out.println("----------------------");
		Optional<Integer> opt = list.stream().reduce((a,b)->a>b?a:b);
		opt.ifPresent(n->System.out.println(n));
		
		Stream<String> stream = Stream.of("Java","is","Best");
		Optional<String> optional = stream.reduce((a,b)->a+" "+b);
		optional.ifPresent(System.out::println);
		
		
		Stream<Sales> listofSales = Stream.of( new Sales("Camera", 10000.0),
                new Sales("Mobile", 50000.0),
                new Sales("Laptop", 80000.0),
                new Sales("LED", 20000.0));
		
		Double reduce3 = listofSales.reduce(0.0,(sum,sale)->sum+sale.amount(),Double::sum);
		System.out.println("Total sale: "+reduce3);
	}

}
