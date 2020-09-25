package exercise8_17;

import java.security.SecureRandom;
import java.util.Scanner;

public class TIC_TAC_TOE {

	private static  enum Type{x,o,EMPTY};
	private int currentRow;
	private int currentColumn;
	private static enum players{human, computer}
	
	
	Scanner input = new Scanner(System.in);
	SecureRandom  random = new SecureRandom();
	
	private  Type[][] board = new Type[3][3];
	
	private int row_moves[] = {0,0,0,1,1,1,2,2,2};
	private int col_moves[] = {0,1,2,0,1,2,0,1,2};
	
	static Type	move;
	static players currentPlayer;
	
	public TIC_TAC_TOE() {
		
		for(int i = 0; i < board.length; i++)
			for(int k = 0; k < board[i].length; k++)
				board[i][k] = Type.EMPTY;
	}
	
	public void play() {
		
		System.out.println("Select first move: 'x' or 'o'");
		char firstMove = input.next().charAt(0);
		
		if(firstMove == 'x') {
			move = Type.x;
		}
		else if(firstMove == 'o') {
			move = Type.o;
		}
		
		System.out.printf("Enter move number: (0-9)%n");
		int moveNo = input.nextInt();
		
		int gameCount = 0;
		
		while(gameCount < 9) {
			
			makeMove(moveNo);
			
			displayBoard();
			if(checkWin() == true) {
				System.out.printf("%s wins!!", move);
				break;
			}
			
			
			if(move == Type.x) {
				move =Type.o;
			}
			else
				move = Type.x;
			
		
			
			System.out.printf("%s moves next%nEnter move number: %n", move);
			moveNo = input.nextInt();
			
			gameCount++;
		}
		
		
	}
	
	public void playWithComputer() {
		
		System.out.printf("Would you like to go first [y/n] ?%n");
		char answer = input.next().charAt(0);
		
		if(answer == 'y' ) {
			currentPlayer = players.human;
		}
		else if(answer == 'n'){ 
			currentPlayer = players.computer;
		}
		
		
		int firstMove = 1 + random.nextInt(2);
		
		if(firstMove == 1) {
			move = Type.x;
			if(currentPlayer == players.human)
				System.out.printf("Human is 'x'%n");
				else
					System.out.printf("Computer is 'x'%n");
		}
		else if(firstMove == 2) {
			move = Type.o;
			if(currentPlayer == players.human)
				System.out.printf("Human is 'o'%n");
				else
					System.out.printf("Computer is 'o'%n");
		}
		
		int gameCount = 0;
		int moveNo;
		
		while(gameCount < 9) {
			
			if(currentPlayer == players.human) {
				System.out.printf("Your Turn%nEnter move number: ");
				moveNo = input.nextInt();
				makeMove(moveNo);
			}
			else {
				moveNo = random.nextInt(9);
				System.out.printf("Computer moves: %d%n", moveNo);
				makeMove(moveNo);
			}
			
			displayBoard();
			
			if(checkWin() == true) {
				if(currentPlayer == players.human) {
				System.out.printf("Human wins!!%n");
				break;
				}
				else if(currentPlayer == players.computer){
					System.out.println("Computer wins!");
				}
			}
			
			if(move == Type.x) {
				move =Type.o;
				
			}
			else {
				move = Type.x;
				
			}
			
			if(currentPlayer == players.human) {
				currentPlayer = players.computer;
			}
			else 
				currentPlayer = players.human;
			
			gameCount++;
			
			
			
		}
	}
	
	
	
	public void makeMove( int moveNo){
		
	if(board[row_moves[moveNo]][col_moves[moveNo]] == Type.EMPTY)
		board[row_moves[moveNo]][col_moves[moveNo]] = move;
		else
			System.out.println("You cant move to an occupied square");
	
	currentRow = row_moves[moveNo];
	currentColumn = col_moves[moveNo];
			
	}
	
	

	public  void displayBoard() {
		
		for (Type value[]: board) {
				for(Type box: value) {
					
					if(box == Type.x)
						System.out.print(" X " );
						if(box == Type.o)
							System.out.print(" O ");
							else if(box == Type.EMPTY)
								System.out.print(" * ");
				}
		System.out.println();
		}
		System.out.println();
	}
	
	public boolean checkWin() {
		int count = 1;
		int count2 = 1;
		int count3 = 1;
		int count4 = 1;
		
		
		for(int i = 1; i < board.length; i++) {
			
			if(checkMoves(currentRow, currentColumn-i) == true) 
					count++;
			if(checkMoves(currentRow, currentColumn+i) == true)
					count++;
			if(checkMoves(currentRow -i, currentColumn) == true)
					count2++;
			if(checkMoves(currentRow + i, currentColumn) == true)
					count2++;
			if(checkMoves(currentRow +i, currentColumn - i) == true)
					count3++;
			if(checkMoves(currentRow - i, currentColumn + i) == true)
					count3++;
			if(checkMoves(currentRow -i, currentColumn - i) == true) 
					count4++;
			if(checkMoves(currentRow + i, currentColumn + i) == true)
				count4++;
	
		}
		
		if(count == 3)
			return true;
		if(count2 == 3) 
			return true;
		if(count3 == 3) 
			return true;
		
		
			return false;
	}
	
	private boolean checkMoves(int row, int col) {
		
		if(row >= 0 && row <= 2  ) {
			
			if(col >= 0 && col <= 2)
				
				if(board[row][col] == move)
					return true;
		
		}
		return false;
	}
	
	
}
