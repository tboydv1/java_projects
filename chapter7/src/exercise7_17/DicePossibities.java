package exercise7_17;

import java.util.Random;
public class DicePossibities {
	
	static int[][][] values = new int [7][7][13];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCombinations();
	}
	public static void tallyCombinations() {
		int die1, die2, diceSum;


		Random gen = new Random();
		
		for(int count = 1; count <= 36_000_000; count++) {
			die1 = 1 + gen.nextInt(6);
			die2 = 1 + gen.nextInt(6);
			diceSum = die1 + die2;
			
			++values[die1][die2][diceSum];
		}
	}
	public static void printCombinations() {
		tallyCombinations();
		System.out.printf("%s%n%n%3s%6s%6s%14s%n","36 possible combinations of a dice:","1st ", "2nd ", "Sum", "Occurence");
		for(int count = 1; count < 7; count++) {
			
			for(int place = 1; place < 7; place++) {
				
				for(int sum = count + place; sum < count + place + 1; sum++) {
					
					System.out.printf("%d%6d%9d%14s%n", count, place, sum, values[count][place][sum]);
					if(place % 6 == 0) {
						System.out.println();
					}

				}
			}
		}
	}

}
