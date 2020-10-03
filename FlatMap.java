package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	
	public static void main(String args[]) {
		
		List<ArrayList<String>> arraylistofnames = new ArrayList<ArrayList<String>>();
		ArrayList<String> s1 = new ArrayList<String>();
		ArrayList<String> s2 = new ArrayList<String>();
		ArrayList<String> s3 = new ArrayList<String>();
		arraylistofnames.add(s1);
		arraylistofnames.add(s2);
		arraylistofnames.add(s3);
		
		s1.add("a");
		s1.add("b");
		s2.add("a");
		s2.add("b");
		s3.add("a");
		s3.add("b");
		
		List<String> list = arraylistofnames.stream()
		.flatMap(List::stream)
		.collect(Collectors.toList());
		System.out.println(list);
		
		List<String> list1 = Arrays.asList("Geeks","for","GFG","nikhil");
		
		list1.stream().flatMap(str ->Stream.of(str.charAt(2))).forEach(System.out::print);
		System.out.println();
		list1.stream().map(str ->str.charAt(2)).forEach(System.out::print);
	}

}
