
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.printf("Square of an integer 7 is : %d%n", square(7));
		
		System.out.printf("Square of double  7.5 is : %f%n", square(7.5));
	
	}
	public static int square(int intValue) {	 
		
		System.out.printf("called square with int argument: %d%n", intValue);
		return intValue * intValue;
	}
	public static double square(double number) {
		
		System.out.printf("%ncalled square with double argument: %f%n", number);
		return number * number;
	}

}
