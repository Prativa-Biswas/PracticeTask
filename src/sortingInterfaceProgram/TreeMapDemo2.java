package sortingInterfaceProgram;

import java.util.TreeMap;

record Product(Integer id, String name) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p) {
		return this.id().compareTo(p.id());
	}
	
}

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
//TreeMap<Product,String> map=new TreeMap<>((t1,t2)->t2.compareTo(t1));
       TreeMap<Product,String> map=new TreeMap<>();

		
		map.put(new Product(203,"Mobile"), "Mumbai");
		map.put(new Product(233,"Watch"), "Kolkata");
		map.put(new Product(324,"Camera"), "Chennai");
		map.put(new Product(301,"TV"), "Pune");
		map.put(new Product(223,"Bike"), "Delhi");
		map.put(new Product(403,"Fridge"), "Patna");
		map.put(new Product(108,"AC"), "Hyderabad");
		
		map.forEach((K,V)->System.out.println(K+"  "+V));

	}

}
