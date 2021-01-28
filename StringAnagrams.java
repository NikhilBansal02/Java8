package java8.programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringAnagrams {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("cat", "act","god","tac","odg");
		
		Map<Object, List<String>> map = list.stream()
		.collect(Collectors.groupingBy(str ->  StringAnagrams.input(str)));
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	
	public  static int input(String str) {
		
		
		char ch[] = str.toCharArray();
		int sum = 0;
		for(char c:ch) {
			sum = sum + c;
		}
		return sum;
	}

}
