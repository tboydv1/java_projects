package exercise6_13;

import java.security.SecureRandom;

public class RandomSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomDigits = new SecureRandom();
		
		
			int even = 2 + 2 * randomDigits.nextInt(5);
			System.out.println(" " + even);
			
			int odd = 3 + 2 * randomDigits.nextInt(5);
			System.out.println(" " + odd);
			
			int quad = 6 + 4 * randomDigits.nextInt(5);
			System.out.println(" " + quad);
		
	}

}
