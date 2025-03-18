package com.nt.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo3 {

	public static void main(String[] args) {

		HashSet<Integer> hst= new HashSet<Integer>();
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Options Available: ");
			System.out.println("\t\t 1.Add Element");
			System.out.println("\t\t 2.Delete Element");
			System.out.println("\t\t 3.Print Element");
			System.out.println("\t\t 4.Exit ");
			
			System.out.println("Enter your Choice");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter element to add: ");
				int addElement= sc.nextInt();
				if(hst.add(addElement))
				{
					System.out.println("Element added successfully...");
				}
				else
				{
					System.out.println("Element already exist...");
				}
				break;
			case 2:
				System.out.println("Enter element to Remove: ");
				int removeElement= sc.nextInt();
				if(hst.remove(removeElement))
				{
					System.out.println("Element removed successfully...");
				}
				else
				{
					System.out.println("Element not found in set.");
				}
				break;
			case 3:
				System.out.println("Element Avaualble in Set: ");
				hst.forEach(System.out::println);
				break;
			case 4:
				sc.close();
				System.exit(0);
				break;
			default:
			    System.out.println("Invalid choid ! Enter valid options..");
			    break;
			}
			
		System.out.println();
		}
	}

}
