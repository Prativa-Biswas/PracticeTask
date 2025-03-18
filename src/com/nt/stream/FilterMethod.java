package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,1,16,18,19);
		
		for(Integer num:asList)
		{
			if(num%2==0)
				System.out.println(num);
		}

		asList.stream().filter(num->num%2==0).forEach(con->System.out.println(con));
	}

}
