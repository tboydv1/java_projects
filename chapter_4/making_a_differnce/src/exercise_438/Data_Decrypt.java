package exercise_438;

import java.util.Scanner;

public class Data_Decrypt {

	public String decryptdigits(int digits)
	{
		int remainder;
		int order = 0;
		int placeValue = 1;
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		String data = "";
		
		while(digits > 0)
		{
			remainder = digits % 10;
			order = (remainder + 10) - 7;
			digits /= 10;
			
			if (order >= 10)
			{
				order -= 10;
			}
			
			if(placeValue < 10)
			{
				num4 = order;
			}
			else if(placeValue < 100)
			{
				num3 = order;
			}
			else if(placeValue < 1000)
			{	
				num2 = order;
			}
			else
				num1 = order;
			
			placeValue *= 10;
		}
		data = num3 + "" + num4 + "" + num1 + "" + num2;
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data_Decrypt unpack = new Data_Decrypt();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter digits to decrypt: ");
		int digit = input.nextInt();
		
		System.out.printf("original data is: %n%s",unpack.decryptdigits(digit));
	}

}
