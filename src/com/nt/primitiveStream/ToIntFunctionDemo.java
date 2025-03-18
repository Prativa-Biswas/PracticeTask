package com.nt.primitiveStream;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

record Employee(String name,int experience)
{
	
}
public class ToIntFunctionDemo {

	public static void main(String[] args) {

	  ArrayList<Employee> listOfEmployee = new ArrayList<>();
	  listOfEmployee.add(new Employee("Virat",4));
	  listOfEmployee.add(new Employee("Shakhi",5));
	  listOfEmployee.add(new Employee("Daman",14));
	  listOfEmployee.add(new Employee("Ankit",9));
	  listOfEmployee.add(new Employee("Scott",2));
	  listOfEmployee.add(new Employee("Smith",10));
	  
	  ToIntFunction<Employee> empExperience=employee->employee.experience();
	   int sum = listOfEmployee.stream().mapToInt(empExperience).sum();
	   System.out.println(sum);
	  
	 
	}

}
