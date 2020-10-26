package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Practice {

	public static void main(String[] args) {
		
		List<Integer> list  = new ArrayList<Integer>(Arrays.asList(5,10,15,6,9));
		List<Integer> list1  = new ArrayList<Integer>();
		List<String> stringList  = new ArrayList<String>(Arrays.asList("dell","hp","compact","asus","apple"));
		
		int a[] = {10,1,2,3,50,13,14,13,12,10,1,2,60,50,12};
		int orderedArrayWithDuplicates[] = {1,1,1,2,3,4,5,5,5,5,6,7,8,9,9};
		
		String people[] = {"Rahul","Ankit","Sagar","Sagar","Akki","Rahul"};
		
		//Java8Methods.average(list1);
		//Java8Methods.toUpperCase(stringList);
		//Java8Methods.filterR1(stringList);
		//Java8Methods.getString(list);
		
		//Java8Methods.count(null);
		//Java8Methods.findFirst(a);
		//Java8Methods.findAny(a);
		//Java8Methods.groupingBy(people);
		//Java8Methods.minmax(a);

		//Java8Methods.statistics(a);
		//Java8Methods.convertIntArrayToInteger(a);
		
		//Java8Methods.convertListOfIntArrayToListOfInteger(a);
		//Java8Methods.range(0, 10);
		//Java8Methods.rangeClosed(20, 29);
		//Java8Methods.iterate();
		//Java8Methods.distinctViaDistinct(a);
		//Java8Methods.distinctViaSet(a);
		//Java8Methods.evenNumber(a);
		//Java8Methods.concat(people);
		//Java8Methods.sum(a);
		Java8Methods.reduce(a);
		
	}

}
