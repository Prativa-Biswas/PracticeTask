package com.nt.stream;

import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;

class Emplyee
{
	private int id;
	private String name;
	public Emplyee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplyee other = (Emplyee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	public void finalize()  {
		System.out.println("Key is elible for GC");
	
	}
	
}

public class Feb_5Assigment2 {

	public static void main(String[] args) throws InterruptedException {

		Emplyee e1=new Emplyee(12,"Prativa");
		Emplyee e2=new Emplyee(13,"Ankita");
		Emplyee e3=new  Emplyee(14,"Ashika");
		HashMap<Emplyee,String> map=new HashMap();
		map.put(e1, "Me");
		map.put(e2, "you");
		map.put(e3, "They");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println();
		
		WeakHashMap<Emplyee,String> wmap= new WeakHashMap();
		wmap.put(e1, "Me");
		wmap.put(e2, "you");
		wmap.put(e3, "They");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println();
		map.remove(e1);// this is required cause if we don't remove it from hashmap then it will treated as strong reference type
		e1=null;		
		System.gc();
		Thread.sleep(1000);
		System.out.println(map);
		System.out.println(wmap);
		
	}
	

}
