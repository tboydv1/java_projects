package chapter4.exercise430;

public class Palindrome {
	private int number;
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public boolean reverseNumber()
	{
		int reversedInt = 0;
		int initialNum = number;
		int remainder;
		
		while(number > 0)
		{
			remainder = number % 10;
			reversedInt = reversedInt * 10 + remainder;
			number = number / 10;
			
		}
		if (reversedInt == initialNum)
			return true;
		
			else
				return false;
		
	}
}
