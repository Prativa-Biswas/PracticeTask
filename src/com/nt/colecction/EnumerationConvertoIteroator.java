package com.nt.colecction;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Product(int prodId,String prodName)
{
	
}
public class EnumerationConvertoIteroator {

	public static void main(String[] args) {
		
		Vector<Product> product = new Vector<>();
		product.add(new Product(111,"Mobile"));
		product.add(new Product(222,"Laptop"));
		product.add(new Product(222,"Camera"));
		product.add(new Product(222,"Watch"));
		product.add(new Product(222,"Bag"));
		
		Enumeration<Product> elements = product.elements();
		
		Iterator<Product> asIterator = elements.asIterator();
		
		asIterator.forEachRemaining(itr->System.out.println(itr));

	}

}
