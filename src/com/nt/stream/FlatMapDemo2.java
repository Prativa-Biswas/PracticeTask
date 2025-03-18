package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Product(Integer id,List<String> listOfProduct)
{
	
}

public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		List<Product> listOfProduct = Arrays.asList(
				new Product(1,Arrays.asList("Camera","Mobile","Laptop")),
				new Product(2,Arrays.asList("Bat","Ball","Wicket")),
				new Product(3,Arrays.asList("Chair","Table","Lamp")),
				new Product(2,Arrays.asList("Cycle","Bike","Car"))
				);
		
		List<String> collect = listOfProduct.stream().flatMap(product->product.listOfProduct().stream()).collect(Collectors.toList());
        System.out.println(collect);
	}

}
