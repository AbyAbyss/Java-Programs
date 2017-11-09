package datastructures;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// implement map interface
		
		// LinkedHashMap, TreeMap, HashMap
		Map<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
		mapUtil(hashmap);
		

	}
	public static void mapUtil(Map<Integer, String> map){
		// Add key : value pair
		map.put(3, "three");
		map.put(1, "one");
		map.put(2, "two");
		map.put(5, "five");
		map.put(4, "four");
		System.out.println(map.get(2));
		
		// iterate map
		for(int key : map.keySet()){
			System.out.println(key + ": " + map.get(key));
		}
		
		
		System.out.println("See all the set: " + map.keySet());
		System.out.println(map);
		
		System.out.println(map.values());
		
		
	}

}
