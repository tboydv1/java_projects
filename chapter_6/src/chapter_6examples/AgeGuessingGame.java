package chapter_6examples;

import java.util.Scanner;

public class AgeGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your current age: ");
		int age = input.nextInt();
		
		int sum = (66 - age);
		System.out.println("66 - " + age + " = " + sum);
		int birthYear = sum + 1953;
		System.out.println("1953 + " + sum + " = " + birthYear);
		System.out.println("Your birth year is " + birthYear);
		
		
		
	}

}
