package chapter4.exercise421;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int number;
		int largest = 0;
		
		System.out.println("Enter series of 10 numbers: ");
		
		while(counter < 10)
		{
			number = input.nextInt();
			if (number > largest)
			{
				largest = number;
			}
			counter++;
		}
		System.out.printf("The largest of %d numbers is: %d", counter, largest);
		
	}

}
