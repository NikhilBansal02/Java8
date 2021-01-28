package java8.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Course{
	
	String course;
	int reviews;
	int students;
	
	public Course(String course, int reviews, int students) {
		super();
		this.course = course;
		this.reviews = reviews;
		this.students = students;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int reviews) {
		this.reviews = reviews;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [course=" + course + ", reviews=" + reviews + ", students=" + students + "]";
	}
	
	
}

public class FPCustomClass {

	public static void main(String[] args) {

		List<Course> courses = Arrays.asList(
					new Course("Spring",98,1000),
					new Course("Spring Boot",98,4000),
					new Course("Spring Security",95,3000),
					new Course("Spring Data",95,2000),
					new Course("Spring Batch",91,2000)
				);
		
		Predicate<Course> reviewsPredicate = course -> course.getReviews()> 85;
		Predicate<Course> reviewsPredicateGreateThan92 = course -> course.getReviews()> 92;
		
		System.out.println(courses.stream()
		.allMatch(reviewsPredicate));
		
		System.out.println("=========================================");
		
		Predicate<Course> studentsPredicate = course -> course.getStudents() >1000;
		
		System.out.println(courses.stream()
		.noneMatch(studentsPredicate));
		
		System.out.println("=========================================");
		
		System.out.println(courses.stream()
				.anyMatch(studentsPredicate));
		
		System.out.println("=========================================");
		Comparator<Course> studentsComparatorIncreasing = Comparator.comparingInt(Course::getStudents); 
		
		courses.stream()
		.sorted(studentsComparatorIncreasing)
		.forEach(System.out::println);
		
		System.out.println("=========================================");
		Comparator<Course> studentsComparatorDecreasing = Comparator.comparingInt(Course::getStudents).reversed();
		
		courses.stream()
		.sorted(studentsComparatorDecreasing)
		.forEach(System.out::println);
		
		System.out.println("=========================================");
		Comparator<Course> studentsComparatorThenReviewsComparatorDecreasing =
				Comparator.comparing(Course::getStudents).thenComparing(Course::getReviews).reversed();
		
		courses.stream()
		.sorted(studentsComparatorThenReviewsComparatorDecreasing)
		.forEach(System.out::println);
		
		System.out.println("=========================================");
		
		System.out.println("Max Students with Review more than 92 :"+courses.stream()
		.filter(reviewsPredicateGreateThan92)
		.mapToInt(Course::getStudents)
		.max());
		
		System.out.println("Min Students with Review more than 92 :"+courses.stream()
		.filter(reviewsPredicateGreateThan92)
		.mapToInt(Course::getStudents)
		.min());
		
		System.out.println("Sum of  Students with Review more than 92 :"+courses.stream()
		.filter(reviewsPredicateGreateThan92)
		.mapToInt(Course::getStudents)
		.sum());
		
		System.out.println("Average of  Students with Review more than 92 :"+courses.stream()
		.filter(reviewsPredicateGreateThan92)
		.mapToInt(Course::getStudents)
		.average());
		
		System.out.println("Find First of  Students with Review more than 92 :"+courses.stream()
		.filter(reviewsPredicateGreateThan92)
		.mapToInt(Course::getStudents)
		.findFirst());
		
		System.out.println("Find Any of  Students with Review more than 92 :"+courses.stream()
		.filter(reviewsPredicateGreateThan92)
		.mapToInt(Course::getStudents)
		.findAny());
		
		System.out.println("=================GROUPING BY========================");
		
		System.out.println("Group By Reviews :"+
				courses.stream()
				.collect(Collectors.groupingBy(Course::getReviews)));

		System.out.println("Group By Reviews and and course count :"+
				courses.stream()
				.collect(Collectors.groupingBy(Course::getReviews, Collectors.counting())));
		
		System.out.println("Group By Reviews and Get Course with max students  :"+
				courses.stream()
				.collect(Collectors.groupingBy(Course::getReviews,
						Collectors.maxBy(Comparator.comparing(Course::getStudents)))));
		
		
		System.out.println("Group By Reviews and collect course names only :"+
				courses.stream()
				.collect(Collectors.groupingBy(Course::getReviews, 
						Collectors.mapping(Course::getCourse, Collectors.toList()))));
		
		
	}
	
}
