package exercise14_25;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrosswordPuzzleTest {
	
	CrosswordPuzzle puzzle1;
	Puzzle puzzleClass;
	CrosswordBoard myBoard;
	
	@BeforeEach
	void setUp() throws Exception {
		try {
			puzzle1 = new CrosswordPuzzle("/home/oluwatobi/Dev/java_project/Strings_chapter14/cross_puzzle/puzzle1");	
		}
		
		catch(IllegalArgumentException e) {
			System.err.println("Error initializing puzzle, not a directory");
		}
		
		puzzleClass = new Puzzle(Paths.get("/home/oluwatobi/Dev/java_project/Strings_chapter14/cross_puzzle/wordList.txt"));
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void classInitializedTest() {
		
		assertNotNull(puzzle1);
		
		assertTrue(Files.isDirectory(puzzle1.getDirectory()));
		
	}
	
	@Test
	void readPuzzleWordsTest() {
		
		try {
			puzzle1.getPuzzleWords();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		puzzle1.displayPuzzleWord();
		
		
		assertEquals("Not", puzzle1.getAccross().get(1));
		assertEquals("Sit", puzzle1.getAccross().get(3));
		assertEquals("White", puzzle1.getAccross().get(4));
		assertEquals("Over", puzzle1.getAccross().get(7));
		assertEquals("Made", puzzle1.getAccross().get(8));
		assertEquals("Any", puzzle1.getAccross().get(10));
		assertEquals("Away", puzzle1.getAccross().get(12));
		assertEquals("But", puzzle1.getAccross().get(13));
		
		assertEquals("Now", puzzle1.getDown().get(1));
		assertEquals("Start", puzzle1.getDown().get(2));
		assertEquals("Seven", puzzle1.getDown().get(3));
		assertEquals("Him", puzzle1.getDown().get(5));
		assertEquals("Today", puzzle1.getDown().get(6));
		assertEquals("Saw", puzzle1.getDown().get(9));
		assertEquals("You", puzzle1.getDown().get(11));
		
	}
	
	@Test
	void readWordListTest() {
		
		Path wordlistPath = Paths.get("/home/oluwatobi/Dev/java_project/Strings_chapter14/cross_puzzle/wordList.txt");
		List<String> wordList = new ArrayList<>();
		
		wordList = puzzleClass.getListFromFile(wordlistPath);
		
		assertEquals("Lagos", wordList.get(0));
		assertEquals("Soup", wordList.get(1));
		assertEquals("pale", wordList.get(2));
		assertEquals("Crabs", wordList.get(3));
		
		puzzleClass.setWordList(wordList);
		
		assertEquals("Lagos", puzzleClass.getWordList().get(0));
		assertEquals("Soup", puzzleClass.getWordList().get(1));
		assertEquals("pale", puzzleClass.getWordList().get(2));
		assertEquals("Crabs", puzzleClass.getWordList().get(3));
		
		
	}
	
//	@Test
//	void invalidPuzzleWordsTest() {
//		
//		Path wordlistPath = Paths.get("/home/oluwatobi/Dev/java_project/Strings_chapter14/cross_puzzle/wordList.txt");
//			
//		assertThrows(InputMismatchException.class, ()-> puzzleClass.getListFromFile(wordlistPath));
//		
//		
//			
//		
//	}
	
	@Test
	void createNewCrossWordBoardTest() {
		
		myBoard = new CrosswordBoard(puzzleClass);
		
		System.out.println(puzzleClass.getWordList().size());
		
		assertEquals(8, myBoard.getBoard().length);
	}
	
	@Test
	void sortWordListTest() {
		
		puzzleClass.sortWords();
		
		assertEquals("soup", puzzleClass.getWordList().get(0));
		assertEquals("pale", puzzleClass.getWordList().get(1));
		assertEquals("lagos", puzzleClass.getWordList().get(2));
		assertEquals("crabs", puzzleClass.getWordList().get(3));
	}
	
	

}
