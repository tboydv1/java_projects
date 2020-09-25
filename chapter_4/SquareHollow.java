package chapter4.exercise429;

import java.util.Scanner;

public class SquareHollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of square sides");
		int stars = input.nextInt();
		
		int row = 1;
		
		while(row <= stars)
		{
			int column = 1;
			
			while(column <= stars)
			{
				if(row == 1)
				{
					System.out.printf("%2s","*");
				}
				else if(row == stars) {
					System.out.printf("%2s","*");
				}
				else if(column == 1)
				{
					System.out.printf("%2s","*");	
				}
				else if(column == stars)
				{
					System.out.printf("%2s","*");
				}
				else System.out.printf("%2s"," ");	
				
				column++;
			}
			System.out.println();
			row++;
		}
	}

}
