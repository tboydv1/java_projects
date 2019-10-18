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
	
	public void setWords() {
		
		//
		//pick first word in the wordlist
		for(int i = 0; i < wordPuzzles.getWordList().size(); i++) {
			
			wordPuzzles.getWordList().get(i);
			
			
			//loop through board values
			
			for(int row = 0; row < getBoard().length; row++) {
				
				for (int col = 0; col < getBoard()[row].length; col++) {
					
					//place the first word on the board
//					if(i == 0) {
//						get
//					}
				}
			}
		}
			
	}
}
