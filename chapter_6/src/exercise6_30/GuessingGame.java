package exercise6_30;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {

	private enum Mode {High,Low,Yes,Default}
	
	public static void guessingGame() {
		Scanner in = new Scanner(System.in);
		
		int guess, play = 1, tries = 0;
		int  value;
		Mode range = Mode.Default;
		

	while(play == 1) {
		System.out.println("Guess a number between 1 - 1000");
		value = generateNumbers();
		
			do{
			guess = in.nextInt();
			
			if(guess > value) {
				range = Mode.High;
				System.out.println("Too High. Try Again");
			}
			else if(guess < value) {
				range = Mode.Low;
				System.out.println("Too Low. Try Again");
			}
			else if (guess == value) {
				range = Mode.Yes;
				System.out.printf("Congratulation. You guessed the number!!%n%n");
				break;
			}
			tries++;
			}while(range != Mode.Yes);
			
		
			if(tries <= 10) {
				
				System.out.println("Either you know the secret or you got lucky!\n");
			}
			else if(tries == 10) {
				System.out.println("Aha! You know the secret!\n");
			}
			else if(tries > 10)
				System.out.println("You should be able to do better\n");
			
			
			tries = 0;
			range = Mode.Default;
			System.out.print("Enter 1 to play again or 0 to exit\n");
			play = in.nextInt();		
	}
		System.out.print("GoodBye!!");
	}
	public static int generateNumbers() {
		SecureRandom digit = new SecureRandom();
		int value = 1 + digit.nextInt(1000);
		return value;
	}
	
}
