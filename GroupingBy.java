package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		
		String people[] = {"Rahul","Ankit","Sagar","Sagar","Akki","Rahul"};
		
		List<String> names = Arrays.asList(people);
		Map<String, Long> result = 
		names.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		result.forEach((name,count) -> System.out.println(name +" > " +count));
	}

}
