package chapter4.exercise437;
import java.util.Scanner;
public class Factorial {
	
	public int findFactorial(int num)
	{
		int total = 1;
		int counter = 1;
		
		while(counter <= num)
		{
			total = counter * total;
			counter++;
		}
		return total;
	}	
	public int findConstant(int num)
	{
		int total = 1;
		int constant = 0;
		int counter = 1;
		
		while(counter <= num)
		{
			total = counter * total;
			constant = constant +  total;
			counter++;
		}
		return constant + 1;
	}
	
	
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			Factorial first = new Factorial();
			
			System.out.println("Enter number: ");
			int fig = input.nextInt();
			System.out.printf("Factorial is: %d%n", first.findFactorial(fig));
			System.out.printf("Estimate is: %d%n", first.findConstant(fig));
		
	}

}
