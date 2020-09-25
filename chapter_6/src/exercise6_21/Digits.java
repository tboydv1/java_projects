package exercise6_21;
//Program display numbers separated by spaces


public class Digits {

	public static int findQuotient(int a, int b) {
		int quotient = a / b;
		
		return quotient;
	}
	public static int remainder(int a, int b) {
		int remainder = a % b;
		
		return remainder;
	}
	public static String displayDigits(int digits) {
		String space = "  "; 
		int unit;
		
		if(digits >= 1 && digits < 100_000) {
			
			while(digits > 0) {
				
				unit = remainder(digits, 10);
				space = unit + "  " + space;
				
				digits = findQuotient(digits, 10);
			}
			 return space;		
		}
		else 
			return space;
	}
	

}
