package exercise7_22;

public class KnightTour {
	
	 private int[][] accessibility = {{2,3,4,4,4,4,3,2},{3,4,6,6,6,6,4,3},
			{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
			{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
			{3,4,6,6,6,6,4,3},{2,3,4,4,4,4,3,2}};
	
	KnightPiece k = new KnightPiece();
	int tempCol, tempRow, currentRow, currentCol;
	
	int moveR, moveC;
	
	public void tourKnight() {
		int leastAccess = 8, access = 0, count = 0;
		System.out.printf("Knight start position is: (%d, %d)%n",currentRow, currentCol);
	
	for(int move = 0; move < 64; move++) {
		
		for(count = 0; count < accessibility.length; count++) {
		tempRow = currentRow;
		tempCol = currentCol;
		
		tempRow += k.getVerticalMove(count);
		tempCol += k.getHorizontalMove(count);
		
		if(validateMove(tempRow, tempCol) == true) {
			
			access = accessibility[tempRow][tempCol];
			decrementAccess(tempRow, tempCol);
			
			if(access < leastAccess) {
				moveR = tempRow;
				moveC = tempCol;
				leastAccess = access;
			}
		
		}
		if(count == 7) {
			accessibility[currentRow][currentCol] = 0;
			currentRow = moveR;
			currentCol = moveC;
			leastAccess = 8;
			
		}
		
		
	}
		
			
}
	
	displayChessBoard();
	System.out.println();
	
		
		
}
	public void displayChessBoard() {

		System.out.printf("%n%17s%n","ChessBoard");
		for(int row = 0; row < accessibility.length; row++) {
			
			for(int col = 0; col < accessibility[row].length; col++) {
				
				
				if(accessibility[row][col] == 0) {
					System.out.print(" k ");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}

	public boolean validateMove(int row, int col) {
		
		
		if(row >= 0 && row <= 7 && col >= 0 && col <= 7) {
			
			if(accessibility[row][col] != 0) {
				return true;
			}
		}
		
		return false;
	}
	public void decrementAccess(int row, int col) {
		--accessibility[row][col];
	
	}
	public void tourAll() {
		
		for(int row = 0; row < accessibility.length; row++) {
			
			for(int column = 0; column < accessibility[row].length; column++) {
				
				currentRow = row;
				currentCol = column;
				
				tourKnight();
			}
		}
	}
	
	
}
	