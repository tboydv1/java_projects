package chapter_6examples;

public class MultiplicationTable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%3s%17s%17s%17s%15s%13s%15s%15s%16s%14s%17s%n", "1 times", "2 times", "3 times","4 times", "5 times", "6 times",
				"7 times", "8 times", "9 times", "10 times","11 times");
		
		for(int i = 1; i <= 12; i++) {
			for(int d = 1; d <= 12; d++) {
				System.out.printf("%d * %d = %d\t", d, i, d * i);
			}
			System.out.println();
		}
	}

}
