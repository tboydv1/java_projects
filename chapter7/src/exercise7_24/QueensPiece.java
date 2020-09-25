package exercise7_24;

public class QueensPiece {
	
	int row; 
	int col;
	int[][] board;
	
	public QueensPiece( int[][] board) {
		
		
		this.board = board;
	}
	
	public void setPosition(int row, int col) {
		
		this.row = row;
		this.col = col;
		
	}
	
	public void setQueen() {
		
		setHorizontal();
		setVertical();
		goUpLeft();
		goUpRight();
		goDownRight();
		goDownLeft();
		
//		for(int[] out: board) {
//			for(int in: out) {
//				if(in == 1)
//				System.out.print(" Q ");
//				else 
//					System.out.print(" * ");
//					
//			}
//			System.out.println();
//		}
	}
	
	public void setHorizontal() {
		
	int initialC = col, initialR = row;
	
		initialC = 0;
		for(int u = 0; u < board.length; u++) {
			
		if(initialR >= 0 && initialR < 8 && initialC >= 0 && initialC < 8) {
					
			board[initialR][initialC] = 1;
			initialC++;
				
			}	
		}
	}
	public void setVertical() {
		
		int initialC = col, initialR = row;
		
		initialR = 0;
		for(int u = 0; u < board.length; u++) {
			
		if(initialR >= 0 && initialR < 8 && initialC >= 0 && initialC < 8) {
					
			board[initialR][initialC] = 1;
			initialR++;
				
			}	
		}
		
	}
	public void goUpLeft() {
		

		int initialC = col, initialR = row;
		
		
		for(int u = 0; u < board.length; u++) {
			
		if(initialR >= 0 && initialR < 8 && initialC >= 0 && initialC < 8) {
					
			board[initialR][initialC] = 1;
			initialR--;
			initialC--;
				
			}	
		}
		
	}
	public void goUpRight() {
		
		int initialC = col, initialR = row;
		
		
		for(int u = 0; u < board.length; u++) {
			
			if(initialR >= 0 && initialR < 8 && initialC >= 0 && initialC < 8) {
						
				board[initialR][initialC] = 1;
				initialR--;
				initialC++;
				
			}	
		}
	
	}
	public void goDownRight() {
	int initialC = col, initialR = row;
	
	
	for(int u = 0; u < board.length; u++) {
		
		if(initialR >= 0 && initialR < 8 && initialC >= 0 && initialC < 8) {
					
			board[initialR][initialC] = 1;
			initialR++;
			initialC++;
			
			}	
		}
	}
	public void goDownLeft() {
		int initialC = col, initialR = row;
		
		
		for(int u = 0; u < board.length; u++) {
			
			if(initialR >= 0 && initialR < 8 && initialC >= 0 && initialC < 8) {
						
				board[initialR][initialC] = 1;
				initialR++;
				initialC--;
				
				}	
			}
		}
	
}
