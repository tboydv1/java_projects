package exercise7_29;

public class Fibonacci {

	
	public int findFibonachi(int nth) {
		
		int [] fib = new int[nth];
		int value;
		
		fib[0] = 0; fib[1] = 1;
		
		
		for(int term = 2; term < fib.length; term++) {
			
			value = fib[term - 2] + fib[term - 1];
			fib[term] = value;
		
		}
		for(int n: fib) {
			System.out.println(n);
		}
		return fib[nth - 1];
		
}
	
}
