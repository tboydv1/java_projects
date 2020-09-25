package exercise7_11;

import java.util.Arrays;

public class Array_bestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] bestScore = new int [5];
		
		System.out.printf("%s: ","Best scores");
		for(int count = 0; count < bestScore.length; count++) {
			bestScore[count] = count + 5;
			System.out.printf("%d   ", bestScore[count]);
		}
	}

}
