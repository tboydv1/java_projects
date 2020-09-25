package exercise7_8;
import java.security.SecureRandom;
public class ArrayW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		double[] w = new double[99];
		for(int count = 0; count < w.length; count++) {
			w[count] = 1 + random.nextInt(90); 
		}
		double highest = w[0];
		double lowest = w[0];
		
		for(double value : w) {
			if(value > highest) {
				highest = value;
			}
			if(value < lowest) {
				lowest = value;
			}
		}
		System.out.printf("Highest is: %5.1f%nLowest is: %5.1f",highest, lowest );
	}

}
