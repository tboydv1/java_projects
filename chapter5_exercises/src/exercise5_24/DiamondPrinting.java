package exercise5_24;

import java.util.Scanner;

public class DiamondPrinting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter odd number in the range 1 - 19:");
		int num = input.nextInt();	
		
		int div = num/ 2; 
		int tabs = div, star = 1;
		for(int d = 1; d <= num; d++) {
		
			for (int a = tabs; a > 0; a--)
			{
				System.out.print(" ");
			}
			for (int b = star; b > 0; b--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			if(d > div)
			{ 
				tabs += 1;
			}
			else 
				tabs -=1;
			
			if(d > div)
			{
				star -= 2;
			}
			else
				star += 2;
		}
		
	}

}
