package examples_chp5;

import java.util.Scanner;

public class CompoundInterest_Nth {

	public double calculateInterest(double principal, double rate, int numOfYears)
	{	
		rate = rate / 100 + 1;
		double totalAmount = 0; ;//calculates power
		double pow = 1.0;
		int i;
		
		System.out.printf("%s%20s%n", "Years", "Amount On Deposit");
		for(i = 1; i <= numOfYears; i++)
		{
			pow = pow  * (rate);
			
			totalAmount = principal * pow;
			System.out.printf("%4d%,21.2f%n", i, totalAmount);
		}
		
		return totalAmount;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount: ");
		double p = input.nextDouble();
		
		System.out.println("Enter interst rate: ");
		double r = input.nextDouble();
		
		System.out.println("Enter Number of years: ");
		int years = input.nextInt();
		
		CompoundInterest_Nth mojo = new CompoundInterest_Nth();
		
		mojo.calculateInterest(p, r, years);
				
		

	}

}
