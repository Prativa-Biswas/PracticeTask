package com.nt.map;

record Employee1() 
{
	
}

public class SystemGernerateHashcode {

	public static void main(String[] args) {
		
		String str="Ankita";
		System.out.println("String class Hashcode: "+ str.hashCode());

		System.out.println("System class generated hashcode: "+System.identityHashCode(str));
		
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1();
		
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
//		System.out.println(System.identityHashCode(e1));
//		System.out.println("System class generated hashcode: "+System.identityHashCode(str));
	}

}
