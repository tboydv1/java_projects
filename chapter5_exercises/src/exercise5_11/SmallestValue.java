package exercise5_11;

import java.util.Scanner;

public class SmallestValue {

	public void findSmallestValue()
	{
		
		int i = 1; //control variable 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Numbers: ");
		int counter = input.nextInt(); //specifies number of values to input from user
		
		int next = input.nextInt();//read values
		int smallest = next;
		
		while(i < counter)
		{
			next = input.nextInt();
			
			if(next < smallest)
			{
				smallest = next;
			}
			
			i++;
		}// TODO Auto-generated method stub
		System.out.print("Smallest Value is: "+ smallest);
		input.close();
		
	}
	public static void main(String[] args) {
		
		SmallestValue indent = new SmallestValue();
		
		indent.findSmallestValue();

	}

}
