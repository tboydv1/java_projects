package exercise6_33;

import java.security.SecureRandom;
import java.util.Scanner;

public class CasinoCrapsGame {
	
	private static final SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);

	private static final int SEVEN = 7;
	private static final int TRAY = 3;
	private static final int YO_LEVEN = 11;
	private static final int SNAKE_EYES = 2;
	private static final int BOX_CARS = 12;
	
	private  enum Status {WIN, LOSE, CONTINUE}
	static int playerPoint; //stores game point
	 
	public static Status playCraps() {
		int diceSum;		// stores dice sum
		
		Status gameMode; //To store current game mode
		
		diceSum = rollDice();
		
		switch(diceSum)
		{
		case SEVEN: case YO_LEVEN:
			gameMode = Status.WIN;
			
			break;
			
		case TRAY:  case SNAKE_EYES: case BOX_CARS:
			gameMode = Status.LOSE;
			
			break;
			
		default:
			gameMode = Status.CONTINUE;
			playerPoint = diceSum;
			System.out.printf("Point is: %d%n", playerPoint);
		}
			while(gameMode == Status.CONTINUE) {
				diceSum = rollDice();
				if (diceSum == SEVEN) {
					gameMode = Status.LOSE;
					
				}
				else if (diceSum == playerPoint) {
					gameMode = Status.WIN;
				}		
			}
			
			if(gameMode == Status.WIN) {
				System.out.println("Player wins!" + "\n");
				displayChatter();
			}
			else 
				System.out.println("Player loses" + "\n");
				displayChatter();
			
			return gameMode;
		
	}
	
	public static int rollDice() {
		
		int die1 = 1 + random.nextInt(6);
		int die2 = 1 + random.nextInt(6);
		
		int sum = die1 + die2;
		System.out.printf("%nPlayer rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}

	public static void allowWager() {
		
		Status  gamer;
		double bankBalance = 1000;
		double wager = 0;
		char choose;
		System.out.printf("%s%n%n%s%.2f%n","Welcome to Casino craps!", "Bank Balance is: ", bankBalance);
		System.out.print("Enter a wager: ");
		double bet = input.nextDouble();
	
				while(bet > bankBalance) {
					System.out.println("Invalid wager, must be below 1000. Try again");
					bet = input.nextDouble();
				}
				if(bet <= bankBalance) {
					wager = bet;
				}
		//Play game
				
				do {
					gamer = playCraps();
					
				if(gamer == Status.WIN) {
					bankBalance += wager;
					System.out.printf("New bank balance is is: %.2f%n%n", bankBalance);
				}
				else if(gamer == Status.LOSE){
					bankBalance -= wager;
					System.out.printf("New bank balance is is: %.2f%n%n", bankBalance);
				}

				if(bankBalance < 1) {
					System.out.println("Sorry. You busted!");
					bankBalance = 0;
					break;
				}
				System.out.println(displayChatter() + "\n");
				
				System.out.println("Enter 'r' to roll dice again or q to quit.");
				choose = input.next().charAt(0);
				}while(choose == 'r');
			
	}
	public static String displayChatter() {
		
		int type = 1 + random.nextInt(4);
		 String chatter = " ";
		String chatter1 = "Oh you're going for broke, huh?";
		String chatter2 = "Aw c'mon, take a chance!";
		String chatter3 = "You're up big";
		String chatter4 = "Now's the time to cash in your chips!";
		
		switch(type) {
		case 1: 
			chatter = chatter1;
			break;
			
		case 2: 
			chatter = chatter2;
			break;
		case 3: 
			chatter = chatter3; 
			break;
		case 4: 
			chatter = chatter4;
			
		}
		return chatter;
	}
}
