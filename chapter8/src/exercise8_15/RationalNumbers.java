/**
 * 
 */
package exercise8_15;

/**
 * @author tboydev
 * 
 */
public class RationalNumbers {

	private int numerator;
	private int denominator;
	
	public RationalNumbers(int a, int b) {
		
		
		
		try {
		int gcd = findGCD(a, b);
		numerator = a / gcd;
		denominator = b / gcd;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithment exception error: "+e.getMessage());
		}
		
		
	}
	
	
	public RationalNumbers() {
		this(8, 8);
	}
	
	public int getNumerator() {
		return numerator;
	}

	
	public int getDenominator() {
		return denominator;
	}

	
	public static RationalNumbers addFractions(RationalNumbers object1, RationalNumbers object2) {
		
		int deno = object1.getDenominator();
		int deno1 = object2.getDenominator();
		
		int num = object1.getNumerator();
		int num1 = object2.getNumerator();
		
		int lcm = findLCM(deno, deno1);
		
		deno /= lcm; deno1 /= lcm;
		
		num *= deno; num1 *= deno1;
		
		num = num + num1;
		
		
		return new RationalNumbers(num, lcm);
		
	}
	
	public static RationalNumbers subFractions(RationalNumbers object1, RationalNumbers object2) {
		
		int deno = object1.getDenominator();
		int deno1 = object2.getDenominator();
		
		int num = object1.getNumerator();
		int num1 = object2.getNumerator();
		
		int lcm = findLCM(deno, deno1);
		
		deno = lcm / deno;
		deno1 = lcm / deno1;
		num = deno * num;
		num1 = deno1 * num1;
		num = num - num1;
		
		
		return new RationalNumbers(num, lcm);
	}
	
	public static RationalNumbers divide(RationalNumbers object1, RationalNumbers object2) {
		
		int deno = object1.getDenominator();
		int deno1 = object2.getDenominator();
		
		int num = object1.getNumerator();
		int num1 = object2.getNumerator();
		
		//swap object 2 numerator and denominator
		int temp = num1;
		num1 = deno1;
		deno1 = temp;
		
		int tempNum = num * num1;
		int tempDeno = deno * deno1;
		
		
		return new RationalNumbers(tempNum, tempDeno);
		
		
	}
	
	public static RationalNumbers  multiply(RationalNumbers object1, RationalNumbers object2) {
		

		int deno = object1.getDenominator();
		int deno1 = object2.getDenominator();
		
		int num = object1.getNumerator();
		int num1 = object2.getNumerator();
		
		num = num * num1;
		deno = deno * deno1;
		
		
		return new RationalNumbers(num, deno);
		
	}
	
	
	
	private static int findLCM(int num1, int num2) {
		int divUp, divDown;
		
		int gcd = findGCD(num1, num2);
		
		divUp = num1/gcd;
		divDown = num2 / gcd;
		
		int lcm = gcd * divUp * divDown;
		
		

		return lcm;
		
	}
	
	private static int findGCD(int num1, int num2) {
		
		int a, b;
		int remainder = 0; // stores remainder of division

		if(num1 > num2) {
			a = num1 ;
			b = num2;
		}
		else {
		  a = num2;
		  b = num1;
		}
				
		remainder = modulo(a, b);
				
		while (remainder > 0) {
			
			a = b;
				
			b = remainder;
				
			remainder = modulo(a, b);
			if(remainder < 0) {
				b = remainder * -1;
				break;
			}
		}
		
		return b;
	}
	
	private static int modulo(int a, int b) {
		int modulus = a % b;
		
		return modulus;
	}
	
	public String toString() {
		
		
		return String.format("%d / %d", numerator, denominator);
		
	}
	
}
