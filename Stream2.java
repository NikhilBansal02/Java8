package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Stream2 {

	public static void main(String[] args) {
		
		Integer a[] = {2,2,2,4};
		final List<Integer> numbers = Arrays.asList(a);
		//Collections.sort(numbers);
		// **** EVEN Numbers ***********************//
//		List<Integer> list = numbers.stream()
//		.filter(filtered)
//		.collect(Collectors.toList());
//		System.out.println(list);
		
		// **** Average Numbers ***********************//
		Double res = numbers.stream()
				.mapToDouble(Integer::doubleValue)
				.average()
				.orElse(0);
				System.out.println(res);
		
		
	}
	
	final static Predicate<Integer> filtered = i -> i%2==0;

}
