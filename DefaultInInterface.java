package java8;

interface Formula{
	
	 double calculate(int a);
	
	default double sqrt(int a) {
		
		return Math.sqrt(a);
	}
	default void display() {
		
		System.out.println("This is another default method");
	}
}

public class DefaultInInterface implements Formula {

	public static void main(String[] args) {
		
		Formula formula =  new Formula() {
			@Override
			public double calculate(int a) {
				
				return sqrt(a*100);
			}
			
		};
		
		System.out.println(formula.calculate(100));
		System.out.println(formula.sqrt(16));

	}

	@Override
	public double calculate(int a) {
		return 0;
	}

}	