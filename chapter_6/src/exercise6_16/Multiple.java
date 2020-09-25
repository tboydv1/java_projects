package exercise6_16;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter series lenght: ");
		int series = in.nextInt();
		int num1, num2;
		for(int r = 1; r <= series; r++) {
			System.out.print("Enter number pair seperate by space: ");
			num1 = in.nextInt();
			num2 = in.nextInt();
			
			System.out.println(isMultiple(num1, num2)? "is multiple" : "is not multiple");
		}
		in.close();
		
}
	public static boolean isMultiple(int first, int second) {
		int temp = second % first;
		
		if(temp == 0) {
			return true;
		}
		else
			return false;
	}

}
