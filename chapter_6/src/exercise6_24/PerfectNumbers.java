package exercise6_24;
//program checks if a number is a perfect number 
//author @ oluwatobi

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Enter number between 1 - 1000");
//		long num = in.nextLong();
//		
//		
//		System.out.println(isPerfect(num) ? "is Perfect" : "is not Perfect");
		
		displayPerfect_n();

	}
	public static boolean isPerfect(long number) {
		
		long div = number / 2, temp, sum = 0;
		String store = " ";
		
		for(int i = 1; i <= div; i++) {
			
			temp = number % i;
			
			if(temp == 0) {
				sum += i;
				store = store + i + ", ";
			}
		}
			if(sum == number) {
			System.out.println("" + store + "= " + sum);
			}
			return true;
			
	}
	
	public static void displayPerfect_n() {
		
		for(long i = 1; i <= 1_000_00; i++) {
				isPerfect(i);
		}
	}

}
