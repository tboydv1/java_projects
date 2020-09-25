package exercise6_18;

import java.util.Scanner;

public class AsterisksSquare {
	
	public static void squareOfAsterisks(int value) {
		
		for(int i = 1; i <= value; i++) {
			for(int a = 1; a <= value; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of square asterisks");
		int size = in.nextInt();
		
		squareOfAsterisks(size);
	}

}
