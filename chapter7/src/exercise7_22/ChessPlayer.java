package exercise7_22;

import java.util.Scanner;

public class ChessPlayer {
	ChessBoard k = new ChessBoard();
	
	public void moveKnight() {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		System.out.println("Move Knight around chess board\nEnter moves 0-7");
		
		while(counter <= 64) {
			
			int moveNumber = input.nextInt();
			
			k.setPieceMove(moveNumber);
			
			++counter;
		}
		k.displayVisitiedSquares();
		input.close();
	}
	
	
}
