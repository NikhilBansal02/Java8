package java8;

import java.util.Arrays;

public class Reduce {

	public static void main(String[] args) {

		Integer[] integers = {12,10,52,78,99,58};
		
		int sum = Arrays.stream(integers)
		.reduce(0,(a,b) -> a+b);
		System.out.println(sum);
		
		int sum2 = Arrays.stream(integers)
		.reduce(0,Integer::sum);
		System.out.println(sum2);
	}

}
