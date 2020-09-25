package exercise7_8;

public class ArrayC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] c = new float[100];
		float total = 0;
		
		for(int counter = 0; counter < c.length; counter++) {
			c[counter] = (float)1.1 * counter;
			System.out.printf("%02d%10.1f%n", counter, c[counter]);
			total += c[counter];
		}
		System.out.println("\nTotal of 100 elements is: " + total);
		
	}

}
