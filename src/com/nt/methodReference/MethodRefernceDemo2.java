package com.nt.methodReference;
interface Intra{
	public void add(int a,int b);
}

public class MethodRefernceDemo2 {

	public void sum(int a, int b) {
		System.out.println("The sum:"+(a+b));
	}
	public int sum1(int a, int b) {
		System.out.println("The sum:"+(a+b));
		return a+b;
	}
	private static void sum2(int a, int b) {
		System.out.println("The sum:"+(a+b));
		
	}
	public static void main(String[] args) {
		
		Intra i1=new MethodRefernceDemo2()::sum;
		Intra i2=new MethodRefernceDemo2()::sum1;
		Intra i3= MethodRefernceDemo2::sum2;
		i1.add(100, 300);
		i2.add(45, 35);
		i3.add(890,110);

	}

}
