package chapter4.exercise423;
import java.util.Scanner;

public class TwoGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number;
		int largest = 0;
		int secondLargest = 0;
		
		
		System.out.println("Enter a series of ten numbers: ");
		while(counter <= 10)
		{
			number = input.nextInt();
			if(number > largest)
			{
				secondLargest = largest;
				largest = number;
				
			}
			else {
					if((number > secondLargest))
					{
						secondLargest = number;
				
					}
			}
			counter++;
		}
		System.out.printf("The largest number is: %d%n", largest);
		System.out.printf("The second largest number is: %d%n", secondLargest);
		
		input.close();
	}

}
