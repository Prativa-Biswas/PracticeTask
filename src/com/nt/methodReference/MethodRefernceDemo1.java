package com.nt.methodReference;

public class MethodRefernceDemo1 {
	public static void m1()
	{
		for(int i=1;i<=10;i++) {
		   System.out.println("Child Class-1");}
	}
	public void m2()
	{
		for(int i=1;i<=10;i++) {
		   System.out.println("Child Class-2");}
	}

	public static void main(String[] args) {

		Runnable r1=MethodRefernceDemo1::m1;
		Thread t= new Thread(r1);
		t.start();
		
		for(int i=1;i<=10;i++) {
			   System.out.println("Main Class");}
		
		Runnable r2=new MethodRefernceDemo1()::m2;
		Thread t2= new Thread(r2);
		t2.start();

	}

}
