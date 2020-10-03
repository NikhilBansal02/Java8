package java8;

import java.util.Arrays;

public class MinMax {
	
		public static void main(String[] args) {

			int a[] = {5,8,9,2,40,10,3};
			
			int min = Arrays.stream(a)
			.min()
			.orElse(0);
			
			int max = Arrays.stream(a)
					.max()
					.orElse(0);
			
			System.out.println(min +" " + max);
		}

}
