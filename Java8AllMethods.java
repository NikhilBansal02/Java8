package java8.programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Java8AllMethods {

	public static <T> void print(List<T> numbers) {
		
		Consumer<Integer> sysoutConsumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
					
				System.out.println(x);
			}
		};
		
		numbers.stream()	
		.forEach((Consumer<? super T>) sysoutConsumer);
	}

	public static void isEven(List<Integer> numbers) {
		numbers.stream()	
		.filter(n -> n%2==0) // Lambda Expression
		.forEach(System.out::println); // Method Reference
	}

	public static void isOdd(List<Integer> numbers) {
		numbers.stream()	
		.filter(n -> n%2!=0) // Lambda Expression
		.forEach(System.out::println); // Method Reference
	}

	public static void contains(List<String> list,String element) {

		list.stream()
		.filter(str -> str.contains(element))
		.forEach(System.out::println);
	}

	public static void filterBySize(List<String> list) {

		list.stream()
		.filter(str -> str.length()>=4)
		.forEach(System.out::println);
	}

	public static void printSquare(List<Integer> numbers) {

		numbers.stream()
		.map(number -> number * number)
		.forEach(System.out::println);
	}

	public static void printCubesOfoddNumbers(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number%2!=0)
		.map(number -> number * number * number)
		.forEach(System.out::println);
	}

	public static void countNumberOfCharacters(List<String> courses) {

		courses.stream()
		.map(course -> course.length())
		.forEach(System.out::println);
	}

	public static void addNumbers(List<Integer> numbers) {

		int result = numbers.stream()
				//.reduce(0,(a,b) ->a+b);
				.reduce(0, Integer::sum);

		System.out.println("Sum is : - " + result);

	}

	public static void minmaxUsingReduce(List<Integer> numbers) {

		int max = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x:y);

		System.out.println("maximum is : - " + max);

		int min = numbers.stream()
				.reduce(Integer.MAX_VALUE, (x,y) -> x>y ? y:x);

		System.out.println("minimum is : - " + min);

	}

	public static void sumOfSquares(List<Integer> numbers) {

		int result = numbers.stream()
				.map(n -> n*n)
				.reduce(0, Integer::sum);

		System.out.println("Result is : - " + result);

	}

	public static void sumOfCubes(List<Integer> numbers) {

		int result = numbers.stream()
				.map(n -> n*n*n)
				.reduce(0, Integer::sum);

		System.out.println("Result is : - " + result);

	}
	
	public static void sumOfOddNumbers(List<Integer> numbers) {

		int result = numbers.stream()
				.filter(n -> n%2!=0)
				.reduce(0, Integer::sum);

		System.out.println("Sum of Odd Numbers : - " + result);

	}
	
	
	/**
	 * Sort the elements in ascending order or in natural order
	 * @param list
	 */
	public static <T> void sortElements(List<T> list) {
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
	}
	
	/**
	 * Sort the elements in descending  order
	 * @param list
	 */
	public static <T> void sortElementsInDescending(List<T> list) {
		
		list.stream()
		.sorted((Comparator<? super T>) Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}
	
	
	/**
	 * Remove Duplicates followed by sorting the elements in natural order
	 * @param list
	 */
	public static <T> void sortAndRemoveDuplicatesElements(List<T> list) {
		
		list.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}
	
	/**
	 * Remove Duplicates followed by sorting the elements in descending order
	 * @param list
	 */
	public static <T> void sortDescendingAndRemoveDuplicatesElements(List<T> list) {
		
		list.stream()
		.distinct()
		.sorted((Comparator<? super T>) Comparator.reverseOrder())
		.forEach(System.out::println);
	}

	public static void customSortOnlength(List<String> courses) {
		
		courses.stream()
		.sorted(Comparator.comparing(str -> str.length()))
		.forEach(System.out::println);
	}
	
	
	
}
