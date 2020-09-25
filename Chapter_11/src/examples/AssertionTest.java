package examples;

import java.util.Scanner;

public class AssertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();
		
		//assert that the value is >= 0 and <= 10
		assert (number >= 0 && number <= 10) : "bad number " + number;
		
		System.out.printf("You entered %d%n", number);
		
		input.close();
	}

}
