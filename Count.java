package java8;

import java.util.Arrays;

public class Count {
	
		public static void main(String[] args) {

			int a[] = {5,8,9,2,40,10,3};
			
			long res = Arrays.stream(a)
					.count();
			System.out.println(res);
		}

}
