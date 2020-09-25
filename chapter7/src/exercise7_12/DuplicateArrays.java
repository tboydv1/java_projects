package exercise7_12;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author tboydev
 *(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.
 */
public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayArray();
		
	}
	public static boolean checkDuplicate(int[] array,int number) {
//			boolean result = false;
			for(int value: array)
				if(value ==  number)
					return true;
		
				return false;
	}
	public static void displayArray() {
		Scanner in = new Scanner(System.in);
		
		int[] arrayValue = new int[5];
		int user;
		for(int count = 0; count < arrayValue.length; count++) {
			System.out.println("Enter number: ");
			user = in.nextInt();
			
			if((checkDuplicate(arrayValue, user) == false))
				arrayValue[count] = user;
			
				for(int each: arrayValue)
					if(each != 0)
						System.out.printf("%d ", each);
					
				System.out.println();
				
		}
		
	}
}
