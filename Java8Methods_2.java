package java8.programming;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java8Methods_2 {
	
	
	public static void print(String str) {
		
		System.out.println(str);
	}
	
	public static void listOfSquares(List<Integer> numbers) {
		
		Predicate<Integer> isEvenPredicate = n -> n%2==0;
		Function<Integer,Integer> squarePredicate = n -> n*n;
		
		List<Integer> result = numbers.stream()
		.filter(isEvenPredicate)
		.map(squarePredicate)
		.collect(Collectors.toList());
		
		System.out.println("List of Squares :- :" +result);
	}
	
	public static void listOfCoursesLenght(List<String> courses) {
		
		List<String> result = courses.stream()
		.map(course -> course +":"+ course.length())
		.collect(Collectors.toList());
		
		System.out.println("List of Courses Length :- :" +result);
	}

	public static void getEvenOrOdd(List<Integer> numbers, Predicate<Integer> predicate) {
		
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
	
	public static List<Integer> mapAndCreateList(List<Integer> numbers, Function<Integer, Integer> predicate){
		
		return numbers.stream()
		.map(predicate)
		.collect(Collectors.toList());
		
	}
	
	public static void getRandomInteger() {
		
		Supplier<Integer> randomNumber = () ->{
			Random random = new Random();
			return random.nextInt(200);
		};
		
		System.out.println(randomNumber.get());
		
	}
	
	public static void toUppercase(List<String> courses) {
		
		courses.stream()
		.map(String::toUpperCase)
		.forEach(Java8Methods_2::print);
	}
	
}
