package chapter7_exercise22;

public class ChessBoard {

	
	private int FLOOR_SIZE = 8;
	
	private int[][] floor = new int[FLOOR_SIZE][FLOOR_SIZE];
	
	private KnightPiece myKnight;
	
	
	public int[][] getFloor() {
		return floor;
	}
	public void setFloor(int[][] floor) {
		this.floor = floor;
	}
	public KnightPiece getMyKnight() {
		return myKnight;
	}
	public void setMyKnight(KnightPiece myKnight) {
		this.myKnight = myKnight;
	}
	
	
	
	
	
	
}
