package com.nt.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Department(Integer deptId, String deptName) 
{
	
}
record Employee3(Integer empId, String empName,Double salary,Department dept )
{
	
}
public class CollectMethod_groupingBy {

	public static void main(String[] args) {
		
		Employee3 e1=new Employee3(234,"Prativa",50000.0,new Department(10,"IT"));
		Employee3 e2=new Employee3(111,"Ankita",500000.0,new Department(10,"IT"));
		Employee3 e3=new Employee3(222,"Pramila",34000.0,new Department(11,"Sales"));
		Employee3 e4=new Employee3(333,"Adwik",450000.0,new Department(15,"Manager"));
		Employee3 e5=new Employee3(444,"Rehan",70000.0,new Department(5,"HR"));
		Employee3 e6=new Employee3(444,"Roshni",90000.0,new Department(5,"HR"));
		
		List<Employee3> listOfEmployee = List.of(e1,e2,e3,e4,e5,e6);
		Map<Department, List<Employee3>> listOfEmployeeDept = listOfEmployee.stream().collect(Collectors.groupingBy(employee->employee.dept()));
		listOfEmployeeDept.forEach((emp,dept)->System.out.println(emp+" "+dept));

	}

}
