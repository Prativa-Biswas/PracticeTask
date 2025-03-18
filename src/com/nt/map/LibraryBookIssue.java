package com.nt.map;

import java.util.HashMap;

public class LibraryBookIssue {

	public static void main(String[] args) {

		HashMap<String, Boolean> library= new HashMap<>();
		library.put("Core java", true);
		library.put("Spring", true);
		library.put("HTML", false);
		library.put("CSS", true);
		
		System.out.println("Initial Library status : "+ library);
		
		String bookBorrowed="Core java"; 
		if(library.containsKey(bookBorrowed) && library.get(bookBorrowed))
		{
			library.put(bookBorrowed, false);
			System.out.println(bookBorrowed+" book is borrowed ");
		}
		else {
			System.out.println(bookBorrowed+ "Book is not available for Borrowing... ");
		}
		
		String bookRetun="HTML";
		if(library.containsKey(bookRetun) && !library.get(bookRetun))
		{
			library.put(bookRetun, true);
			System.out.println(bookRetun+" book has been  Returned  ");
		}
		else {
			System.out.println(bookRetun+ "Book is ot Borrowed.. ");
		}
		
		String checkBook="CSS";
		if(library.containsKey(checkBook))
		{
			String availability= library.get(checkBook)?"Available":"Borrowed";
			System.out.println(checkBook+" is "+ availability);
		}
		else
		{
			System.out.println("Book is not available in library..");
		}
		
		library.forEach((k,v)->{
			String status= v?"Available":"Borrowed";
			System.out.println("Book : "+k+",   Status :"+ status);
		});
	}


}
