package chapter4.exercise438;

public class Cryptography {
	
	public String encryptNumber(int digit)
	{
		
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		int value4 = 0;

		
		
		while(digit > 0)
		{
			int remainder = (digit % 10);
			value4 = (remainder + 7) % 10;
			digit = digit / 10;
			
			while(digit > 100)
			{
					remainder = (digit % 10);
					value3 = (remainder + 7) % 10;
					digit = digit / 10;
//					counter++;
			}
					while(digit > 10) {
						remainder = (digit % 10) + 7;
						value2 = remainder % 10;
						digit = digit / 10;
//						counter2++;
					}
						while(digit > 1)
						{
							remainder = (digit % 10) + 7;
							value1 = remainder % 10;
							digit = digit / 10;
//							counter3++;
						}
						
//				 = value3 +""+ value4+""+value1+""+value2;
		}
		return value3 + "" + value4 + "" + value1 +""+ value2; 
				
	}
	
		
		public static void main(String[] args)
		{
			
			Cryptography hash = new Cryptography();
			
			System.out.printf("%s ", hash.encryptNumber(1234));
		}
	

}
