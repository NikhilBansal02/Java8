package java8;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Methods {
	
	public static void average(List<Integer> list) {
		
		Double result = list.stream()
		.mapToInt(i -> i)
		.average()
		.orElse(0);
		
		System.out.println(result);
	}
	
	public static void toUpperCase(List<String> list) {
		
		 List<String> response = list.stream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		 
		 System.out.println(response);
		
	}
	
	public static void filterR1(List<String> list) {
			
		 List<String> response = list.stream()
		.filter(s -> s.startsWith("a"))
		.filter(s -> s.length() >= 3)
		.collect(Collectors.toList());
		 
		 System.out.println(response);
	}
	
	public static void getString(List<Integer> list) {
		
		
		String response = list.stream()
						  .map( i -> i%2 == 0 ? "e" + i : "o" + i)
						  .collect(Collectors.joining(","));
		
		System.out.println("String is :" +response);
		
	}
	
	public static void count(List<Integer> list) {
		
		Long result  =list.stream()
						   .count();
		System.out.println(result);
	}
	
	public static void findFirst(int a[]) {
		
		final  IntPredicate filterCriteria = n -> n >10 && n <50;
		
		int result = Arrays.stream(a)
		   .filter(filterCriteria)
		   .findFirst()
		   .orElse(0);
		
		System.out.println(result);
		
	}
	
	public static void findAny(int a[]) {
		
		final  IntPredicate filterCriteria = n -> n >10 && n <50;
		
		int result = Arrays.stream(a)
		   .filter(filterCriteria)
		   .findAny()
		   .orElse(0);
		
		System.out.println(result);
		
	}
	
	public static void groupingBy(String names[]) {
		
		List<String> nameList = Arrays.asList(names);
		
		Map<String,Long> result = nameList.stream()
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		result.forEach((name,count) -> System.out.println(name+" > "+count));
	}
	
	public static void minmax(int a[]) {
		
		int min = Arrays.stream(a)
				.min()
				.orElse(-1);
		
		int max = Arrays.stream(a)
				.max()
				.orElse(-1);
		
		System.out.println("Min is: "+min +" and Max is : "+max);
		
	}
	
	public static void statistics(int a[]) {
		
		IntSummaryStatistics stats = Arrays.stream(a)
				.summaryStatistics();
		
		System.out.println("Stats is :" +stats);
		
		Integer a1[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		DoubleSummaryStatistics stats1 = Arrays.stream(a1)
				.mapToDouble(Integer::doubleValue)
				.summaryStatistics();
		
		System.out.println("Stats is :" +stats1);
		
	}
	
	public static void convertIntArrayToInteger(int a[]) {
		
		Integer converted[]  = Arrays.stream(a).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.asList(converted));
	}
	
	public static void convertListOfIntArrayToListOfInteger(int a[]) {
		
		List<Integer> converted = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(converted);
	}
	
	
	public static void range(int startInclusive, int endExclusive) {
		
		IntStream.range(startInclusive, endExclusive)
		.forEach(System.out::println);
	}
	
	public static void rangeClosed(int startInclusive, int endInclusive) {
		
		IntStream.rangeClosed(startInclusive, endInclusive)
		.forEach(System.out::println);
	}
	public static void iterate() {
		
		IntStream.iterate(0,i->i+1)
		.limit(8)
		.forEach(System.out::println);
	}
	
	public static void distinctViaDistinct(int a[]) {
		
		Integer newA[] = convertIntArrayToInteger1(a);
		
		List<Integer> result = Arrays.stream(newA)
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
	
	public static void distinctViaSet(int a[]) {
		
		Integer newA[] = convertIntArrayToInteger1(a);
		
		Set<Integer> result = Arrays.stream(newA)
		.collect(Collectors.toSet());
		
		System.out.println(result);
	}
	
	public static void evenNumber(int a[]) {
		
		Integer newA[] = convertIntArrayToInteger1(a);
		
		List<Integer> list = Arrays.stream(newA)
		.distinct()
		.filter(i ->i%2 == 0)
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(list);
	}
	
	public static void concat(String names[]) {
		
		List<String> listOfNames = Arrays.asList(names);
		
		String result = listOfNames.stream()
				.distinct()
				.sorted()
				.collect(Collectors.joining(" | "));
		
		System.out.println(result);
	}
	
	public static void sum(int a[]) {
		
		Integer newA[] = convertIntArrayToInteger1(a);
		
		Double sum = Arrays.stream(newA)
		.mapToDouble(Integer::doubleValue)
		.sum();
		
		System.out.println(sum);
	}
	
	public static void reduce(int a[]) {
		
		Integer newA[] = convertIntArrayToInteger1(a);
		
		int result = Arrays.stream(newA)
		.reduce(0,Integer::sum);
		
		System.out.println("Result is :" +result);
	}
	
	
	public static Integer[] convertIntArrayToInteger1(int a[]) {
		
		return Arrays.stream(a).boxed().toArray(Integer[]::new);
	}
	
	
}
			