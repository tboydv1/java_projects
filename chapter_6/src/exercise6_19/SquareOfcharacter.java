package exercise6_19;

import java.util.Scanner;

public class SquareOfcharacter {
	
	public static void displayCharacter(char fill, int size) {
		
		
		for(int i = 1; i <= size; i++) {
			for(int a = 1; a <= size; a++) {
				System.out.print(fill);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter shape fill");
		char fill = in.next().charAt(0);
		
		System.out.println("Enter shape size");
		int size = in.nextInt();
		
		
		displayCharacter(fill, size);
	}

}
