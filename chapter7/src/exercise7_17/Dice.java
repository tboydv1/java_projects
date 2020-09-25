package exercise7_17;

import java.util.Random;
public class Dice {

	static private int die1;
	static private int die2;
	
	static Random gamer = new Random();
	static int[] possibility = new int [13];
	//tally result
	public static void tally() {
		
		for(int count = 1; count <= 36_000_000; count++) {
			++possibility[rollDice()];
		}
	}
	//Roll dice and return sum;
	public static int rollDice() {
		int diceSum;
		die1 = 1 + gamer.nextInt(6);
		die2 = 1 + gamer.nextInt(6);
		
		diceSum = die1 + die2;
		return diceSum;
	}
	//display result
	public static void displayResult() {
		
		tally();
		System.out.printf("%s%12s%n","DiceSum", "Occurence");
		for(int count = 2; count < possibility.length; count++) {
			System.out.printf("%-7d%12s%n", count, possibility[count]);
		}
	}
}
