package java8.programming;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortonKeysInReverseOrder {
	
	public static void main(String args[]) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1,5);
		map.put(2,4);
		map.put(3,6);
		map.put(4,7);
		
		System.out.println("Sort By Value in Asc order");
		
		//Sort by value in asc order
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
		System.out.println("Sort By Value in Desc order");
		
		//Sort by value in reverse order
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		System.out.println("Sort By key in Asc order");
		
		//Sort by key in asc order
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("Sort By key in Desc order");
		
		//Sort by value in desc order
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		System.out.println("Sort By Value in Desc order by collecting data in nw map");
		
		LinkedHashMap<Integer, Integer> map1 = map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) ->e2, LinkedHashMap::new));

		System.out.println(map1);
		
	}

}
