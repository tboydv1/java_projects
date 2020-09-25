/**
 * 
 */
package chapter7_exercise22;
import java.util.InputMismatchException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tboydev
 *
 */
class KnightTourTest {
	
	ChessPlayer buff;
	ChessBoard myBoard;
	KnightPiece knightObj;
	int[][] board = new int[8][8];
	Scanner input;
	
	
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
		knightObj = new KnightPiece();
		myBoard.setMyKnight(knightObj);
		buff = new ChessPlayer();
		input = new Scanner(System.in);
		 
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	

	@Test
	void chessBoardInitializedTest() {
		
		assertNotNull(myBoard);
		
		
		assertEquals(8, myBoard.getFloor().length); //Assert that chessBoard row and columns length is 8
	
		assertEquals(knightObj, myBoard.getMyKnight());
		
		
		assertArrayEquals(board, myBoard.getFloor()); //Assert Each square on chessBoard is initialized to zero
		
		
	}
	
	@Test
	void chessPlayerInitializedTest() {
		
		assertNotNull(buff);
	}
	
	@Test
	void knightVerticalMovesTest() {
		
		assertNotNull(knightObj);
		assertEquals(-1, myBoard.getMyKnight().getVertical()[0]);
		assertEquals(-2, myBoard.getMyKnight().getVertical()[1]);
		assertEquals(-2, myBoard.getMyKnight().getVertical()[2]);
		assertEquals(-1, myBoard.getMyKnight().getVertical()[3]);
		assertEquals(1, myBoard.getMyKnight().getVertical()[4]);
		assertEquals(2, myBoard.getMyKnight().getVertical()[5]);
		assertEquals(2, myBoard.getMyKnight().getVertical()[6]);
		assertEquals(1, myBoard.getMyKnight().getVertical()[7]);
	}
	
	@Test
	void knightHorizonatalMovesTest() {
		
		assertNotNull(knightObj);
		assertEquals(2, myBoard.getMyKnight().getHorizontal()[0]);
		assertEquals(1, myBoard.getMyKnight().getHorizontal()[1]);
		assertEquals(-1, myBoard.getMyKnight().getHorizontal()[2]);
		assertEquals(-2, myBoard.getMyKnight().getHorizontal()[3]);
		assertEquals(-2, myBoard.getMyKnight().getHorizontal()[4]);
		assertEquals(-1, myBoard.getMyKnight().getHorizontal()[5]);
		assertEquals(1, myBoard.getMyKnight().getHorizontal()[6]);
		assertEquals(2, myBoard.getMyKnight().getHorizontal()[7]);
	}
	
	@Test
	void chessPlayerMakesMoveStartingFromRow0Column0test() {
		
		assertEquals(0, myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn()); //check Knights current position
		
		assertThrows(ArrayIndexOutOfBoundsException.class, ()->buff.moveKnight(knightObj, myBoard, 0));
		

	}
	
	@Test
	void chessPlayerMakesMoveNumber7FromRow_0Column_0() {
		
		assertEquals(0, myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn()); //check Knights current position
		
		buff.moveKnight(knightObj, myBoard, 7);
		
		assertEquals(1, myBoard.getMyKnight().getCurrentRow());
		assertEquals(2, myBoard.getMyKnight().getCurrentColumn());
		
		
	}
	
	@Test
	void newKnightPositionInitializedToOneTest() {
		
		assertEquals(0, myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn()); //check Knights current position
		
		buff.moveKnight(knightObj, myBoard, 7);
		
		assertEquals(1, myBoard.getMyKnight().getCurrentRow());
		assertEquals(2, myBoard.getMyKnight().getCurrentColumn());
		
		assertEquals(1, myBoard.getFloor()[myBoard.getMyKnight().getCurrentRow()][myBoard.getMyKnight().getCurrentColumn()]);
		
		
	}
	
	@Test
	void makeNegativeMoveNumberTest() {
		
		assertEquals(0, myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn()); //check Knights current position
		
		assertThrows(IllegalArgumentException.class, ()->buff.moveKnight(knightObj, myBoard, -1));
		
	
	}
	
	@Test 
	void moveToAlreadyVisitedSquareTest(){
		
		assertEquals(0, myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn()); //check Knights current position
		
		buff.moveKnight(knightObj, myBoard, 7);
		
		assertEquals(1, myBoard.getMyKnight().getCurrentRow());
		assertEquals(2, myBoard.getMyKnight().getCurrentColumn());
		
		assertEquals(1, myBoard.getFloor()[myBoard.getMyKnight().getCurrentRow()][myBoard.getMyKnight().getCurrentColumn()]);
				
		buff.moveKnight(knightObj, myBoard, 3);
		
		assertEquals(1, myBoard.getMyKnight().getCurrentRow());
		assertEquals(2, myBoard.getMyKnight().getCurrentColumn());
		
		
	}
	
	@Test 
	void moveToTwoSquaresTest(){
		
		assertEquals(0, myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn()); //check Knights current position
		
		buff.moveKnight(knightObj, myBoard, 6);
		
		assertEquals(2, myBoard.getMyKnight().getCurrentRow());
		assertEquals(1, myBoard.getMyKnight().getCurrentColumn());
		
		assertEquals(1, myBoard.getFloor()[myBoard.getMyKnight().getCurrentRow()][myBoard.getMyKnight().getCurrentColumn()]);
				
		buff.moveKnight(knightObj, myBoard, 6);
		
		assertEquals(4, myBoard.getMyKnight().getCurrentRow());
		assertEquals(2, myBoard.getMyKnight().getCurrentColumn());
		
		assertEquals(1, myBoard.getFloor()[myBoard.getMyKnight().getCurrentRow()][myBoard.getMyKnight().getCurrentColumn()]);
		
		
	}
	
	@Test
	void moveKnight64TimesTest() {
		
		System.out.println("Enter move Number: ");
		int count = 0, moveNumber;
		
		while(count < 64) {
			
			moveNumber = input.nextInt();
			try {
			buff.moveKnight(knightObj, myBoard, moveNumber);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("is not a valid movenumber");
			}
			catch(IllegalArgumentException e) {
				System.out.println("Invalid MoveNumber");
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid moveNumber");
			}
			System.out.printf("Knights Current Position is: (%d, %d)%n"  , myBoard.getMyKnight().getCurrentRow(), myBoard.getMyKnight().getCurrentColumn());
			
			count++;
			
		}
		
		for(int i = 0; i < myBoard.getFloor().length; i++) {
			
			for(int j = 0; j < myBoard.getFloor()[i].length; j++) {
				
				if(myBoard.getFloor()[i][j] == 0)
					System.out.print("*");
				else
					System.out.print("K");
				
			}
			System.out.println();
		}
		
		
	}
	
	

}
