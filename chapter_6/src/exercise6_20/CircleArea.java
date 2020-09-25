package exercise6_20;

import java.util.Scanner;

public class CircleArea {
	
	public static double calculateCircleArea(double radius) {
		double area;
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		double rad = input.nextDouble();
		
		System.out.printf("Area of circle is: %.2f", calculateCircleArea(rad));
		
		input.close();
	}

}
