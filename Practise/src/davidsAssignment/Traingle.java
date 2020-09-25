package davidsAssignment;

import java.util.Scanner;

public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double heigth;
		double breadth;
		double area;
		
		System.out.println("Enter the height and breadth of a triangle");
		heigth = input.nextDouble();
		breadth = input.nextDouble();
		
		area = (heigth * breadth) / 2;
		
		System.out.println("Area of triangle is: " + area);
	}

}
