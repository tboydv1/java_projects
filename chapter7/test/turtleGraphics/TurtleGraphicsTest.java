/**
 * 
 */
package turtleGraphics;

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

class TurtleGraphicsTest {

		Turtle myTurtle;
		Pen myTurtlePen;
		SketchPad drawingPad;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 * 
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("Running setup....");
		myTurtle = new Turtle();
		myTurtlePen = new Pen();
		myTurtle.setTurtlePen(myTurtlePen);
		
		
		drawingPad = new SketchPad();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void turtleInitializedTest() {
		System.out.println("Running initialization test....");
		
		
//		assertNotNull(myTurtle.getTurtlePen());
		assertEquals(myTurtlePen, myTurtle.getTurtlePen());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		
		System.out.println("Done Running turtle initialization");

		
	}
	
	@Test
	void sketchInitializedTest() {
		System.out.println("Running Sketchpad initialization test....");
		
		assertNotNull(drawingPad);
		
		assertNotNull(drawingPad.accessSketchPad());
		
		System.out.println("Done Running Sketchpad initialization test....");
	}
	
	@Test
	void moveForwardTwelveStepsTest() {
		
		System.out.println("Running turtle move foward 12steps test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveFoward(12, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentCol());
		
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[myTurtle.getCurrentRow()][i]);
		}
		System.out.println("Done Running turtle move forward test.");
		
	}
	
	@Test
	void moveForwardSevenStepsTest() {
		System.out.println("Running turtle move forwars 7 steps initialization test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveFoward(7, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(6, myTurtle.getCurrentCol());
		
		for(int i = 0; i < 7; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[myTurtle.getCurrentRow()][i]);
		}
		System.out.println("Running turtle move forward 7 steps initialization test....");
		
	}
	
	@Test
	void moveForwardTwentyStepsTest() {
		System.out.println("Running turtle move forwars 7 steps initialization test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveFoward(20, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(19, myTurtle.getCurrentCol());
		
		for(int i = 0; i < 20; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[myTurtle.getCurrentRow()][i]);
		}
		System.out.println("Running turtle move forward 7 steps initialization test....");
		
	}
	
	@Test
	void moveForwardTwentyOneStepsTest() {
		System.out.println("Running turtle move forwars 21 steps initialization test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class, ()-> myTurtle.moveFoward(21, drawingPad));
	
	}
	
	@Test
	void moveForwardwithNullSketchPadTest() {
		System.out.println("Running turtle move forward with null sketchpad initialization test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class, ()-> myTurtle.moveFoward(21, drawingPad));
	
	}
	
	@Test
	void moveForwardWithNegativeStepsTest() {
	System.out.println("Running turtle move forwars negative steps initialization test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class, ()-> myTurtle.moveFoward(-1, drawingPad));
	
	}
	

	@Test
	void moveForwardZeroStepsTest() {
		System.out.println("Running turtle move forwars 7 steps initialization test....");
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class, ()-> myTurtle.moveFoward(0, drawingPad));
		
	}
	
	@Test
	void TurnRightWhenOrientationIsColumn_Right() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		myTurtle.setCurrentOrientation(TurtleOrientation.COLUMN_RIGHT);
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		myTurtle.turnRight();
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());

	}
	
	@Test
	void moveFowardTurnRightAndMoveFowardTest() {
		
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		
		myTurtle.moveFoward(12, drawingPad);
		
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentCol());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[myTurtle.getCurrentRow()][i]);
		}
		
		myTurtle.turnRight();
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentCol());
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
		
		myTurtle.moveFoward(12, drawingPad);
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentCol());
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
		
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[i][myTurtle.getCurrentCol()]);
		}
		
	}
	
	@Test
	void drawTwelveByTwelveSquareTest() {
		
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		
		assertEquals(0, myTurtle.getCurrentCol(), myTurtle.getCurrentRow());
		myTurtle.moveFoward(12, drawingPad);
		
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentCol());
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		for(int i = 0; i < 12; i++) {
			
			assertEquals(1, drawingPad.accessSketchPad()[myTurtle.getCurrentRow()][i]);
		}
		
		myTurtle.turnRight();
		
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
		
		myTurtle.moveFoward(12, drawingPad);
		
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentCol());
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[i][myTurtle.getCurrentCol()]);
		}
		
		myTurtle.turnRight();
		
		assertEquals(TurtleOrientation.COLUMN_LEFT, myTurtle.getCurrentOrientation());
		
		myTurtle.moveFoward(12, drawingPad);
		
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[myTurtle.getCurrentRow()][i]);
		}
		
		
		myTurtle.turnRight();
		
		assertEquals(TurtleOrientation.ROW_UP, myTurtle.getCurrentOrientation());
		
		myTurtle.moveFoward(12, drawingPad);
		
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentCol());
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.accessSketchPad()[i][myTurtle.getCurrentCol()]);
		}
		
		
		//Display array
		for(int i = 0; i < drawingPad.accessSketchPad().length; i++) {
			
			for(int j = 0; j < drawingPad.accessSketchPad()[i].length; j++) {
				
				if(drawingPad.accessSketchPad()[i][j] == 0) {
					
					System.out.print("   ");
					
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println("\n");
		}
		
		
	}
	
	
	
	

}
