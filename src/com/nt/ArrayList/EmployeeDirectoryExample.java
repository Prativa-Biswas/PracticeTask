package com.nt.ArrayList;

import java.util.ArrayList;

class Employee{
	private String name;
	private String position;
	private double salary;
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	/**
		* @return the name
		*/

public String getName() {
return name;
}
/**
	* @param name the name to set
	*/

public void setName(String name) {
this.name = name;
}
/**
	* @return the position
	*/

public String getPosition() {
return position;
}
/**
	* @param position the position to set
	*/

public void setPosition(String position) {
this.position = position;
}
/**
	* @return the salary
	*/


public double getSalary() {
return salary;
}
/**
	 * @param salary the salary to set
	 */
		public void setSalary(double salary) {
		this.salary = salary;
		}
		@Override
		public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
		}
		
		
}
/*record Employee(String name,String position,double salary) 
{
	
}*/

class Directory {

	private ArrayList<Employee> employees;

	public Directory() {
		super();
		this.employees = new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void displayAllEmployees() {
		employees.forEach(emp -> System.out.println(emp));
	}

	public void updateEmployee(int index, Employee employee) {

		if (index >= 0 && index < employees.size()) {
			employees.set(index, employee);
		} else {
			System.out.println("Invalid index");
		}

	}

	public void updateEmployee(int index, String position, double salary) {
		if (index >= 0 && index < employees.size()) {
			Employee emp = employees.get(index);
			emp.setPosition(position);
			emp.setSalary(salary);
		} else {
			System.out.println("Invalid index");
		}
	
	}

	public void deleteEmployee(int index) {

		if (index >= 0 && index < employees.size()) {
			employees.remove(index);
		} else {
			System.out.println("Invalid index");
		}

	}

}

public class EmployeeDirectoryExample {

	public static void main(String[] args) {

		Directory directory = new Directory();

		directory.addEmployee(new Employee("Alice", "Analyst", 500000.0));
		directory.addEmployee(new Employee("Bob", "Hr", 340000.0));

		directory.displayAllEmployees();
		directory.updateEmployee(1, new Employee("Bob", "Project Manager", 40000.0));
		System.out.println("------------------------");
		directory.displayAllEmployees();
		directory.deleteEmployee(0);
		System.out.println("-----------------------");
		directory.displayAllEmployees();
	}

}
