package java8.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FP03 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,4,5,6,2,9,5,4);
		List<String> courses = Arrays.asList("Spring","Spring Boot","Spring Security","Core Java","C++","C++");
		
		//Stream<Integer> stream = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
		
		//Skip 
		numbers.stream()
		.skip(2)
		.forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("=====================");
		
		//limit
		numbers.stream()
		.limit(4)
		.forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("=====================");
		
		//max - Below max works on primitive hence no comparator is needed.
		int a[] = {5,8,9,2,40,10,3};

		System.out.println(Arrays.stream(a)
				.max()
				.orElse(0));
		
		
		//max - Below max works on Wrapper or objects hence we need to provide the comparator
		System.out.println(numbers.stream()
		.max(Comparator.naturalOrder()));
		
		//min
		System.out.println(
		numbers.stream()
		.min(Comparator.naturalOrder()));
		
		//Find First
		System.out.println("Find First :"+ numbers.stream()
		.filter(n -> n>4)
		.findFirst());
		
		//Find Any 
		System.out.println("Find Any :"+ numbers.stream()
		.filter(n -> n>4)
		.findAny());
		
		//Range
		System.out.println("Range :" +
		IntStream.range(1,10)
		.sum());
		
		//Range Closed
		System.out.println("Range Closed :" +
				IntStream.rangeClosed(1,10)
				.sum());
		
		//Iterator
		System.out.println("Iterator :"+IntStream.iterate(2, i -> i* 2)
		.limit(10)
		.peek(System.out::println)
		.sum());
		
	}
	
	

}
