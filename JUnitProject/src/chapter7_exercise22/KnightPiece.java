/**
 * 
 */
package chapter7_exercise22;

/**
 * @author tboydev
 *
 */
public class KnightPiece {

	private int currentColumn, currentRow;
	
	private final int[] vertical = {-1,-2,-2,-1, 1, 2, 2, 1};
	private  final int[] horizontal = {2 , 1, -1 , -2, -2, -1, 1, 2};
	
	
	
	public int getCurrentColumn() {
		return currentColumn;
	}
	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}
	public int getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
	public int[] getVertical() {
		return vertical;
	}
	
	public int[] getHorizontal() {
		return horizontal;
	}
	
	
	
	
}
