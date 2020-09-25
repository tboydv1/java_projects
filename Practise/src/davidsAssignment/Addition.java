package davidsAssignment;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	
		System.out.println("Enter first number: ");
		int firstNumber  = in.nextInt();
		
		System.out.println("Enter second number: ");
		int secondNumber = in.nextInt();
		
		int sum = firstNumber + secondNumber;
		
		System.out.println("Sum is: " + sum);
	}

}
