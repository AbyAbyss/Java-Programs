package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		
		// to add elements
		
		cities.add("City1");
		cities.add("City2");
		cities.add("City3");
		cities.add("City4");
		
		// to print 
		
		System.out.println(cities);
		
		
		for(String city : cities){
			System.out.println(city);
		}
		
		// to get size in list we use size() not length
		int size = cities.size();
		System.out.println("Size: " + size);
		
		
		// To get element use get() or can iterate using for-each loop
		
		System.out.println("Using get(): " + cities.get(2));
		
		
		// To remove item
		System.out.println("Size of cities list before remove: " + cities.size());
		cities.remove(3);
		System.out.println("Size of cities list after remove: " + cities.size());
	}

}
