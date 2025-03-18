package com.nt.map;

import java.util.WeakHashMap;

class Employee{
	private Integer empId;
	private String name;
	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	@Override
	public void finalize()  {
		System.out.println("Object is eligible for garbage collection...");
		
	}
}
public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Employee emp1= new Employee(114,"Ashika");
		Employee emp2= new Employee(145,"Resmika");
		
		WeakHashMap<Employee, String> whm= new WeakHashMap<Employee, String>();
		whm.put(emp1, "Hyd");
		whm.put(emp2, "Hyd");
		
		System.out.println(whm);
		
		emp1=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(whm);

	}

}
