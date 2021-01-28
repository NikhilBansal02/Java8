package java8.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP04 {
	
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		//Below uses stream parallel capablity
		//System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		//System.out.println(System.currentTimeMillis() - time);
		
		//replaceALl, this does modification directly in underlying data structure.
		//This creates a immutable List of Strings hence replaceAll and removeIf will not work , we need to create list as ArrayList 
		//for methods to work.
		List<String>  courses = Arrays.asList("Spring","Spring Boot","Spring Security","Core Java","C++","C++");
		
		List<String> mutableCourses = new ArrayList<String>(courses);
		
		mutableCourses.replaceAll(String::toUpperCase);
		System.out.println(mutableCourses);
		
		mutableCourses.removeIf(str -> str.length() > 8);
		System.out.println(mutableCourses);
		
		
	}

}
