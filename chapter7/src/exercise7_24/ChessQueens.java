package exercise7_24;

public class ChessQueens {

	int board[][] = new int[8][8];
	

	QueensPiece myqueen = new QueensPiece(board);
	
	
	
	public void queenTour(int smallR , int smallC ) {
		
		
		int count = 1, smallest;
		
		myqueen.setPosition(smallR, smallC); // set queens starting position
		
		while(count <= 8) {
			
			smallest = 29;
			System.out.println(smallR + " "+ smallC);
			
			myqueen.setQueen();	
		
		for(int row = 0; row < board.length; row++) {		
			
			for(int col = 0; col < board[row].length; col++) {
				
					if(board[row][col] != 1) {
					board[row][col] = setDiagonal(row, col);
					}
					
					if(board[row][col] != 1 && board[row][col] <= smallest) { // compare square with least number
						smallR = row;
						smallC = col;	
						smallest = board[row][col];
					}
		
			}
		}
			if(board[smallR][smallC] != 1) {
				
				myqueen.setPosition(smallR, smallC); 	//move queen to new position
			}
			else 
				break;
			
		count++;	
	}
		displayBoard();//display Board elements
		
		System.out.printf("Queen moved %d times%n",count);
		
		resetBoard(); // reset all board elements to zero
			
}
	public int setDiagonal(int row, int col) {
		
		
	int	accessNo = upwardLeftDiag(row, col) + upwardRightDiag(row, col) +
				downwardRightDiag(row, col) + downwardLeftDiag(row, col)+
				moveUpSide(row, col);
		
		
		return accessNo;
		
	}
	public int upwardLeftDiag(int row, int col) {  //move diagonally upward
		int count = 0;
		
		for(int i = 0; i < board.length; i++) {
			
				
			if(row >= 0 && row < 8 && col >= 0 && col < 8) {
				
				if(board[row][col] != 1)
						count++;
				
				row--; 
				col--;
					
			}
				
		}


		
		return count -1;
		
	}
	public int upwardRightDiag(int row, int col) { //move diagonally upward
		int count = 0;
		for(int i = 0; i < board.length; i++) {
			
			if(row >= 0 && row < 8 && col >=0 && col <8) {

				if(board[row][col] != 1)
					count++;

				
			row--; col++;
			
			
			}
		}

		return count -1;
		
	}
	public int downwardRightDiag(int row, int col) {  //move right diagonally downward 
		int count = 0;
		for(int i = 0; i < board.length; i++) {
			
			if(row >= 0 && row < 8 && col >=0 && col <8) {
				
				if(board[row][col] != 1)
					count++;
			
				row++; col++;
			}
		}
	
		return count -1;

		
	}
	public int downwardLeftDiag(int row, int col) { //move left diagonally downward
		int count = 0;
		for(int i = 0; i < board.length; i++) {
			
			if(row >= 0 && row < 8 && col >=0 && col <8) {
				
				if(board[row][col] != 1)
					count++;
			
				row++; col--;
		
			}
		}

		return count -1;
		
	}

	public int moveUpSide(int row, int col) {   //move vertically and horizontally
		int initialR = row, initialC = col;
		int countH = 0, countV = 0;
		
		
		//loop through row starting from first column
		col = 0; 
		for(int i = 0; i < board.length; i++) {
			
			if(row >= 0 && row < 8 && col >=0 && col <8) {

				if(board[row][col] != 1)
					++countV;

				col++;
				
			}
			
		}
		
		//loop through column starting from first row
		 col = initialC; row = 0;
		for(int u = 0; u < board.length; u++) {
			
			if(row >= 0 && row < 8 && col >=0 && col <8) {
				
				if(board[row][col] != 1)
					++countH;

				row++;
				
			}	
		}

		
		
		return (countV + countH) - 1;
	}
	
	public void displayBoard() {	
		
	
		for(int[] out: board) {
			for(int in: out) {
				if(in == 1)
				System.out.print(" Q ");
				else 
					System.out.print(" * ");
					
			}
			System.out.println();
		}
	}
	
	public void runAll() {		//run queens tour starting from each square
		
		for(int row = 0; row < board.length;row++ ) {
			
			for(int col = 0; col < board[row].length; col++) {
				
				System.out.printf("Queen starts from position %d, %d%n%n", row, col);
				queenTour(row,col);
			}
			
		}
		
	}
	
	public void resetBoard() {		//set the board elements value to 0
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				
				board[row][col] = 0;
			}
		}
	}
	
}
