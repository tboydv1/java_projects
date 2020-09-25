package exercise7_22;

public class KnightPiece {

	static final  int[] horizontal = new int[8];
	static final int[]  vertical = new int[8];

	public KnightPiece() {
		horizontal[0] = 2;
		horizontal[1] = 1; 
		horizontal[2] = -1; 
		horizontal[3] = -2; 
		horizontal[4] = -2; 
		horizontal[5] = -1;
		horizontal[6] = 1;
		horizontal[7] = 2; 
		
		vertical[0] = -1;
		vertical[1] = -2;
		vertical[2] = -2;
		vertical[3] = -1;
		vertical[4] = 1;
		vertical[5] = 2;
		vertical[6] = 2;
		vertical[7] = 1;

	}
	public int getHorizontalMove(int moveNumber) {
		int move = horizontal[moveNumber];
		return move;
	}
	public int getVerticalMove(int moveNumber) {
		int move = vertical[moveNumber];
		return move;
	}
}
