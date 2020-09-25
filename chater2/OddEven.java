//This program recives input from user and determines if input is an even or odd number
//Author @Oluwatobi Omotosho 14/05/19

import java.util.Scanner;
	public class OddEven{

		public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	//Declare variable to store user input 
		int value;

		System.out.println("Please Enter a number; ");
			value = input.nextInt();
		
		int even = value % 2;
 

	if(even == 0)
		System.out.printf("%s%d%n", "is an even number ", value);
	if (even != 0)
			System.out.printf("%d is an odd number", value);
	input.close();
}//End of main method 
	}//End of class OddEven