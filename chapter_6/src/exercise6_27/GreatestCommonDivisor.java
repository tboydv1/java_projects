package exercise6_27;

import java.util.Scanner;

//This program returns the greatest common divisor of two numbers
//using the euclid algorithm

public class GreatestCommonDivisor {

	//calculates and returns the greatest common divisor between two number using 
	//euclidian algorithm a = b(q) + r;
	public static int  findGCD(int num1, int num2) {
		int a, b;
		int remainder = 0; // stores remainder of division

		if(num1 > num2) {
			a = num1;
			b = num2;
		}
		else {
		  a = num2;
		  b = num1;
		}
				
				remainder = modulo(a, b);
				
			while (remainder > 0) {
				a = b;
				
				b = remainder;
				
				remainder = modulo(a, b);
				
				if(remainder < 0) {
					b = remainder * -1;
					break;
				}
			}
			return b;
		 }
		
		

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.printf("GCD(%d, %d) = %d", num1, num2, findGCD(num1, num2));
	}
	
	public static int modulo(int a, int b) {
		int modulus = a % b;
		
		return modulus;
	}
}
