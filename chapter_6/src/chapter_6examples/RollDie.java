package chapter_6examples;

import java.security.SecureRandom;

public class RollDie {
	
	public void rollDieValues() {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequency1 = 0; //count number of 1s rolled
		int frequency2 = 0; // count number of 2s rolled 
		int frequency3 = 0; //
		int frequency4 = 0; 
		int frequency5 = 0; 
		int frequency6 = 0;
		int face;
		// tally counts for 6000 die rolls 
		for(int roll = 1; roll <= 60_000_000; roll++) {
			
			face = 1 + randomNumbers.nextInt(6);
			
			//use face value to determine increment
			switch(face) {
			
			case 1: 
				++frequency1;
				break;
			case 2: 
				++frequency2;
				break;
			case 3: 
				++frequency3;
				break;
			case 4: 
				++frequency4;
				break;
			case 5: 
				++frequency5;
				break;
			case 6: 
				++frequency6;
				break;
			}
			
		}
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%,d%n2\t%,d%n3\t%,d%n4\t%,d%n5\t%,d%n6\t%,d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RollDie game = new RollDie();
		
		game.rollDieValues();
	}

}
