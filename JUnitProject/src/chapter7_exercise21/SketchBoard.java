/**
 * 
 */
package chapter7_exercise21;

/**
 * @author tboydev
 *
 */
public class SketchBoard {

	private int[][] boardFloor;
	
	public SketchBoard(int size) {
		
		this.boardFloor = new int[size][size];
	}

	public int[][] getBoardFloor() {
		return boardFloor;
	}

	public void setBoardFloor(int[][] boardFloor) {
		this.boardFloor = boardFloor;
	}
	
	
}
