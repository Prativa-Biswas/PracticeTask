package com.nt.colecction;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

class ConCuurent2 extends Thread{
	
	
	private CopyOnWriteArrayList<String> cities=null;

	public ConCuurent2(CopyOnWriteArrayList<String> cities) {
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

public class FailFastIteraotorExample3 {
public static void main(String[] args) throws InterruptedException {
		
	CopyOnWriteArrayList<String> listOfCity = new CopyOnWriteArrayList<String>(); 
		listOfCity.add("Mumbai");
		listOfCity.add("HYD");
		listOfCity.add("Chennai");
		listOfCity.add("Delhi");
		listOfCity.add("Puri");
		
		ConCuurent2 con= new ConCuurent2(listOfCity);
		con.start();
		
		Iterator<String> iterator = listOfCity.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			Thread.sleep(500);
		}
		System.out.println("---------------------------------");
		Spliterator<String> spliterator = listOfCity.spliterator();
		spliterator.forEachRemaining(System.out::println);
	}

}
