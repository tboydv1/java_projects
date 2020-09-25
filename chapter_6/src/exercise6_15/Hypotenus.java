package exercise6_15;

import java.util.Scanner;

public class Hypotenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two sides of a right angle triangle seperated by spaces");
		double sideA = in.nextDouble();
		double sideB = in.nextDouble();
		
		System.out.println("Hypotenus is: " + hypotenus(sideA, sideB));
		in.close();

	}
	public static double hypotenus(double side1, double side2) {
		
		double hypotenus = Math.pow(side1, 2) + Math.pow(side2, 2);
		
		return Math.sqrt(hypotenus);
	}

}
