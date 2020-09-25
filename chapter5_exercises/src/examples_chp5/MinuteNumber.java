package examples_chp5;

import java.util.Scanner;

public class MinuteNumber {

	public void findSmallest()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		int set = input.nextInt();
		
		int values = input.nextInt();
		int smallest = values;
		
		for(int i = 2; i <= set; i++)
		{
			values = input.nextInt();
			
			if(values < smallest)
			{
				smallest = values;
			}
		}
		System.out.println("Smallest number is: "+ smallest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinuteNumber checkApp = new MinuteNumber();
		
		checkApp.findSmallest();
	}

}
