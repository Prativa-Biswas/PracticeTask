package sortingInterfaceProgram;

import java.util.ArrayList;
import java.util.Collections;

record Customer(Integer customerId,String customerName) implements  Comparable<Customer>
{

	@Override
	public int compareTo(Customer c) {
		return this.customerId().compareTo(c.customerId());
	}
	
}

public class CustomerComparable {

	public static void main(String[] args) {
		
		ArrayList<Customer> custList=new ArrayList<Customer>();
		custList.add(new Customer(234,"Prativa"));
		custList.add(new Customer(111,"Ankita"));
		custList.add(new Customer(345,"Chetna"));
		custList.add(new Customer(444,"Nilesh"));
		custList.add(new Customer(101,"Dipesh"));
		custList.add(new Customer(56,"Praveen"));
		System.out.println("List of customer before sorting: ");
		custList.forEach(System.out::println);
		Collections.sort(custList);
		System.out.println("List of customer after sorting: ");
		custList.forEach(System.out::println);


	}

}
