package java8.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class FP01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(19,4,5,6,2,9,5,4);
		List<String> courses = Arrays.asList("Spring","Spring Boot","Spring Security","Core Java","C++","C++");
		
		//Java8AllMethods.print(numbers);
		//Java8AllMethods.isEven(numbers);
		//Java8AllMethods.isOdd(numbers);
		//Java8AllMethods.print(courses);
		//Java8AllMethods.contains(courses, "Spring");
		//Java8AllMethods.filterBySize(courses);
		//Java8AllMethods.printSquare(numbers);
		//Java8AllMethods.printCubesOfoddNumbers(numbers);
		//Java8AllMethods.countNumberOfCharacters(courses);
		//Java8AllMethods.addNumbers(numbers);
		//Java8AllMethods.minmaxUsingReduce(numbers);
		//Java8AllMethods.sumOfSquares(numbers);
		//Java8AllMethods.sumOfCubes(numbers);
		//Java8AllMethods.sumOfOddNumbers(numbers);
		//Java8AllMethods.sortElements(numbers);
		//Java8AllMethods.sortElements(courses);
		//Java8AllMethods.sortAndRemoveDuplicatesElements(numbers);
		//Java8AllMethods.sortAndRemoveDuplicatesElements(courses);
		//Java8AllMethods.sortElementsInDescending(numbers);
		//Java8AllMethods.sortElementsInDescending(courses);
		//Java8AllMethods.sortDescendingAndRemoveDuplicatesElements(numbers);
		//Java8AllMethods.customSortOnlength(courses);
		//Java8Methods_2.listOfSquares(numbers);
		//Java8Methods_2.listOfCoursesLenght(courses);
		//Java8Methods_2.getEvenOrOdd(numbers, x->x%2==0);
		//Java8Methods_2.getEvenOrOdd(numbers, x->x%2!=0);
		
		//List<Integer> squaredNumbers = Java8Methods_2.mapAndCreateList(numbers, x ->x * x);
		//List<Integer> cubeNumbers = Java8Methods_2.mapAndCreateList(numbers, x ->x * x * x);
		//List<Integer> doubledNumbers = Java8Methods_2.mapAndCreateList(numbers, x ->x + x);
		
		//System.out.println(doubledNumbers);
		
		//Java8Methods_2.getRandomInteger();
		
		//UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
		//System.out.println(unaryOperator.apply(1000));
		
		BiPredicate<Integer, String> biPredicate = (num, str) ->{
				return num >10 && str.length() > 2;
		};
		
		System.out.println(biPredicate.test(0, "nikhil"));
		
	}

}
