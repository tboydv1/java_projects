package exercise7_9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayT {
	
	static Scanner input = new Scanner(System.in);
	static int rowCount, columnCount;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] t = {{1,2,0},{3,4,5}};
		
//		System.out.println(t[0]);
		System.out.println("exercise 7.9");
		displayArrays("All elements of array t are:%n",t);
		System.out.println("");
		System.out.printf("Array t has %d rows%nArray t has %d Columns%n",rowCount, columnCount);
		System.out.printf("Array t has %d elements%n", columnCount);
		
		System.out.printf("%n%s%s%2s%2s%n", "elements in row one are: ",t[0][0],t[0][1],t[0][2]);
		System.out.printf("%n%s%s%2s%n%n", "elements in column 2 are: ",t[0][1],t[1][1]);
		
		//exercise 7_9 (g)
		t[0][1] = 0;
		System.out.printf("row 0 column 1 is set to: %s%n",t[0][1]);
		
		//exercise 7_9 (h)
		t[0][0] = 0;
		t[0][1] = 0;
		t[0][2] = 0;
		t[1][0] = 0;
		t[1][1] = 0;
		t[1][2] = 0;
		
		
		displayArrays("%nset all elements of array t to 0%n", t);

		//exercise 7_9 (i)
		
		for(int row = 0; row < t.length; row++) {
			
			for(int column = 0; column < t[row].length; column++) {
				
				t[row][column]= 0;
			}
		}
		displayArrays("%nnested loop set all elements of array t to 0: %n", t);

		//exercise 7_9 (j)
		int userIn;
		System.out.println("\nInput 6 value seperated by space: ");
		for(int row = 0; row < t.length; row++) {
			
			for(int column = 0; column < t[row].length; column++) {
				userIn = input.nextInt();
				t[row][column]= userIn;
			}
		}
		displayArrays("array t new element values are: %n", t);
		
		//exercise 7_9 (k)
		
		int smallest = t[0][1];
			for(int row = 0; row < t.length; row++) {
			
			for(int column = 0; column < t[row].length; column++) {
				
				if(t[row][column] < smallest)
					smallest = t[row][column];
			}
		}
			System.out.printf("%nsmallest value in array t is :%d%n", smallest);
			
			//exercise 7_9 (l)
			System.out.printf("%nelements of the first row of t are: %s %s %s%n%n", t[0][0], t[0][1], t[0][2]);
		
			//exercise 7_9 (m)
			System.out.printf("total of third elements of column t is: %s%n%n", t[0][2]+t[1][2]);

		}
	public static void displayArrays( String description, int[]... arrays) {
		
		System.out.printf(description);
			System.out.printf("   %-3d%-3d%-3d%n", 0,  1 , 2);
		for(int row = 0; row < arrays.length; row++) {
			System.out.printf("%-3d",row);
			for(int column = 0; column < arrays[row].length; column++){
				System.out.printf("%-3d",arrays[row][column] );
				columnCount++;
				}
					rowCount++;
					System.out.println("");
			}
		}
	}

