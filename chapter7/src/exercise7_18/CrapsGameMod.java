package exercise7_18;

import java.util.Random;


/**
 * @author tboydev
 *
 */
public class CrapsGameMod {

	static Random roll = new Random();
	
	private static enum Status{WON, LOST, CONTINUE};
	
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int TWO = 2; 
	private static final int SNAKE_EYES = 3;
	private static final int BOX_CARS = 12;
	
	static Status gameStatus;
	static int[][] winOutComes = new int [21][13];
	static int[][] lossOutComes = new int [21][13];

	public static void playCraps() {
		
		int countRolls = 0, myPoint = 0, sumOfDice;
		
		sumOfDice = rollDice();
		
		switch(sumOfDice) {
		
		case SEVEN: case YO_LEVEN:
			gameStatus = Status.WON;
			countRolls++;
			break;
			
		case TWO: case SNAKE_EYES: case BOX_CARS: 
			gameStatus = Status.LOST;
			countRolls++;
			break;
			
			default: 
				myPoint = sumOfDice;
				gameStatus = Status.CONTINUE;
				System.out.println("Point is: " + myPoint);
				countRolls++;
		}
		while(gameStatus == Status.CONTINUE) {
			
			sumOfDice = rollDice();
			if(sumOfDice  == SEVEN) {
				gameStatus = Status.LOST;
			}
			else if(sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}
			countRolls++;
		}
		try {
		if(gameStatus == Status.WON) {		
			System.out.println("Player wins!");
			++winOutComes[countRolls][sumOfDice];
		}
		else {
			++lossOutComes[countRolls][sumOfDice];
			System.out.println("Player loses");
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	public static int rollDice() {
		
		int die1 = 1 + roll.nextInt(6);
		int die2 = 1 + roll.nextInt(6);
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, die1 + die2);
		return die1 + die2;
		
	}
	public static void displayOutComes(int[][] outComes, String description) {
		System.out.printf("%s%12s%8s%n", "Rolls",  "OutComes", description);
		for(int count = 0; count < outComes.length; count++) {
			
			for(int wins = 0; wins < outComes[count].length; wins++) {
				if(outComes[count][wins] != 0 ) {
				System.out.printf("%5d%10d%10d%n", count, wins, outComes[count][wins] );
				}
			}
			

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int counter = 0; counter <= 5; counter++) {
		playCraps();
		System.out.println();
			
	}
	System.out.println();
	displayOutComes(winOutComes, "Wins");
	System.out.println();
	displayOutComes(lossOutComes, "losses");
	
	
	
	
		
		
		
	}

}
