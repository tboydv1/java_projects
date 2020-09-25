package davidsAssignment;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.printf("Average of %d, %d, %d, %d is = %.2f",
				2,4,5,6,findAverage(2,4,5,6));
	}
	
	public static double findAverage(int a, int b, int c, int d) {
		
		 double average = (a + b + c + d ) / 4; 
		
		 return average;
	}

}
