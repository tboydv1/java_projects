
import java.util.Random;
/*
 * Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Method parse should receive a String, extract each digit using method charAt and place the integer
equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
holds between the two HugeInteger objects and returns false if the relationship does not hold. Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
format specifier %b.]
 * 
 */

public class HugeInteger {

	
	private int[] intArray;
	
	public HugeInteger() {
		
		intArray = new int[40];
	}

	public int[] getIntArray() {
		return intArray;
	}
	
	
	
	/*
	 * Method parse should receive a String, extract each digit 
	 * using method charAt and place the integer
		equivalent of each digit into the integer array
	 */
	
	public void parse(String values) {
		
		if(values.matches("\\d+") == false) {
			throw new IllegalArgumentException("Argument must be integers");
		}
		
		int stringLength = values.length(); //get the length of the string
		
		for(int i = 0; i < stringLength; i++) {
			
			getIntArray()[i] = Integer.parseInt(Character.toString(values.charAt(i)));
			
		}
	}
	
	@Override
	public String toString() {
		
		String elements = "";
		
		for(int i = 0; i < getIntArray().length; i++) {
			
			elements.concat(String.valueOf(getIntArray()[i]));
		}
		
		return elements;
	}
	
	
	public HugeInteger add(HugeInteger obj) {
		
		
		return obj;
		
		
		
	}
	
	

	
	
	
	
	
	
	
}
