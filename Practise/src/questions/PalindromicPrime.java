package questions;

public class PalindromicPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindromic();
	}
	public static boolean isPrime(int n) {
		
		for(int i = 2; i <= n/2; i++) {
			
			if(n % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	public static void palindromic() {
		int mod, initial, num, reversed = 0;
		int count = 0;
		for(int i = 2; i <= 1000; i++) {
			reversed = 0;
			if(isPrime(i) == true) {
				
				num = i; initial = i;
				
				while(num > 0) {
					
					mod = num % 10;
					reversed = reversed * 10 + mod;
					num = num / 10;
				
				}
				if(initial == reversed) {
					System.out.printf("%5d",initial);
					count++;
					if(count % 10 == 0) {
						System.out.println("");
					}
				}
				
			}
		}
		
	}
 
}
