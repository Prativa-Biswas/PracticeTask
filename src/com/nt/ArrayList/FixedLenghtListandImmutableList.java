package com.nt.ArrayList;

import java.util.Arrays;
import java.util.List;

public class FixedLenghtListandImmutableList {

	public static void main(String[] args) {

		//Fixed Length List
		List<Integer> fixedLengthList= Arrays.asList(1,2,3,4,5,6,7);
		/*fixedLengthList.add(1);// java.lang.UnsupportedOperationException will occur
		fixedLengthList.remove(0);
		fixedLengthList.remove(Integer.valueOf(3));*/
		
		fixedLengthList.set(3, 10);
		System.out.println(fixedLengthList);
		
		//Immutable List
		List<Integer> immutable= List.of(9,8,7,6,5,4,3);
		
		/*immutable.add(45);     //java.lang.UnsupportedOperationException will occur
		immutable.set(0, 10);
		immutable.remove(0);*/
		System.out.println(immutable);
	}

}
