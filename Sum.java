package java8;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {

		Integer a[] = {5,8,9,2,40,10,3};
		
		double sumRes = Arrays.stream(a)
		.mapToDouble(Integer::doubleValue)
		.sum();
		
		System.out.println(sumRes);
		
	}
}
