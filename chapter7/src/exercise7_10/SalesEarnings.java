package exercise7_10;

import java.security.SecureRandom;

public class SalesEarnings {
	static SecureRandom random = new SecureRandom();
	
	public static void fillArray(double[] array) {
		//fill array elements with random values
		double randomValues, totalEarnings;
		for(int count = 0; count < array.length; count++) {
			randomValues = 500 + random.nextInt(10_000);
			totalEarnings = randomValues * 0.09 + 200;
			array[count] = totalEarnings;
		}
	}

	public static void displayEarning() {
		
		
		double[] earnings = new double [100];
		int[] frequency = new int[11];
		int amount; 
		
		
		fillArray(earnings);
		
		//increment frequency for each earnings
		for(double value: earnings) {
			
			if((int)value/100 >=10) 
				++frequency[10];
			else
				++frequency[(int)value/100];
		}
		//display earning
		System.out.printf("%s%21s%n%n","Salaries", "Salespeople");
		for(int count = 2; count < frequency.length; count ++) {
				if(count == 10) {
					System.out.printf("$%s  ","1000 and over");
					System.out.printf("%13d%n", frequency[count]);
				}
				else {
					System.out.printf("$%3d-%3d",count * 100, count * 100 + 99);	
					System.out.printf("%21d%n", frequency[count]);
				}
		
	}
}
	public static void main(String[] args) {
		displayEarning();
	}
}
