package com.nt.map;

import java.util.HashMap;
import java.util.Objects;

class Customer{
	private int customerId;
	private String customerName;
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", Objects=" + customerName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash( customerId,customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerName, other.customerName) && customerId == other.customerId;
	}
	
	
}

public class HashMapDemo2 {

	public static void main(String[] args) {

		Customer c1= new Customer(111, "Scott");
		Customer c2= new Customer(111, "Scott");
		
		System.out.println(c1.hashCode()+" "+c2.hashCode());
		
		HashMap<Customer,String> hm= new HashMap<Customer, String>();
		hm.put(c1, "A");
		hm.put(c2, "B");
		System.out.println(hm.size());
		System.out.println(hm);

	}

}
