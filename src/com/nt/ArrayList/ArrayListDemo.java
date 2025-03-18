package com.nt.ArrayList;

import java.util.ArrayList;

record Professor(String name, String specialization)
{
	
}
class Department{
	private String  departmentname;
	private ArrayList<Professor> proffessors;
	public Department(String departmentname) {
		super();
		this.departmentname = departmentname;
		this.proffessors =new ArrayList<Professor>();
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public ArrayList<Professor> getProffessor() {
		return proffessors;
	}
	
	public void addProffessor(Professor proffessor)
	{
		proffessors.add(proffessor);
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		
		Department dpt=new Department("Computer Sceince");
		
		dpt.addProffessor(new Professor("James","Java") );
		dpt.addProffessor(new Professor("Smith","Python") );
		dpt.addProffessor(new Professor("Jessika","Oracle") );
		dpt.addProffessor(new Professor("Scott","HTML") );
		
		System.out.println("Department name is : "+ dpt.getDepartmentname());
		System.out.println("Professor is in : "+dpt.getDepartmentname());
		
		ArrayList<Professor> proffessor = dpt.getProffessor();
		proffessor.forEach(System.out::println);

	}

}
