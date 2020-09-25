package CrapsGame;

import java.security.SecureRandom;

public class CrapsGame {

	private static final int Seven = 7;
	private static final int Eleven = 11;
	private static final int Two = 2;
	private static final int Three = 3;
	private static final int Twelve = 12;
	private static int gamePoint;
	private static int diceSum;
	
	public static int rollDice() {
		SecureRandom randomNumbers = new SecureRandom();
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}
	
	public static void CheckOutcome() {
		diceSum = rollDice();
		System.out.printf("Point is: %d%n", diceSum);
		
		switch(diceSum) {
		case Seven: case Eleven: 
			System.out.print("Player wins!!");
			break;
			
		case Two: case Three: case Twelve: 
			System.out.println("Player loses");
			break;
			
		default:
			System.out.println("Continue");
			gamePoint = diceSum;
			while(diceSum != Seven) {
				diceSum = rollDice();
				
				if(diceSum == gamePoint) {
					System.out.println("Player wins!!");
					break;
				}
				else if(diceSum == 7) {
					System.out.println("Player loses");
				}
			}
		}
		
	}
}
