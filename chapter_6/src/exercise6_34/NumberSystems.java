package exercise6_34;

public class NumberSystems {

	private static final String A = "10";
	private static final String B = "11";
	private static final String C = "12";
	private static final String D = "13";
	private static final String E = "14";
	private static final String F = "15";
	
	
	public static String convertBinary(int decimal) {
		
		int modulus;
		String bin = "";
		
		while (decimal > 0) {
			
			modulus = decimal % 2;
			
			bin = modulus + "" + bin;
			
			decimal = decimal / 2;
		}
		
		return bin;
	}
	
	public static String convertToOctal(int dec) {
		int modulus; 
		String octal = "";
		
	
		while(dec > 0) {
			
			modulus = dec % 8;
			
			octal = modulus + "" + octal;
			
			dec = dec / 8;
		}
		
		return octal;
		
		
	           
	}
	private static String convertToHexadecimal(int dec) {
		String hexa = "";
		String mod;
		
		
		while(dec > 0) {
			
		
			
			mod = "" + dec % 16;
			switch(mod) {
			case A:
				mod = "A";
				break;
				
			case B: 
				mod	 = "B";
				break;
				
			case C: 
				mod = "C";
				break;
				
			case D: 
				mod = "D";
				break;
				
			case E: 
				mod = "E";
				break;
				
			case F:
				mod = "F";
				break;
			}
			
			hexa = mod +""+ hexa;
			
			dec = dec / 16;
			
			
		}
		return hexa;
		
	}
	public static void displayNumberSys() {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s%n","Decimal", "Binary", "Octal", "Hexadecimal");
		System.out.printf("%s\t%s\t%s\t%s%n%n","(Base 10)", "(Base 2)", "(Base 8)", "(Base 16)");
		for(int i = 1; i <= 256; i ++) {
			
			System.out.printf("%d\t\t%-7s%11s\t\t%s%n",i, convertBinary(i), convertToOctal(i), convertToHexadecimal(i));
			if(i % 10 == 0) {
				for(int r = 1; r <= 35; r++) {
					System.out.print("__");
				}
				System.out.println();
			}
		}
		
	
	}
	
	

}
