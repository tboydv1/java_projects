/**
 * 
 */
package exercise9_8;

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
class QuadilateralsTest {

	
	Rectangle myRectangle;
	Square mySquare;
	Parallelogram myParallelogram;
	Trapezoid myTrapezoid;
	

	
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
		
		myRectangle = new Rectangle();
		mySquare = new Square();
		myParallelogram = new Parallelogram();
		myTrapezoid = new Trapezoid();
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void rectanglePointAtIndexZeroInitializedTest() {
		
		assertNotNull(myRectangle);
		
		for(int i = 0; i < 4; i++)
		assertNotNull(myRectangle.getShapePoints()[i]);
		
		myRectangle.getShapePoints()[0].setxCordinates(16);
		myRectangle.getShapePoints()[0].setyCordinates(8);
		
		assertEquals(16, myRectangle.getShapePoints()[0].getxCordinates());
		assertEquals(8, myRectangle.getShapePoints()[0].getyCordinates());
		

	}
	
	@Test
	void rectanglePointAtIndexOneInitializedTest() {
		
		assertNotNull(myRectangle);
		
		
		myRectangle.getShapePoints()[1].setxCordinates(13);
		myRectangle.getShapePoints()[1].setyCordinates(24);
		
		assertEquals(13, myRectangle.getShapePoints()[1].getxCordinates());
		assertEquals(24, myRectangle.getShapePoints()[1].getyCordinates());
		

	}
	
	@Test
	void rectanglePointAtIndexTwoInitializedTest() {
		
		assertNotNull(myRectangle);
		
		
		myRectangle.getShapePoints()[2].setxCordinates(4);
		myRectangle.getShapePoints()[2].setyCordinates(9);
		
		assertEquals(4, myRectangle.getShapePoints()[2].getxCordinates());
		assertEquals(9, myRectangle.getShapePoints()[2].getyCordinates());
		

	}
	
	@Test
	void rectanglePointAtIndexThreeInitializedTest() {
		
		assertNotNull(myRectangle);
		
		
		myRectangle.getShapePoints()[3].setxCordinates(5);
		myRectangle.getShapePoints()[3].setyCordinates(12);
		
		assertEquals(5, myRectangle.getShapePoints()[3].getxCordinates());
		assertEquals(12, myRectangle.getShapePoints()[3].getyCordinates());
		

	}
	
	@Test
	void rectangleWidthInitializedTest() {
		
		
		myRectangle.getShapePoints()[0].setxCordinates(16);
		myRectangle.getShapePoints()[0].setyCordinates(8);
		
		assertEquals(16, myRectangle.getShapePoints()[0].getxCordinates());
		assertEquals(8, myRectangle.getShapePoints()[0].getyCordinates());
		
		myRectangle.getShapePoints()[1].setxCordinates(13);
		myRectangle.getShapePoints()[1].setyCordinates(24);
		
		assertEquals(13, myRectangle.getShapePoints()[1].getxCordinates());
		assertEquals(24, myRectangle.getShapePoints()[1].getyCordinates());
		
		myRectangle.setWidth(myRectangle.getShapePoints()[0], myRectangle.getShapePoints()[1]);
		
		assertEquals("16", myRectangle.width());
		
		assertEquals(myRectangle.calculateDistanceBetweenPoints(myRectangle.getShapePoints()[0],
				myRectangle.getShapePoints()[1]),  myRectangle.getWidth());
	}
	
