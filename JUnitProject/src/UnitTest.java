import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {
	Calculator v = new Calculator();

	@Test
	void testadd() {
		assertEquals(2, v.add(1,1));
	
		
	}
	@Test
	void testDivide() {
		assertEquals(5, v.division(10, 2));
	}

}
