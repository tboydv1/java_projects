/**
 * 
 */
package exercise22;

import java.util.InputMismatchException;

/**
 * @author tboydev
 *
 */
public class ChessPlayer {

	
	public void moveKnight(ChessBoard blueBoard, int moveNumber) throws InputMismatchException {
		
	
		blueBoard.getKnight().move(moveNumber, blueBoard);
		blueBoard.initializeKnightPosition();
		
	}
}
