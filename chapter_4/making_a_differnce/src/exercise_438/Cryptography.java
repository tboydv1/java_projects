package exercise_438;

import java.util.Scanner;

public class Cryptography {

	public String encryptNumber(int digits)
	{	
		int order = 0;
		int place = 1;
		String store = "";
		int value1 =0, value2=0, value3 = 0, value4 =0;
		while (digits > 0) {
			
		int remainder = digits % 10;
		int newValue = (remainder + 7) % 10;
		order = newValue * place + order;
		
			if(place < 10)
				value4 = newValue;
			else if (place < 100)
				value3 = newValue;
			else if(place < 1000)
				value2 = newValue;
			else value1 = newValue;
			
		digits = digits / 10;
		
		place *= 10;
		}
		store = value3 + "" + value4 + "" + value1 + "" + value2;
		return store;
		
		
	}
	public static void main(String[] args)
	{
		Cryptography message = new Cryptography();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number to encrypt: ");
		int data = input.nextInt();
		
		System.out.printf("Encrypted value is %n%s",message.encryptNumber(data));
		input.close();
	}
}
