package sortingInterfaceProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

record Customer2(Integer customerId,String customerName)
{

	
	
}

public class CustomerComparable2 {
    
	public static void main(String[] args) 
	{
		
		ArrayList<Customer2> custList=new ArrayList<Customer2>();
		custList.add(new Customer2(234,"Prativa"));
		custList.add(new Customer2(111,"Ankita"));
		custList.add(new Customer2(345,"Chetna"));
		custList.add(new Customer2(444,"Nilesh"));
		custList.add(new Customer2(101,"Dipesh"));
		custList.add(new Customer2(56,"Praveen"));
		System.out.println("List of customer before sorting: ");
		custList.forEach(System.out::println);
		
		Comparator<Customer2> cmpId=(p1,p2)->p1.customerId().compareTo(p2.customerId());
		
		Collections.sort(custList,cmpId);
		System.out.println("List of customer after sorting with Customer Id: ");
		custList.forEach(System.out::println);
      Comparator<Customer2> cmpName=(p1,p2)->p1.customerName().compareTo(p2.customerName());
		
		Collections.sort(custList,cmpName);
		System.out.println("List of customer after sorting with Customer Name: ");
		custList.forEach(System.out::println);
		System.out.println("------------------------------------------");
		Collections.sort(custList,(l1,l2)->l2.customerId().compareTo(l1.customerId()));
		custList.forEach(System.out::println);

	}

}
