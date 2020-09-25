package chapter_6examples;

import java.security.SecureRandom;

public class Craps {
	
	public static final SecureRandom randomValues = new SecureRandom(); //secure random numbers generator
	
	private enum Status	{CONTINUE, WON, LOST};// enum type constants that represents game status
	
	//Constants that represent common rolls of dice
	private static final int SNAKE_EYES = 2;
	private static final int TRAY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myPoint = 0; //point if no wins or losses on first roll
		Status gameStatus; // can contain CONTINUE, WON OR LOST
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {
			case SEVEN:  //win with the first seven roll
			case YO_LEVEN: //win with the first eleven roll
			gameStatus = Status.WON; 
			break; 
			
			case TRAY: //loose with 3 on the first roll 
			case SNAKE_EYES: // loose with 2 on the first roll
			case BOX_CARS: // loose with 12 on first roll
			gameStatus = Status.LOST; 
			
			default: //did not win or loose so remember point
				gameStatus = Status.CONTINUE; //game is not lose
				myPoint = sumOfDice; // remember the point
				System.out.printf("Point is: %d%n", myPoint);
				break;
		}
		
		while(gameStatus == Status.CONTINUE) { //game not WON or LOST 
			
			sumOfDice = rollDice(); // roll dice again
			 
			if(sumOfDice == myPoint) { //win game by making point
				gameStatus = Status.WON;
			}
			else if
				(sumOfDice == SEVEN){ // loose by making seven points before making point
				gameStatus = Status.LOST;
			}
		}
			//display the won or lost message
			if(gameStatus == Status.WON) {
				System.out.println("Player Wins!");
			}
			else 
				System.out.println("Player Loses");
	}
		//roll dice, calculate sum and display result
		public static int rollDice() {
			
			//pick random die values
			int die1 = 1 + randomValues.nextInt(6); // first die roll
			int die2 = 1 + randomValues.nextInt(6); //second die roll
			
			int sum = die1 + die2; //sum die rolls
			
			//display sum of die roll
			System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
			
			return sum;
			
		}
}
