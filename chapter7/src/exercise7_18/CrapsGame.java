package exercise7_18;


import java.util.Random;
/**
 * @author tboydev
	 * (Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
	answers the following questions:
	a) How many games are won on the first roll, second roll, …, twentieth roll and after the
	twentieth roll?
	b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
	twentieth roll?
	c) What are the chances of winning at craps? [Note: You should discover that craps is one
	of the fairest casino games. What do you suppose this means?]
	d) What is the average length of a game of craps?
	e) Do the chances of winning improve with the length of the game?
 *
 */
public class CrapsGame {

	static Random gen = new Random();
	
	private static enum Status{WON, LOST, CONTINUE};
	
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int TWO = 2; 
	private static final int SNAKE_EYES = 3;
	private static final int BOX_CARS = 12;
	
	static Status gameStatus;
	public static int playCraps() {
		
		int countRolls = 0;
		int diceSum, gamePoint = 0;
		int win_on_roll = 0, lose_on_roll = 0;
		 
		
		
		diceSum = rollDice();
		
		switch(diceSum) {
		
		case SEVEN: case YO_LEVEN:
			gameStatus = Status.WON;
			win_on_roll++;
			break;
			
		case TWO: case SNAKE_EYES: case BOX_CARS: 
			gameStatus = Status.LOST;
			lose_on_roll++;
			break;
			
			default: 
				gamePoint = diceSum;
				gameStatus = Status.CONTINUE;
				System.out.println("Point is: " + gamePoint);
				countRolls++;
		}
			while(gameStatus == Status.CONTINUE) {
				
				diceSum = rollDice();
				if(diceSum == SEVEN) {
					gameStatus = Status.LOST;
				}
				else if(diceSum == gamePoint) {
					gameStatus = Status.WON;
				}
				countRolls++;
			}
			if(gameStatus == Status.WON) {
				win_on_roll += countRolls;
				System.out.println("Player wins!\n");
				return win_on_roll;
			}
			else {
				lose_on_roll+= countRolls;
				System.out.println("Player loses\n");
				return lose_on_roll;
			}
			
	}
	
	public static int rollDice() {
		
		int die1, die2;
		
		die1 = 1 + gen.nextInt(6);
		die2 = 1 + gen.nextInt(6);
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, die1 + die2);
		return die1 + die2;
	}
	public static void runCraps() {
		int[] winFreq = new int[20];
		int[] loseFreq = new int[20];
		int wins = 0, loss = 0;
		int game;
		
		for(int i = 1; i < 5; i ++) {
			game = playCraps();
			
			
			try {
			
			if(gameStatus == Status.WON ) {
				++winFreq[game];
				
			}
			else {
			 ++loseFreq[game];
				
			}	
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				
			}
		}
		displayResult("Wins","Loss", winFreq, loseFreq);
		System.out.println();
//		displayResult("Loss", loseFreq);
		
		wins = sumArray(winFreq);
		loss = sumArray(loseFreq);
		
		double chance = (double)wins/(wins + loss);
		
		System.out.printf("%nElement of chance is: %.3f%n%n", chance);
		
		
	}
	public static void displayResult(String header, String header2, int[] array, int[] array2) {
		
		System.out.printf("%n%s%7s%8s%n", "Rolls", header, header2);
		for(int wins = 1; wins < array.length; wins++) {
			
			System.out.printf("%-2d%10s%8s%n", wins , array[wins], array2[wins]);
			
		
			}
		}

	public static int sumArray(int[] array) {
		int total = 0;
		
		for(int value: array) {
			total+= value;
		}
		return total;
	}
	public static void main(String[] args) {
		runCraps();
	}
	
	
	
}
