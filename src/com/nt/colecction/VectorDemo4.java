package com.nt.colecction;

import java.util.Collections;
import java.util.Vector;

record Employee(int empno,String ename) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e) {
		return this.ename().compareTo(e.ename);
	}
	
}

public class VectorDemo4 {
	
	public static void main(String[] args) {
		
		Vector<Employee> vector = new Vector<>();
		vector.add(new Employee(101,"Prativa"));
		vector.add(new Employee(102,"Ankita"));
		vector.add(new Employee(103,"Chetna"));
		vector.add(new Employee(104,"Praveen"));
		
		Collections.sort(vector);
		vector.forEach(vec->System.out.println(vec));
		
	}  

}
