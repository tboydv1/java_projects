/**
 * 
 */
package exercise22;

/**
 * @author tboydev
 *
 */
public class ChessBoard {

	
	private KnightPiece knight;
	
	private int[][] floor = new int[8][8];
	

	public int[][] getFloor() {
		return floor;
	}

	public void setFloor(int[][] floor) {
		this.floor = floor;
	}

	public KnightPiece getKnight() {
		return knight;
	}

	public void setKnight(KnightPiece knight) {
		this.knight = knight;
	}
	
	public void initializeKnightPosition() {
		
		getFloor()[getKnight().getCurrentRow()][getKnight().getCurrentColumn()] = 1;
	}
	
	
}
