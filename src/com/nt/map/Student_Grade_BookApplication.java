package com.nt.map;

import java.util.HashMap;
import java.util.Scanner;

public class Student_Grade_BookApplication {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		HashMap<String,String> studentGradeBook = new  HashMap<String, String>();
		
		while(true)
		{
			if(studentGradeBook.isEmpty())
			 {
				 System.out.println("Currentry we have an empty list of students grade list");					 
			 }
			else
			{
				System.out.println("Availavle Student :");
				studentGradeBook.forEach((Name,Grade)->{System.out.println("Name: "+Name+" Grade: "+Grade);});
			}
			System.out.println("Please Select a option: ");
			System.out.println("\t\t 1.Add Student Grade");
			System.out.println("\t\t 2.Remove Student Grade");
			System.out.println("\t\t 3.Exit ");
			
			System.out.println("Enter your choice: ");
			int choice= sc.nextInt();
			sc.nextLine();
			String name=null;
			
			switch(choice)
			{
			case 1:
					
				System.out.println("Enter Student name: ");
				name=sc.nextLine();
				System.out.println("Enter student Grade: ");
				String grade=sc.nextLine();
				 
				studentGradeBook.put(name, grade);
				System.out.println("Grade has been added for the student "+name);
				
				break;
			case 2:
				 if(studentGradeBook.isEmpty())
				 {
					 System.out.println("No students available to remove");
				 }
				 else {
					 System.out.println("Enter Student name: ");
					 name=sc.nextLine();
					 if(studentGradeBook.containsKey(name))
					 {
						 studentGradeBook.remove(name);
						 System.out.println(name + " Details removed successfully..");					      	 
					 }
					 else
						 System.out.println("The student named "+name+" is not available in te list..");
				 }
				 break;			
			case 3:
				sc.close();
				System.out.println("Thank you for using our Application");
				System.exit(0);
				break;
			default:
				System.out.println("You Have enter invalid option, please enter correct option");
			}
		}
	}

}
