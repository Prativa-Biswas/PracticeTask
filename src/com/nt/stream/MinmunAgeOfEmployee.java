package com.nt.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

record Employee2(Integer age,String name) 
{
	
}

public class MinmunAgeOfEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee2> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee2(24,"Prativa"));
		listOfEmployee.add(new Employee2(44,"Ashok"));
		listOfEmployee.add(new Employee2(25,"Shreya"));
		listOfEmployee.add(new Employee2(34,"Ankit"));
		listOfEmployee.add(new Employee2(30,"Praveen"));
		listOfEmployee.add(new Employee2(21,"Ankita"));
		
		Optional<Employee2> min = listOfEmployee.stream().min((e1,e2)->e1.age().compareTo(e2.age()));
		min.ifPresent(System.out::println);
		Optional<Employee2> min2 = listOfEmployee.stream().min(Comparator.comparingInt(Employee2::age));
		min2.ifPresent(System.out::println);
	}

}
