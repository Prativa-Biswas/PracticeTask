package com.nt.stream;

import java.util.Optional;

class Employee1{
	private Integer empId;
	private String empName;
	public Employee1() {
		super();
	}
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Optional<Integer>  getEmpId() {
		return Optional.ofNullable(empId);
	}
	public Optional<String> getEmpName() {
		return Optional.ofNullable(empName);
	}
	
}

public class OptinaloClassDemo2 {

	public static void main(String[] args) {
		
		Employee1 e1= new Employee1();
		Employee1 e2= new Employee1(111,"Prativa");

		Optional<Integer> id = e1.getEmpId();
		if(id.isPresent())
		{
			System.out.println(id.get());
		}
		else
		{
			System.out.println("This id is not available");
		}

		Optional<String> name = e2.getEmpName();
		String string = name.orElse("Name is not available");
		System.out.println(string);
	}

}
