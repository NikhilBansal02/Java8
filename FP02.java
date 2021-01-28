package java8.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class FP02 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(19,4,5,6,2,9,5,4);
		List<String> courses = Arrays.asList("Spring","Spring Boot","Spring Security","Core Java","C++","C++");
		
		//UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
		//System.out.println(unaryOperator.apply(1000));
		
//		BiPredicate<Integer, String> biPredicate = (num, str) ->{
//				return num >10 && str.length() > 2;
//		};
//		System.out.println(biPredicate.test(0, "nikhil"));
		
//		BiFunction<Integer, String , String> biFunction = (num, str) ->{
//			return num + " " + str;
//		};
//		System.out.println(biFunction.apply(10, "nikhil"));
		
//		BiConsumer<Integer, String> biConsumer = (num, str) ->{
//				
//			System.out.println(num +" and " +str);
//		};
//		biConsumer.accept(20, "Nikhil");
		
		Java8Methods_2.toUppercase(courses);
		
		String s = new String();
		
	}
	
	

}
