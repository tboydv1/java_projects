package exercise5_16;

import java.util.Scanner;

public class BarChart {

	public void printBarChart(int one, int two, int three, int four, int five)
	{ 
		int counter = 1;
		int value = 0;
		while (counter <= 5)
		{		
			if(counter == 1)
				value = one;
			else if(counter == 2)
				value = two;
			else if(counter == 3)
				value = three;
			else if(counter == 4)
				value = four;
			else if(counter == 5)
				value = five;
			
			for(int i = value; i > 0; i--)
			{
				System.out.print("*");
			}
			System.out.println();
			counter++;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BarChart graph = new BarChart ();
		
		System.out.println("Enter number from 1 - 30");
		int num1 = input.nextInt();
		
		System.out.println("Enter number from 1 - 30");
		int num2 = input.nextInt();
		
		System.out.println("Enter number from 1 - 30");
		int num3 = input.nextInt();
		
		System.out.println("Enter number from 1 - 30");
		int num4 = input.nextInt();
		
		System.out.println("Enter number from 1 - 30");
		int num5 = input.nextInt();
		
		graph.printBarChart(num1, num2, num3, num4, num5);
	}

}
