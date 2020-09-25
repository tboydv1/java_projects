package questions;

import java.util.Scanner;

public class ReverseIntegers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
//		int array[] = new int[10];
//		int numbers;
//		System.out.println("Enter 10 values: ");
//		
//		for(int count = 9; count >= 0; count--) {
//			numbers = in.nextInt();
//			
//			array[count] = numbers;
//			
//		}
//		
//		for(int value: array) {
//			System.out.printf("%5d", value);
//		}
		
		displayPatterns(4);
	
	}
	public static void displayPatterns(int n) {
		
		int space = n;
		for(int count = 1; count <= n; count++) {
			
			for(int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int i = count; i > 0; i--) {
				System.out.printf("%d", i);
				
			}
			space--;
			System.out.println();
		}
	}

}
