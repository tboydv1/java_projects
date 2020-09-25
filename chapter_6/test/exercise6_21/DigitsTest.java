package exercise6_21;

import java.util.Scanner;

public class DigitsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers between 1 - 99999");
		int number = input.nextInt();
		
		System.out.println("\n" +Digits.displayDigits(number));
		
		input.close();
	}
}
