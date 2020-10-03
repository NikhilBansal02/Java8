package java8;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class FindFirst {
	//********* findFirst() is deterministic************//
	final static IntPredicate filterCriteria = n -> n >5 && n < 50;

	public static void main(String[] args) {

		int a[] = {5,8,9,2,40,10,3};
		
		int res = Arrays.stream(a)
		.filter(filterCriteria)
		.findFirst()
		.getAsInt();
		
		System.out.println(res);
	}

}
