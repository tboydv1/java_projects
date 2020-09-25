/**
 * 
 */
package exercise22;

/**
 * @author tboydev
 *
 */
public class KnightPiece {

	private int[] horizontal = new int[8];
	private int[] vertical = new int[8];
	
	private int currentRow = 0, currentColumn = 0;
	
	
	
	
	public KnightPiece() {
		
			horizontal[0] = 2; 	vertical[0] = -1;
			horizontal[1] = 1; vertical[1] = -2;
			horizontal[2] = -1; vertical[2] = -2;
			horizontal[3] = -2; vertical[3] = -1;
			horizontal[4] = -2; vertical[4] = 1;
			horizontal[5] = -1; vertical[5] = 2;
			horizontal[6] = 1; vertical[6] = 2;
			horizontal[7] = 2; vertical[7] = 1;
	}

	public int[] getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(int[] horizontal) {
		this.horizontal = horizontal;
	}

	public int[] getVertical() {
		return vertical;
	}

	public void setVertical(int[] vertical) {
		this.vertical = vertical;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentColumn() {
		return currentColumn;
	}

	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}
	
	public void move(int moveNumber, ChessBoard board) {
		
		int tempColumn = getCurrentColumn(), tempRow = getCurrentRow();
		
		if(moveNumber < 0 || moveNumber > 8) {
			throw new IllegalArgumentException("Invalid move number");
		}
		
	
			tempColumn += horizontal[moveNumber];
			tempRow += vertical[moveNumber];
		
		
		if(tempColumn < 0 || tempColumn > 8  || tempRow < 0 || tempRow > 8) {
			throw new ArrayIndexOutOfBoundsException("Not a valid move from current position");
		}
		
		if(board.getFloor()[tempRow][tempColumn] == 1) {
			System.out.println("Square already visited");
		}
		else {
			
			currentRow += vertical[moveNumber];
			currentColumn += horizontal[moveNumber];
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
