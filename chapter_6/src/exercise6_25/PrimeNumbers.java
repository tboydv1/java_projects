package exercise6_25;

public class PrimeNumbers {
	
	public static boolean findPrime(int number ) {
		
		int prime = 0, div = 1;
		boolean result = false;
		 
			div = number  / 2;

			for(int f = 2; f <= div; f++) {
				 if(number % f == 0) {
					 return false;
					
				 }
			}
				return true;
			
			
		}	
					

	public static void primeRoot() {
		int range = 100;double root;
		int prime = 0;
		
		for(int t = 1; t <= range; t++) {
			
				root = Math.sqrt(t);
			
			for(int r = 2; r <= root; r++) {

					prime = t % r;
					
				if(prime == 0) 
					break;	
			}
			
			if(t == 2) {
				prime = 2;
			}
			if(t == 3) {
				prime = 3;
			}
			
			
			if (prime != 0)
				System.out.print(t + " ");
	}// end of loop 
}
	public static boolean primer(int num) {
			if(num < 2)
				return false;
		for(int count = 2; count <= num/2; count++) {
			if(num % count == 0)
				return false;
		}				
			return true;
	}
		


	public static void main(String[] args) {
//		String store = " ";
		for(int i = 1; i <= 1000; i++) {
			
			if(findPrime(i) == true) 
				System.out.print(i + " ");
			if( i % 10 == 0) {
				System.out.println();
			}
		}
			
		

	}
	
	
}
