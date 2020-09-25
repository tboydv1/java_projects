package exercise6_26;

import java.util.Scanner;

public class ReversedInteger {
	

	public static int reverseDigits(int number) {
		int mod,  reversedInt = 0;
		
		while(number > 0) {
			
			mod = number % 10;
			reversedInt = reversedInt * 10 + mod;
			number = number / 10;
		}
		return reversedInt;
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int num = in.nextInt();
		
		System.out.println("reversed is: "+reverseDigits(num));
		
		in.close();
		
	}

}
