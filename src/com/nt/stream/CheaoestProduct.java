package com.nt.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

record Product1(Integer prodId,String prodName,Double price)
{
	
}
public class CheaoestProduct {

	public static void main(String[] args) {

		Product1 product1 = new Product1(234,"TV",70000.0);
		Product1 product2 = new Product1(234,"Watch",20000.0);
		Product1 product3 = new Product1(234,"Bike",100000.0);
		Product1 product4 = new Product1(234,"Jeans",2000.0);
		Product1 product5 = new Product1(234,"Jacket",5000.0);
		
		List<Product1> listOfProduct=List.of(product1,product2,product3,product4,product5);
		listOfProduct.stream().min(Comparator.comparingDouble(Product1::price)).ifPresent(price->System.out.println(price));
		listOfProduct.stream().max((p1,p2)->p1.price().compareTo(p2.price())).ifPresent(System.out::println);
		listOfProduct.stream().max((p1,p2)->p2.price().compareTo(p1.price())).ifPresentOrElse(System.out::println, ()->System.out.println("No minimum value found"));

		List<String> listOfFruit= List.of("Orange","Apple","Kiwi","Promatogante");
		listOfFruit.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
		
		Optional<String> any = listOfFruit.stream().findAny();
		any.ifPresent(n->System.out.println(n));
		
		listOfProduct.stream().findAny().ifPresent(System.out::println);
		
		listOfProduct.parallelStream().findAny().ifPresent(System.out::println);
		
		listOfProduct.stream().findFirst().ifPresent(System.out::println);
		
	}

}
