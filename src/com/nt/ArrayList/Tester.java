package com.nt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayToList{
	
	public static List<String> convertToList(String[] inputArray)
	{
		
		
		
		if(inputArray==null)
		{
			return null;
		}
		else if(inputArray.length==0)
		{
			
			return new ArrayList<String>();
		}
		else
		{
			/*List<String> list=new ArrayList<String>(inputArray.length);
			for(int i=0;i<inputArray.length;i++)
			{
				list.add(inputArray[i]);
			}
			return list;*/
			       //(OR)
			//return Arrays.asList(inputArray);
			      //(OR)
			return List.of(inputArray);
		}
		
	}
}

public class Tester {

	public static void main(String[] args) {
		
		String[] inputArray= {"Ankita","Prativa","Delhi","Sweet","Spices"};
		
		ArrayToList.convertToList(inputArray).forEach(System.out::println);
		System.out.println(ArrayToList.convertToList(new String[] {}));
		System.out.println(ArrayToList.convertToList(null));

	}

}
