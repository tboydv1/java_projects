/**
 * 
 */
package exercise8_4;

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
class RectangleTest {
	private static Rectangle testRectangle;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up before all...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down after all...");
		testRectangle = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setting up before each...");
		testRectangle = new Rectangle();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tearing down after each...");
	}

	@Test
	void rectangleProperlyInitializedTest() {
		assertNotNull(testRectangle);
		assertTrue(testRectangle.getLength() == 1.0);
		assertTrue(testRectangle.getWidth() == 1.0);
	}
	
	@Test
	void calculatePerimeterWithDefaultValuesTest() {
		assertEquals(testRectangle.calculatePerimeter(), 4.0);
	}
	
	@Test
	void calculatePerimeterWithNegativeValuesTest() {
		testRectangle.setLength(-1);
		testRectangle.setWidth(-5);
		assertThrows(IllegalArgumentException.class, ()->testRectangle.calculatePerimeter());
	}
	
	
	@Test
	void calculatePerimeterWithNegativeWidthTest() {
		testRectangle.setLength(11);
		testRectangle.setWidth(-5);
		assertThrows(IllegalArgumentException.class, ()->testRectangle.calculatePerimeter());
	}
	
//	void
}
