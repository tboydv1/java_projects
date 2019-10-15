package exercise14_25;

public class CrosswordBoard {

	private Puzzle wordPuzzles;
	private char[][] board;
	
	public CrosswordBoard(Puzzle puzzle) {
		
		this.wordPuzzles = puzzle;

		this.setBoard(createBoard());
		
	}
	
	public Puzzle getWordPuzzles() {
		return wordPuzzles;
	}

	public void setWordPuzzles(Puzzle wordPuzzzles) {
		this.wordPuzzles = wordPuzzzles;
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}

	private char[][] createBoard() {
		
		//find the count of words in puzzle
		int size = getWordPuzzles().getWordList().size();
		
		return new char[(size * 2)][(size * 2)]; 
		
	}
}
