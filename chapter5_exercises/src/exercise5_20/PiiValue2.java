package exercise5_20;

public class PiiValue2 {

	public void calculatePii() {
		double pii = 4;
		
		for(int d = 1; d <= 20; d++) {
			
			pii = pii + Math.pow(-1, d) * 4 / ((d * 2) + 1);
			System.out.printf("%d\t%f%n",d, pii);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PiiValue2 negate = new PiiValue2();
		
		negate.calculatePii();
	}

}
