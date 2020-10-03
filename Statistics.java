package java8;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class Statistics {
	public static void main(String[] args) {

		Integer a[] = {5,8,9,2,40,10,3};
		
		DoubleSummaryStatistics stats = Arrays.stream(a)
		.mapToDouble(Integer::doubleValue)
		.summaryStatistics();
		
		System.out.println(stats);
		
	}
}
