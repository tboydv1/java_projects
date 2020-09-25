package exercise7_23;

import exercise7_22.KnightPiece;
import java.util.Random;

public class ChessKnight {

	KnightPiece k = new KnightPiece();
	
	int[][] chess = new int[8][8];
	
	Random move = new Random();
	
	
	static int moveNum;
	
	//part a
	public void tourKnight() {
		int valid;
		int currentCol = 0, currentRow = 0;
		int count;
		for(count = 1; count <= 64; count++) {
			
			int initialR = currentRow, initialC = currentCol;
				
			valid = validateMove(currentRow, currentCol); 
		
			 currentRow += k.getVerticalMove(valid);
			 currentCol += k.getHorizontalMove(valid);		 
				
				if(chess[currentRow][currentCol] == 1) {
					currentRow = initialR;
					currentCol = initialC;
					
				}
				else
				 ++chess[currentRow][currentCol]; 
			
		}
		displayBoard();
		
	}
	//check valid L shaped moves
	public int validateMove(int row, int col) {
		
		int count = 1;
		int initialR = row, initialC = col;
		boolean check = false;
	
//		
		while(check == false) {
			
			moveNum =  move.nextInt(8);
			
			row += k.getVerticalMove(moveNum);
			col += k.getHorizontalMove(moveNum);
			

			
			if(row >= 0 && row < 8 && col >= 0 && col < 8) {	
				
					check = true;
				
			}
			row = initialR;
			col = initialC;
			count++;

	}	

		return moveNum;
			
}
				
	public void displayBoard() {
		
		for(int row = 0; row < chess.length; row++) {
			for(int col = 0; col < chess[row].length; col++) {
				
				System.out.print(chess[row][col]);
			}
			System.out.println();
		}
	}
	
	//part b
	public void runFullTours() {
		
		int currentCol = 0, currentRow = 0;
		int length[] = new int[1000];
		int count;
		
	for(int full = 0; full < 1000; full++) {
		currentCol = 0; currentRow = 0;
		
		for(count = 1; count <= 64; count++) {
			
				
			int valid = validateMove(currentRow, currentCol); 
		
			 currentRow += k.getVerticalMove(valid);
			 currentCol += k.getHorizontalMove(valid);		 
				
				if(chess[currentRow][currentCol] == 1) {
					break;
					
				}
				else
				 ++chess[currentRow][currentCol];
			
		}
		length[full] = count;
		reset();
		
	}
	displayTable(length);
	highest(length);
}	
	public void displayTable(int[] array){
		System.out.printf("%s%10s%n", "Tour-no","Length");
		for(int i = 0 ; i < array.length; i++) {
			
			System.out.printf("%4d%13d%n", i + 1, array[i]);
		}
		
	}
	public void reset() {
		for(int row = 0; row < chess.length; row++) {
			
			for(int col = 0; col < chess.length; col++) {
				chess[row][col] = 0;
			}
		}
	}
	public void highest(int [] array) {
		
		int highest  = array[0];
		int tour = 0;
		for(int count = 0; count < array.length; count++) {
			 
			if(array[count] > highest) {
				highest = array[count];
				tour = count;
			}
		}
		System.out.printf("%nLongest tour is: %d%non tour %d%n", highest, tour + 1);
	}
	
	public static void main(String args[]) {
		
		ChessKnight L = new ChessKnight();
		
//		L.tourKnight();
//		L.validateMove(0,0);
		L.runFullTours();
		
		
	}
}
