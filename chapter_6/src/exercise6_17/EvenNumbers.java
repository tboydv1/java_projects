package exercise6_17;

import java.util.Scanner;

public class EvenNumbers {
	
	public static boolean isEven(int digit) {
		int div = digit % 2; //check if digit is divisible by 2 without a remainder
		
		if(div == 0) {
			return true;
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter range of number series: ");
		int range = in.nextInt();
		int num;
		
		for(int l = 1; l <= range; l++) {
			System.out.println("Enter number: ");
			num = in.nextInt();
			
			System.out.println(isEven(num) ? "is even" : "is odd");
			
		}
	}

}
