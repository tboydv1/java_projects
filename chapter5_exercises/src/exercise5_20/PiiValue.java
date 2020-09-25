package exercise5_20;

public class PiiValue {


	public double returnPii()
	{
		double pii = 0;
		
		for(double b = 1; b <= 20; b++) {
			if(b == 1)
				pii = pii + 4; 
			else if(b % 2 == 0)
				pii = pii - 4 / (b + (b -1));
			else 
				pii = pii + 4 /( b + (b -1));
			

			System.out.printf("%.1fterm%20.5f%n", b, pii);
		}
		return pii;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PiiValue nth = new PiiValue();
		
		 nth.returnPii();
	}

}
