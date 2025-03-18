package com.nt.colecction;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Vector;

class ConCuurent extends Thread{
	
	private Vector<String> cities=null;

	public ConCuurent(Vector<String> cities) {
		super();
		this.cities = cities;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cities.add("Goa");
	}
	
}


public class FailFastIteraotorExample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Vector<String> listOfCity = new Vector<String>(); 
		listOfCity.add("Mumbai");
		listOfCity.add("HYD");
		listOfCity.add("Chennai");
		listOfCity.add("Delhi");
		listOfCity.add("Puri");
		
		ConCuurent con= new ConCuurent(listOfCity);
		con.start();
		
		Iterator<String> iterator = listOfCity.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			Thread.sleep(500);
		}
		
	}

}