	@Test
	void rectangleLenghtInitializedTest() {
		
		
		myRectangle.getShapePoints()[0].setxCordinates(16);
		myRectangle.getShapePoints()[0].setyCordinates(8);
		
		assertEquals(16, myRectangle.getShapePoints()[0].getxCordinates());
		assertEquals(8, myRectangle.getShapePoints()[0].getyCordinates());
		
		myRectangle.getShapePoints()[2].setxCordinates(4);
		myRectangle.getShapePoints()[2].setyCordinates(9);
		
		assertEquals(4, myRectangle.getShapePoints()[2].getxCordinates());
		assertEquals(9, myRectangle.getShapePoints()[2].getyCordinates());
		
		myRectangle.setLength(myRectangle.getShapePoints()[0], myRectangle.getShapePoints()[2]);
		
		assertEquals("12", myRectangle.lenght());
		
		assertEquals(myRectangle.calculateDistanceBetweenPoints(myRectangle.getShapePoints()[0],
				myRectangle.getShapePoints()[2]), myRectangle.getLength());
	}
	
	
	@Test
	void displayRectangleAreaTest() {
		
		
		myRectangle.getShapePoints()[0].setxCordinates(16);
		myRectangle.getShapePoints()[0].setyCordinates(8);
		
		assertEquals(16, myRectangle.getShapePoints()[0].getxCordinates());
		assertEquals(8, myRectangle.getShapePoints()[0].getyCordinates());
		
		myRectangle.getShapePoints()[1].setxCordinates(13);
		myRectangle.getShapePoints()[1].setyCordinates(24);
		
		assertEquals(13, myRectangle.getShapePoints()[1].getxCordinates());
		assertEquals(24, myRectangle.getShapePoints()[1].getyCordinates());
		
		myRectangle.getShapePoints()[2].setxCordinates(4);
		myRectangle.getShapePoints()[2].setyCordinates(9);
		
		assertEquals(4, myRectangle.getShapePoints()[2].getxCordinates());
		assertEquals(9, myRectangle.getShapePoints()[2].getyCordinates());
		
		myRectangle.getShapePoints()[3].setxCordinates(5);
		myRectangle.getShapePoints()[3].setyCordinates(12);
		
		assertEquals(5, myRectangle.getShapePoints()[3].getxCordinates());
		assertEquals(12, myRectangle.getShapePoints()[3].getyCordinates());
		
		myRectangle.setLength(myRectangle.getShapePoints()[0], myRectangle.getShapePoints()[2]);
		
		myRectangle.setWidth(myRectangle.getShapePoints()[0], myRectangle.getShapePoints()[1]);

		assertEquals(myRectangle.calculateDistanceBetweenPoints(myRectangle.getShapePoints()[0],
				myRectangle.getShapePoints()[2]), myRectangle.getLength());
		
		assertEquals(myRectangle.calculateDistanceBetweenPoints(myRectangle.getShapePoints()[0],
				myRectangle.getShapePoints()[1]),  myRectangle.getWidth());
		
		assertEquals(myRectangle.getWidth() * myRectangle.getLength(), myRectangle.calculateArea());
		
		System.out.printf("Rectangle area is: %.2f", myRectangle.calculateArea());
		
		
	}
	
	@Test
	void calculateSquareAreaTest() {
		
		
		mySquare.getShapePoints()[0].setxCordinates(22);
		mySquare.getShapePoints()[0].setyCordinates(13);
		
		mySquare.getShapePoints()[1].setxCordinates(14);
		mySquare.getShapePoints()[1].setyCordinates(10);
		
		assertEquals(22, mySquare.getShapePoints()[0].getxCordinates());
		assertEquals(13, mySquare.getShapePoints()[0].getyCordinates());
		
		assertEquals(14, mySquare.getShapePoints()[1].getxCordinates());
		assertEquals(10, mySquare.getShapePoints()[1].getyCordinates());
		
		mySquare.setLength(mySquare.getShapePoints()[0], mySquare.getShapePoints()[1]);
		
		assertNotEquals(8.0, mySquare.getLength());
		
		assertEquals(Math.pow(mySquare.getLength(),2), mySquare.calculateArea());
		
		System.out.printf("Square area is: %.2f", mySquare.calculateArea());
	}
	
	@Test
	void parrallelogramInitializedTest() {
		
		assertNotNull(myParallelogram);
		
	}
	
	
	
	
	
	
	
	
	



}
