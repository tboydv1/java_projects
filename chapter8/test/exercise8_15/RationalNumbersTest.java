package exercise8_15;

public class RationalNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RationalNumbers obj1 = new RationalNumbers(7, 5);
		
		RationalNumbers obj2 = new RationalNumbers(12,6);
		
		System.out.println(RationalNumbers.subFractions(obj1, obj2) + "\n");
		
		System.out.println(RationalNumbers.multiply(obj1, obj2) + "\n");
		
		System.out.println(RationalNumbers.addFractions(obj1, obj2) + "\n");
		
		System.out.println(RationalNumbers.divide(obj1, obj2) + "\n");
		
		
		
	}

}
