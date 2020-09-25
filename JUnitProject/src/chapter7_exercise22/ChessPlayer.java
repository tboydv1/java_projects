/**
 * 
 */
package chapter7_exercise22;

/**
 * @author tboydev
 *
 */
public class ChessPlayer {

	
	public void moveKnight(KnightPiece myKnight, ChessBoard board, int moveNumber) {
		
		
		if(moveNumber < 0 || moveNumber > 7) {
			throw new IllegalArgumentException("Invalid MoveNumber");
		}
		
		int tempCol = myKnight.getCurrentColumn();
		int tempRow = myKnight.getCurrentRow();
		
		tempRow += myKnight.getVertical()[moveNumber];
		tempCol += myKnight.getHorizontal()[moveNumber];
		
		
		
		if (tempRow < 0 || tempRow > 7 || tempCol < 0 || tempCol > 7) {
			
			throw new ArrayIndexOutOfBoundsException("Not a valid move from current position");
			
		}
		
		
		if(board.getFloor()[tempRow][tempCol] == 1) {
			System.out.println("Cant visit already visited square");
			
			
		}else {
			
			System.out.println(tempRow + ","+ tempCol);
			myKnight.setCurrentColumn(tempCol);
			myKnight.setCurrentRow(tempRow);
			board.getFloor()[myKnight.getCurrentRow()][myKnight.getCurrentColumn()] = 1;
		}
	}
}
