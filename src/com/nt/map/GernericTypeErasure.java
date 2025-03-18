package com.nt.map;

import java.util.ArrayList;
import java.util.List;

class Alpha{  }
class Beta extends Alpha{   }  
class Gamma extends Beta{   }  

public class GernericTypeErasure {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		List list = new ArrayList();
		
		ArrayList<?> al1= new ArrayList<String>();
		ArrayList<?> al2= new ArrayList<Object>();
		ArrayList<?> al3= new ArrayList<Double >();
		ArrayList<?> al4= new ArrayList<Integer>();
		
		ArrayList<? extends Number> al5= new ArrayList<Integer>();
		ArrayList<? super Integer>  al6= new ArrayList<Number>();
		ArrayList<? extends Number> al7= new ArrayList<Double >();
		//ArrayList<? super Integer>  al8= new ArrayList<Double>();// not acceptable
		
		
		
		ArrayList<? extends Alpha> a= new ArrayList<Alpha>();
		ArrayList<? extends Alpha> b= new ArrayList<Beta>();
		ArrayList<? extends Alpha> g= new ArrayList<Gamma>();
		
		ArrayList<? super Beta> bb= new ArrayList<Beta>();
		ArrayList<? super Beta> aa= new ArrayList<Alpha>();
		//ArrayList<? super Beta> bbgg= new ArrayList<Gamma>(); // not acceptable
		
		
		System.out.println("yes");
		
	}

}
