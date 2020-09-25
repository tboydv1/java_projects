package chapter_6examples;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt for values
		System.out.print("Enter three floating-point values seprated by space: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		//determine maximum value
		double result = (maximum(num1, num2, num3));
		double less = (minimum(num1, num2, num3));
		
		//display maximum value
		System.out.println("Maximum is: " + result);
		System.out.println("Minimum is: " + less);

		

		input.close();


		
	}
	//returns the largest of three double  values
	public static double maximum(double x, double y, double z) {
//		double maximumValue = x; //assume the largest starts from x
		
//		if(y > maximumValue)
//			maximumValue = y;
//		
//		if(z > maximumValue)
//			maximumValue = z;
		
		return Math.max(x, Math.max(y, z));
	}
	//returns the smallest of three double values
	public static double minimum(double x, double y, double z) {
//		double minimumValue = x; // assume the largest starts from x
		
//		if(y < minimumValue)
//			minimumValue = y;
//		
//		if(z < minimumValue)
//			minimumValue = z;
//		
//		return minimumValue;
		return Math.min(x, Math.min(y, z));
	}

}
