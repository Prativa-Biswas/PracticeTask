package com.nt.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer,Integer> conCurrent = new ConcurrentHashMap();
		conCurrent.put(1, 100);
		conCurrent.put(3, 200);
		conCurrent.put(6, 900);
		conCurrent.put(5, 890);
		
		Thread t1=new Thread() {
			public void run() {
				conCurrent.put(4,800);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				conCurrent.put(6,1000);
			}
		};
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(conCurrent);
	}

}
