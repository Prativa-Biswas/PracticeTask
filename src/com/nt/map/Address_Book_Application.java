package com.nt.map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

record Contacts(String name,Long phoneNo) 
{
	
}

public class Address_Book_Application {

	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		HashMap<Contacts,String> addressBook=new HashMap<Contacts, String>();
		System.out.println("Welcome to our Address book App: ");
		while(true)
		{
			
			System.out.println("Select your Option: ");
			System.out.println("\t\t 1.Add Contact");
			System.out.println("\t\t 2.Remove Contact");
			System.out.println("\t\t 3.Exit");
			System.out.println("Enter your choice: ");
			int choice= sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				if(addressBook.isEmpty())
				{
					System.out.println("Currently no contact is found");
					System.out.println("Add contact to Address book");
				}
				else {
					addressBook.forEach((con,add)->System.out.println("Contact: "+con+" Address: "+add));
					System.out.println("Available Contacts add furthur contacts... ");
				}
				try {
				System.out.println("Enter contact's name: ");
				String name=sc.nextLine();
				System.out.println("Enter contact's Phone number: ");
                Long num=sc.nextLong();	
                          sc.nextLine();
                if(num.toString().length()!=10)
                	throw new InputMismatchException("Phone number shoud be 10 number");
                Contacts contact=new Contacts(name, num);
                System.out.println("Enter contact's Phone Address: ");
                String address=sc.nextLine();
                addressBook.put(contact, address);
                System.out.println("Contact added successfully...");
                }catch(InputMismatchException e)
				{
                	System.err.println(e.getMessage());
				}
                	
                
				break;
			case 2:
				if(addressBook.isEmpty())
					System.out.println("No contact's is available to remove");
				else
				{
					System.out.println("Enter contact's name: ");
					String Name=sc.nextLine();
					Contacts next = addressBook.keySet().iterator().next();
					if(next.name().equals(Name))
					{
						addressBook.remove(next);
						System.out.println("Contact removed successfully...");
					}
					else
						System.out.println("Contact named with "+Name+" not found to delete...");
				}
				break;
			case 3:
				sc.close();
				System.out.println("Thank you using our Application...");
				System.exit(0);
				break;
			default:
				System.out.println("You have entered invalid option, kindly enter valid option...");
				break;
			}
			
		}

	}

}
