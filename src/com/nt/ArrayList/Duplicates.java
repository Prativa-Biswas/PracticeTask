package com.nt.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	private List<Integer> numberList;

	public Duplicates() {
		super();
	}
	

	public Duplicates(List<Integer> numberList) {
		super();
		this.numberList = numberList;
	}
	
	/**
	 * @return the numberList
	 */
	public List<Integer> getNumberList() {
		return numberList;
	}

	/**
	 * @param numberList the numberList to set
	 */
	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}

	
	public List<Integer>  getDuplicatesList()
	{
		Set<Integer> duplicate =new HashSet<Integer>();
		Set<Integer> seen =new HashSet<Integer>();
		
		if(numberList==null|| numberList.isEmpty())
			return null;
		else {
		for(Integer num: numberList)
		{
			if(seen.contains(num) && !duplicate.contains(num))
				duplicate.add(num);
              else
            	  seen.add(num);
            	   
		}
		List<Integer> list=new ArrayList<Integer>(duplicate);
		return list;}
		
	}
	
	public static void main(String[] args) {
		
		Duplicates dpct=new Duplicates(List.of(12,34,56,34,45,67,45,45));
		System.out.println(dpct.getDuplicatesList());
		
		 dpct=new Duplicates(List.of(66,66,77,66,66));
		System.out.println(dpct.getDuplicatesList());
		
		dpct=new Duplicates(List.of());
		System.out.println(dpct.getDuplicatesList());
		
		dpct=new Duplicates(null);
		System.out.println(dpct.getDuplicatesList());
		

	}

}
