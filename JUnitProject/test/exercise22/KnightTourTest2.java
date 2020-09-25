package exercise22;
import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * 
 */

/**
 * @author tboydev
 *
 */
class KnightTourTest2 {

	ChessBoard myBoard;
	KnightPiece myKnight;
	ChessPlayer vladamir;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		myBoard = new ChessBoard();
		myKnight = new KnightPiece();
		myBoard.setKnight(myKnight);
		vladamir = new ChessPlayer();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void chessBoardInitializedWithKnightPieceTest() {
		
		assertNotNull(myBoard);
		assertEquals(8, myBoard.getFloor().length, myBoard.getFloor()[0].length);
		assertNotNull(myKnight);
		assertEquals(myKnight, myBoard.getKnight());
		
		for(int i = 0; i < myBoard.getFloor().length; i++) {
			
			for(int k = 0; k < myBoard.getFloor()[i].length; k++) {
				
				assertEquals(0, myBoard.getFloor()[i][k]);
				
			}
		}
		
	}
	
	@Test
	void validateKnightHorizonatalMovesTest() {
		
		assertNotNull(myBoard.getKnight());
		
		assertEquals(2, myBoard.getKnight().getHorizontal()[0]);
		assertEquals(1, myBoard.getKnight().getHorizontal()[1]);
		assertEquals(-1, myBoard.getKnight().getHorizontal()[2]);
		assertEquals(-2, myBoard.getKnight().getHorizontal()[3]);
		assertEquals(-2, myBoard.getKnight().getHorizontal()[4]);
		assertEquals(-1, myBoard.getKnight().getHorizontal()[5]);
		assertEquals(1, myBoard.getKnight().getHorizontal()[6]);
		assertEquals(2, myBoard.getKnight().getHorizontal()[7]);
	
	}
	
	@Test
	void validateKnightVerticalMovesTest() {
		
		assertEquals(-1, myBoard.getKnight().getVertical()[0]);
		assertEquals(-2, myBoard.getKnight().getVertical()[1]);
		assertEquals(-2, myBoard.getKnight().getVertical()[2]);
		assertEquals(-1, myBoard.getKnight().getVertical()[3]);
		assertEquals(1, myBoard.getKnight().getVertical()[4]);
		assertEquals(2, myBoard.getKnight().getVertical()[5]);
		assertEquals(2, myBoard.getKnight().getVertical()[6]);
		assertEquals(1, myBoard.getKnight().getVertical()[7]);
	}
	
	@Test
	void knightCurrentPositionTest() {
		
		assertEquals(0, myBoard.getKnight().getCurrentRow());
		assertEquals(0, myBoard.getKnight().getCurrentColumn());
	}
	
	@Test
	void chessPlayerInitializedTest() {
		
		assertNotNull(vladamir);
		
		
		
	}
	
	@Test
	void moveKnightTest() {
		
		assertEquals(0, myBoard.getKnight().getCurrentRow());
		assertEquals(0, myBoard.getKnight().getCurrentColumn());
		
		vladamir.moveKnight(myBoard, 7);
		
		assertEquals(1, myBoard.getKnight().getCurrentRow());
		assertEquals(2, myBoard.getKnight().getCurrentColumn());
		
	}
	
	@Test
	void moveKnightOutsideChessBoardTest() {
		
		assertEquals(0, myBoard.getKnight().getCurrentRow());
		assertEquals(0, myBoard.getKnight().getCurrentColumn());
		
		try {
		vladamir.moveKnight(myBoard, 3);
		}
		catch(ArrayIndexOutOfBoundsException ax) {
			System.out.println("Not a valid move from current position");
		}
		
		assertEquals(0, myBoard.getKnight().getCurrentRow());
		assertEquals(0, myBoard.getKnight().getCurrentColumn());
		
	}
	@Test 
	void moveWithNegativeMoveNumberTest() {
		
		myBoard.getKnight().setCurrentRow(4);
		myBoard.getKnight().setCurrentColumn(3);
		
		
		assertEquals(4, myBoard.getKnight().getCurrentRow());
		assertEquals(3, myBoard.getKnight().getCurrentColumn());
		
		try {
		vladamir.moveKnight(myBoard, -1);
		}
		catch(ArrayIndexOutOfBoundsException ax) {
			System.out.println("Not a valid move from current position");
		}
		catch(IllegalArgumentException ex) {
			System.out.println("Invalid move number");

		}
		catch(InputMismatchException e) {
			System.out.println("Illegal entry");
		}
		
		assertEquals(4, myBoard.getKnight().getCurrentRow());
		assertEquals(3, myBoard.getKnight().getCurrentColumn());
		
	}
	
	@Test
	void InitializeKnightCurrentPositiontoOneTest() {
		
		assertEquals(0, myBoard.getKnight().getCurrentRow());
		assertEquals(0, myBoard.getKnight().getCurrentColumn());
		
		vladamir.moveKnight(myBoard, 7);
		
		assertEquals(1, myBoard.getKnight().getCurrentRow());
		assertEquals(2, myBoard.getKnight().getCurrentColumn());
		
		assertEquals(1, myBoard.getFloor()[1][2]);
		
	}
	
	@Test
	void moveKnight64TimesTest() {
		
		myBoard.getKnight().setCurrentRow(4);
		myBoard.getKnight().setCurrentColumn(3);
		
		assertEquals(4, myBoard.getKnight().getCurrentRow());
		assertEquals(3, myBoard.getKnight().getCurrentColumn());
		
		int gameCount = 0, number;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter move number: ");
		
		while(gameCount < 64) {
			
			
			
			try {
				number = input.nextInt();
				vladamir.moveKnight(myBoard, number);
				}
				catch(ArrayIndexOutOfBoundsException ax) {
					System.out.println("Not a valid move from current position");
				}
				catch(IllegalArgumentException ex) {
					System.out.println("Invalid move number");

				}
				catch(InputMismatchException e) {
					System.out.println("Illegal entry");
				}
			System.out.printf("Knight's current position is: %n(%d, %d)",myBoard.getKnight().getCurrentRow() ,
					myBoard.getKnight().getCurrentColumn());
			
			gameCount++;
			
		}
		System.out.println();
		
		for(int i = 0; i < myBoard.getFloor().length; i++) {
			
			for(int k = 0; k < myBoard.getFloor()[i].length; k++) {
				
				if(myBoard.getFloor()[i][k] == 0) {
					System.out.print("*");
				}
				else {
					System.out.print("K");
				}
					
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
