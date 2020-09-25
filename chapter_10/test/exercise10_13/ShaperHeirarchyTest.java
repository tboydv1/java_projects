/**
 * 
 */
package exercise10_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tboydev
 *
 */
class ShaperHeirarchyTest {

	Shape[] myShapes;
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
		
		myShapes = new Shape[9];
		myShapes[0] = new Cone();
		myShapes[1] = new Cube();
		myShapes[2] = new Kite();
		myShapes[3] = new Parallelogram();
		myShapes[4] = new Rectangle();
		myShapes[5] = new Rhombus();
		myShapes[6] = new Shpere();
		myShapes[7] = new Circle();
		myShapes[8] = new Cylinder();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shapesInitializedTest() {
		
		for(int i = 0; i < myShapes.length; i++)
		assertNotNull(myShapes[i]);
		
	}
	
	@Test
	void TwoDimensionalShapeHasMethodGetAreaTest() {
		
		for(Shape TwoD: myShapes) {
			
			if(TwoD instanceof TwoDimensionalShape) {
				assertNotNull(((TwoDimensionalShape) TwoD).getArea());
				System.out.println(TwoD);
			}
				
		}
		
	}
	
	
	@Test
	void ThreeDimensionalShapeHasMethodGetAreaGetVolumeTest() {
		
		for(Shape ThreeD: myShapes) {
			
			if(ThreeD instanceof ThreeDimensionalShape) {
				assertNotNull(((ThreeDimensionalShape) ThreeD).getArea());
				assertNotNull(((ThreeDimensionalShape) ThreeD).getVolume());
				System.out.println(ThreeD);
			}
				
		}
		
	}
	
	
	@Test
	void circleObjectGetAreaMethodTest() {
		
		for(Shape allShape: myShapes) {
			
			if(allShape instanceof Circle) {
				
				assertNotEquals(0, ((Circle) allShape).getRadius());
				
				System.out.println(allShape + "Area is:" +((Circle) allShape).getArea());
				
			}
		}
	}
	 
	
	@Test
	void printShapeObjectsAreaTest() {
		
		for(Shape allShape: myShapes) {
			
			if(allShape instanceof TwoDimensionalShape) {
				
				System.out.println(allShape + "Area is:" +((TwoDimensionalShape) allShape).getArea() + "\n");
			}
			else if(allShape instanceof ThreeDimensionalShape) {
				
				System.out.printf("%sArea is %.2f\nVolume is: %.2f\n\n", allShape, ((ThreeDimensionalShape) allShape).getArea(),
				((ThreeDimensionalShape) allShape).getVolume());
			}
		}
		
	}
	
	
	
	

}
