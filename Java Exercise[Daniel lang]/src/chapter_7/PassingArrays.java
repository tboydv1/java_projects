package chapter_7;

import java.util.Scanner;
public class PassingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[3][4];
		
		System.out.printf("Enter %d rows and %d columns: ", m.length, m[0].length);
		
		for(int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextInt();
		
		System.out.println("\nSum of all elements is " + sum(m));
		
	}
	public static int sum(int[][] array) {
		
		int total = 0;
		
		for(int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				total += array[i][j];
		
		return total;
	}

}
