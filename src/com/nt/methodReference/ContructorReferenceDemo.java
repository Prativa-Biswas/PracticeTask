package com.nt.methodReference;
interface Infra{
	Student get(int stdId, String studName, String className);
}

class Student
{
  private int stdId;
  private String studName;
  private String className;
public Student(int stdId, String studName, String className) {
	super();
	this.stdId = stdId;
	this.studName = studName;
	this.className = className;
}
public int getStdId() {
	return stdId;
}
public String getStudName() {
	return studName;
}
public String getClassName() {
	return className;
}
  
  
}
public class ContructorReferenceDemo {

	public static void main(String[] args) {

		Infra i1=Student::new;
		Student student = i1.get(23, "Prativa", "12th");
		System.out.println(student.getStudName());
		System.out.println(student.getStdId());
		
		//Infra i2=Sample::new; here return type must be same
		
	}

}

class Sample
{
  private int stdId;
  private String studName;
  private String className;
public Sample(int stdId, String studName, String className) {
	super();
	this.stdId = stdId;
	this.studName = studName;
	this.className = className;
	System.out.println("Sample constructor created");
}
}
