package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		
		//********** Range ***************//
		//IntStream.range(0, 10)
		//.forEach(System.out::print);
		
		//System.out.println();
		
		//********** Range Closed***************//
		//IntStream.rangeClosed(0, 10)
		//.forEach(System.out::print);
		
		//********** Iterate ***************//
//		IntStream.iterate(0, operand -> operand +1)
//		.filter(i->i%2==0)
//		.limit(10)
//		.forEach(System.out::println);
		
		//********** MIN and MAX ***************//
//		Integer a[] = {1,2,3,4,5,6,7,-1,0,-50,50};
//		final List<Integer> numbers = Arrays.asList(a);
//		
//		int min = numbers.stream()
//		.min(Comparator.naturalOrder())
//		.get();
//		
//		int max = numbers.stream()
//				.max(Comparator.naturalOrder())
//				.get();
//		
//		System.out.println("Min: "+min+" Max: " +max);
		
		
		//********** DISTINCT - Remove Duplicates ***************//
		Integer a[] = {1,1,1,2,3,4,5,5,5,5,5,5,0,9,8,9,7};
		final List<Integer> numbers = Arrays.asList(a);
		//Collections.sort(numbers);
		//System.out.println(numbers);
		
		List<Integer> distinctNumbers = numbers.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(distinctNumbers);
		
		//********** To Set - Remove Duplicates  ***************//
		Integer a1[] = {1,1,1,2,3,4,5,5,5,5,5,5,0,9,8,9,7};
		final List<Integer> numbers1 = Arrays.asList(a1);
		
		Set<Integer> result = numbers1.stream()
		.collect(Collectors.toSet());
		
		System.out.println(result);
		
		
	}

}
