package exercise5_32;

import java.util.Scanner;

public class Expenses {

	private double housing;
	private double food;
	private double clothing;
	private double transportation;
	private double education;
	private double healthCare;
	private double vacation;
	
	public void calculateFairTax() {
		
		double expenses = 0.0;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n", "Input expense category or -1 to end", "1- Housing",
				"2- Food", "3- Clothing", "4- Transportation", "5- Education", "6- Health care",
				"7- Vacation");
		int category = input.nextInt();
		double fairTax;
		while(category != -1) {
			
			switch(category) {
			case 1: 
				System.out.println("Enter housing expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					housing += expenses;
					expenses = input.nextDouble();
				}
				break;
			case 2: 
				System.out.println("Enter food expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					food+= expenses;
					expenses = input.nextDouble();
				}
				break;
			case 3: 
				System.out.println("Enter clothing expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					clothing += expenses;
					expenses = input.nextDouble();
				}
				break;
			case 4: 
				System.out.println("Enter transportation expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					transportation += expenses;
					expenses = input.nextDouble();
				}
				break;
			case 5: 
				System.out.println("Enter education expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					education += expenses;
					expenses = input.nextDouble();
				}
				break;
			case 6: 
				System.out.println("Enter health care expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					healthCare += expenses;
					expenses = input.nextDouble();
				}
				break;
			case 7: 
				System.out.println("Enter vacation expenses or 0 to end");
				expenses = input.nextDouble();
				while(expenses != 0) {
					vacation += expenses;
					expenses = input.nextDouble();
				}
			
			}
			System.out.println("Enter next category or -1 to end: ");
			 category = input.nextInt();

		}
		fairTax = (housing + food + clothing + transportation + education + healthCare + vacation) * 0.23;
		System.out.printf("Estimated fair tax is - %f", fairTax);
		input.close();
	}
	
	public static void main(String [] args) {
		Expenses wallet = new Expenses();
	
		wallet.calculateFairTax();
		
	}
}
