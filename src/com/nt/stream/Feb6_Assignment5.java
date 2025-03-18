package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Feb6_Assignment5 {

	public static void main(String[] args) {

		Employee e1= new Employee(111,"Juber",90000.0);
		Employee e2= new Employee(111,"Aryan",40000.0);
		Employee e3= new Employee(111,"Scott",60000.0);
		Employee e4= new Employee(111,"Rahul",70000.0);
		Employee e5= new Employee(111,"Aakash",85000.0);
		Employee e6= new Employee(111,"Manav",92000.0);
		
		List<Employee> listOfEmployee = Arrays.asList(e1,e2,e3,e4,e5,e6);
		List<String> nameOfEmplyees = listOfEmployee.stream().map(emp->emp.empName()).collect(Collectors.toList());
	    System.out.println(nameOfEmplyees);
	}

}
