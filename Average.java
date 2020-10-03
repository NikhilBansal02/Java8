package java8;

import java.util.Arrays;

public class Average {
	
	public static void main(String[] args) {

		Integer a[] = {5,8,9,2,40,10,3};
		
		double res = Arrays.stream(a)
				.mapToDouble(Integer::doubleValue)		
				.average()
				.orElse(0);
		
		System.out.println(res);
	}


}
