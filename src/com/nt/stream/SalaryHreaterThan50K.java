package com.nt.stream;

import java.util.stream.Stream;

record Employee(Integer empid,String empName,Double salaray) 
{
	
}

public class SalaryHreaterThan50K {

	public static void main(String[] args) {
		
		Employee e1= new Employee(111,"Juber",90000.0);
		Employee e2= new Employee(111,"Aryan",40000.0);
		Employee e3= new Employee(111,"Scott",60000.0);
		Employee e4= new Employee(111,"Rahul",70000.0);
		Employee e5= new Employee(111,"Aakash",85000.0);
		Employee e6= new Employee(111,"Manav",92000.0);
		
		Stream<Employee> streamofEmp = Stream.of(e1,e2,e3,e4,e5,e6);
		streamofEmp.filter(emp->emp.salaray()>50000.0).forEach(System.out::println);

	}

}
