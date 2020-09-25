package exercise5_13;

public class N_factorial {

	public static void main(String[] args) {
		
		long fact = 1;
		for(int n = 1; n <= 20; n++ )
		{
			fact *= n;
			System.out.printf("%d! - %d%n", n, fact);
		}


	}

}
