package exercise6_35;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Scanner;
public class ComputerAssistedInstruction {
 
	 static SecureRandom numbers = new SecureRandom();
	 static Scanner input = new Scanner(System.in);
	
	private static int level = 1;
	
	public static int generateMultiplication() {
		int digit1 = 0;
		int digit2 = 0;
		
		if(level == 1) {
		 digit1 = 1 + numbers.nextInt(9);
		 digit2 = 1 + numbers.nextInt(9);
		}
		else if(level == 2) {
			digit1 = 1 + numbers.nextInt(90);
			digit2 = 1 + numbers.nextInt(90);
		}
		else if(level == 3) {
			digit1 = 1 + numbers.nextInt(900);
			digit2 = 1 + numbers.nextInt(900);
		}
		
		System.out.printf("How much is %d times %d ?%n", digit1, digit2);
		int product = digit1 * digit2;
		
		return product;

	}
	public static int generateAddition() {
		int digit1 = 0;
		int digit2 = 0;
		
		if(level == 1) {
		 digit1 = 1 + numbers.nextInt(9);
		 digit2 = 1 + numbers.nextInt(9);
		}
		else if(level == 2) {
			digit1 = 1 + numbers.nextInt(90);
			digit2 = 1 + numbers.nextInt(90);
		}
		else if(level == 3) {
			digit1 = 1 + numbers.nextInt(900);
			digit2 = 1 + numbers.nextInt(900);
		}
		
		System.out.printf("How much is %d plus %d ?%n", digit1, digit2);
		int sum = digit1 + digit2;
		
		return sum;

	}
	public static int generateSubtraction() {
		int digit1 = 0;
		int digit2 = 0;
	
		
		if(level == 1) {
		 digit1 = 1 + numbers.nextInt(9);
		 digit2 = 1 + numbers.nextInt(9);
		}
		else if(level == 2) {
			digit1 = 1 + numbers.nextInt(90);
			digit2 = 1 + numbers.nextInt(90);
		}
		else if(level == 3) {
			digit1 = 1 + numbers.nextInt(900);
			digit2 = 1 + numbers.nextInt(900);
		}
		
			System.out.printf("How much is %d minus %d ?%n", digit1, digit2);
			int sub = digit1 - digit2;
		
		return sub;

	}
	public static double generateDivision() {
		int digit1 = 0;
		int digit2 = 0;
		double quotient = 0;
		if(level == 1) {
		 digit1 = 2 +  numbers.nextInt(10);
		 digit2 = 2 +  numbers.nextInt(10);
		}
		else if(level == 2) {
			digit1 = 1 +   numbers.nextInt(90);
			digit2 = 1 +  numbers.nextInt(90);
		}
		else if(level == 3) {
			digit1 = 1 +  numbers.nextInt(900);
			digit2 = 1 +  numbers.nextInt(900);
		}
		
		if(digit1 > digit2) {
		System.out.printf("What is the quotient of %d divided by %d ?%n", digit1, digit2);
		 quotient =(double) digit1 / digit2;
		}
		else if(digit2 > digit1) {
			System.out.printf("What is the quotient of %d divided by %d ?%n", digit2, digit1);
			 quotient = (double) digit2 / digit1;
		}
		
		return quotient;

	}
	public static double generaterandom() {
		
		int operation = 1 + numbers.nextInt(4);
		
		double arithmetic = 0;
		switch(operation) {
		case 1: 
			return generateMultiplication();
			
		case 2: 
			return generateAddition();
			
		case 3:
			return generateSubtraction();
			
		case 4: 
			return generateDivision();
			
			default:
				return arithmetic;
		
		}
		
		
		

	}
	public static double generateQuestion(int arithmeticType) {
		int  question =0;
		switch(arithmeticType) {
		case  1:
			return generateMultiplication();
		
			
		case 2: 
			return generateAddition();
			
			
		case 3:
			return generateSubtraction();
			
			
		case 4: 
			return generateDivision();
			
			
		case 5: 
			return generaterandom();
			
			default:
				return question;
		}
		
	}
	public static void assessStudent() {
		
		int correct = 0;
		int counter = 1;
		double answer;
		double guess;
		int type;
		int tries = 0;
		
		System.out.printf("%s%n%s%n","Computer Assisted Instruction","Enter 'b' to begin study and q to quit");
		char begin = input.next().charAt(0);
		
		while(begin != 'q') {
		System.out.printf("%s%n%s%20s%20s%20s%15s%n", "Choose Arithmetic Problem to Study",
				"Multiplication -1", "Addition -2", "Subtration -3","Division -4", "Random -5" );
				type = input.nextInt();
			
		System.out.printf("%s%n%s%15s%15s%n", "Select difficulty level",
							"1- Easy","2- Medium","3- Hard");
				level = input.nextInt();
		
			while(counter <= 10) {
				answer = generateQuestion(type);
				
				guess = input.nextDouble();
				
				if(guess == answer) {
					System.out.println(generateCredits());
					correct++;
				}
				else {
					System.out.println(generateRemarks());
					guess = input.nextDouble();
					while(guess != answer) {
						System.out.println(generateRemarks());
						guess = input.nextDouble();
						}
					
					if(guess == answer) {
						System.out.println(generateCredits());
					}
				}
				
					counter++;
					
				}
				
		if(counter >= 10) {
			checkPercentage(correct);
			correct = 0;
			counter = 1;
		}
		System.out.println("Enter b to continue study or q to quit: ");
		begin = input.next().charAt(0);
		
	}
	
}
	public static String generateCredits() {
		int select = 1 + numbers.nextInt(4);
		
		String response = " ";
		String response1 = "Very good!";
		String response2 = "Excellent";
		String response3 = "Nice work!";
		String response4 = "Keep up the good work!";
		
		switch(select) {
		case 1: 
			response = response1;
			break;
			
		case 2: 
			response = response2;
			break;
			
		case 3: 
			response = response3;
			break;
			
		case 4: 
			response = response4;
			
		}
		return response;
		
	}
	public static String generateRemarks() {
		int select = 1 + numbers.nextInt(4);
		
		String remark = " ";
		String remark1 = "No. Please try again";
		String remark2 = "Wrong. Try once more";
		String remark3 = "Don't give up!";
		String remark4 = "No. Keep trying.";
		
		switch(select) {
		case 1: 
			remark = remark1;
			break;
			
		case 2: 
			remark = remark2;
			break;
			
		case 3: 
			remark = remark3;
			break;
			
		case 4: 
			remark = remark4;
			
		}
		return remark;
		
	}
	public static void checkPercentage(int correctTries) {
		double percent = (double)correctTries / 10;
			
			if(percent > 0.75) {
				System.out.println("\nCongratulations, you are ready to go the next level!");
			}
			else if(percent < 0.75) {
				System.out.println("\nPlease ask your teacher for extra help");

			}
	}
}
