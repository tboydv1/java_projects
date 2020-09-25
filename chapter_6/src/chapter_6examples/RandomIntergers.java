package chapter_6examples;

import java.security.SecureRandom;

public class RandomIntergers {
	
	public static void main(String[] args) {
		
		//randomNumbers object will produce random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		int face;
		//loop 20 times 
		for(int counter = 1; counter <= 20; counter++) {
			
			//pick random numbers 
			face = 3 + randomNumbers.nextInt(6);
			
			//display generated value 
			System.out.printf("%d ", face);
			
			if(counter % 5 == 0) {
				System.out.println();
			}
		}
		
	}

}
