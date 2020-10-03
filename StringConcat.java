package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcat {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Geeks","for","GFG","nikhil");
		
		String collect = list1.stream()
		.map(String::toUpperCase)
		.collect(Collectors.joining(" | "));
		
		System.out.println(collect);
	}

}
