/**
 * 
 */
package chapter7_exercise21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tboydev
 *
 */
class TurtleSketchTest {

	
			Turtle turtleObj;
			DrawingPen turtlePen;
			SketchBoard turtlePad;
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
		
		System.out.println("Setting up...");
		turtleObj = new Turtle();
		turtlePen = new DrawingPen();
		turtleObj.setTurtlePen(turtlePen);
		turtlePad = new SketchBoard(20);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void turtleInitializedTest() {
		
		assertNotNull(turtleObj);
		
		//Turtle current position
		assertEquals(0, turtleObj.getCurrentRow(), turtleObj.getCurrentCol());
		
		//Turtle has pen 
		assertNotNull(turtleObj.getTurtlePen());
		
		//assert current position is up
		assertEquals(PenStatus.UP, turtleObj.getTurtlePen().getCurrentStatus());
		
		//
	}
	
	@Test 
	void SketchPadInitializedTest(){
		
		assertNotNull(turtlePad);
		
		assertNotNull(turtlePad.getBoardFloor());
		
	}
	
	@Test
	void turtleOrientionColumnRightMoveForwardTest() {
		
		//assert current Orientation is column right
		
		assertEquals(TurtleDirection.COLUMN_RIGHT, turtleObj.getCurrentDirection());
		
		
		//assert that current position eqauls 0, 0
		assertEquals(0, turtleObj.getCurrentCol(), turtleObj.getCurrentRow());
		
		assertEquals(PenStatus.UP, turtlePen.getCurrentStatus());
		
		turtleObj.moveForward(12, turtlePad);
		
		assertEquals(PenStatus.DOWN, turtlePen.getCurrentStatus());
		
		
		//Check new turtle position
		assertEquals(0, turtleObj.getCurrentRow());
		assertEquals(11, turtleObj.getCurrentCol());
		
		for(int i = 0; i < 12; i++) {
			
			assertEquals(1, turtlePad.getBoardFloor()[turtleObj.getCurrentRow()][i]);
		}
		
	}
	
	@Test
	void moveForwardTurnRightMoveForwardTest() {
		
		assertEquals(TurtleDirection.COLUMN_RIGHT, turtleObj.getCurrentDirection());
		
		assertEquals(PenStatus.UP, turtlePen.getCurrentStatus());
		
		//Check new turtle position
		assertEquals(0, turtleObj.getCurrentRow());
		assertEquals(0, turtleObj.getCurrentCol());
		
		turtleObj.moveForward(12, turtlePad);
		
		//Check new turtle position
		assertEquals(0, turtleObj.getCurrentRow());
		assertEquals(11, turtleObj.getCurrentCol());
		
		
		turtleObj.turnRight();
		
		assertEquals(TurtleDirection.ROW_DOWN, turtleObj.getCurrentDirection());
		
		
		turtleObj.moveForward(12, turtlePad);
		
		//Check new turtle position
		assertEquals(11, turtleObj.getCurrentRow());
		assertEquals(11, turtleObj.getCurrentCol());
		
		

	}
	
	
	
	
	
	
	

}
