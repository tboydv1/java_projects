package examples;

public class StringMiscellaneous2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = "   space   ";
		
		System.out.printf("s1 = \"%s\"%ns2 = \"%s\"%ns3 = \"%s\"%n%n", s1, s2, s3);
		
		//method replace
		System.out.printf("Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));
		
		System.out.printf("Convert s1 using toUpperCase() = %s%n", s1.toUpperCase());
		System.out.printf("Convert s1 using toLowerCase() = %s%n", s1.toLowerCase());
		
		System.out.printf("s3 after trim = \"%s\"%n%n", s3.trim());
		
		
		char[] charArray = s1.toCharArray();
		
		System.out.printf("s1 as a character array = ");
		
		for(char character: charArray)
			System.out.print(character);
		
		System.out.println();
		
		
		
	}

}
