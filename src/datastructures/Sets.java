package datastructures;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		// HashSet is unordered list
		//Set<String> animals = new HashSet<String>();
		
		
		//TreeSet in alpha order
		Set<String> animals = new TreeSet<String>();
		
		
		
		// LinkedHashSet is order they were entered
		//Set<String> animals = new LinkedHashSet<String>();
		
		// Adding
		System.out.println("HashSet............");
		animals.add("cat");
		animals.add("dog");
		animals.add("cat");  // wont be display or counted ...because its repeated
		animals.add("pig");
		animals.add("snake");
		System.out.println(animals.size());
		System.out.println(animals);
		
		for(String animal : animals){
			System.out.print(animal + " ");
		}
		
		
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("cow");
		farmAnimals.add("dog");
		farmAnimals.add("cat");
		farmAnimals.add("horse");
		System.out.println("\n" + farmAnimals);
		
		//intersection set
		Set<String> intersectionSet = new HashSet<String>(animals);
		
		System.out.println("Before intersection: " + intersectionSet);
		
		//retain only the common elements from both
		
		intersectionSet.retainAll(farmAnimals); // retainAll() is used for intersection
		System.out.println("New intersection set is: " + intersectionSet);
		
		
		
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		
		System.out.println("Before Union: " + unionSet);
		
		unionSet.addAll(animals); // addAll() is used for union
		
		System.out.println("After Union: " + unionSet);
		
		
		
		// difference animals but not farm animals
		
		Set<String> diffSet = new HashSet<String>(animals);
		
		
		System.out.println("Before Difference: " + diffSet);
		diffSet.removeAll(farmAnimals);
		
		System.out.println("Before Difference: " + diffSet);

	}

}
