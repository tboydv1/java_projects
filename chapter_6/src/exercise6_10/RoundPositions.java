package exercise6_10;

import java.util.Scanner;

public class RoundPositions {
	
	public static double roundToInteger(double number) {
		
		double y = Math.floor(number + 0.5);
		
		return y;
	}
	public static double roundToTenths(double number) {
		
		double y = Math.floor(number * 10 + 0.5) / 10;
		
		return y;
	}
	public static double roundToHundreths(double number) {
		
		double y = Math.floor(number * 100 + 0.5) / 100;
		
		return y;
	}
	public static double roundToThousandths(double number) {
		
		double y = Math.floor(number * 1000 + 0.5) / 1000;
		
		return y;
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value: ");
		double x = input.nextDouble();
		
		System.out.println("Original value is: " + x);
		
		System.out.println("value rouded to the nearest integer is: " + roundToInteger(x));
		
		System.out.println("value rouded to the nearest tenths is:  " + roundToTenths(x));
		
		System.out.println("value rouded to the nearest hundreths is: "+ roundToHundreths(x));
		
		System.out.println("value rouded to the nearest thousandths is: " + roundToThousandths(x));

	}

}
