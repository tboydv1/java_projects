package exercise7_29;

import java.util.Scanner;

public class FibonacciTest {

	
	public static void main(String args[]) {
		 Fibonacci series = new Fibonacci();
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter nth value in fibonacci series");
		 int term = input.nextInt();
		 
		 System.out.println("fibonacci number is: " +series.findFibonachi(term));
	}
}
