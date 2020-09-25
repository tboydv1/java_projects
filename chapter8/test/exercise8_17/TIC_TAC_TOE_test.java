package exercise8_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TIC_TAC_TOE_test {

	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		TIC_TAC_TOE obj = new TIC_TAC_TOE();
		
		System.out.printf("TIC-TAC-TOE!%nPlay with computer 1%nPlay with human 2%n");
		try {
		int choice = input.nextInt();
		
		if(choice == 1)
		obj.playWithComputer();
		else if(choice == 2)
			obj.play();
		}
		catch(InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		
		
		
	}
}
