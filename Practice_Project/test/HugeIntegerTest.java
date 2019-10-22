import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HugeIntegerTest {

	HugeInteger intObj;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Running");
		
		intObj = new HugeInteger();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void hugeIntegerHasAnArrayTest() {
		
		assertNotNull(intObj);
		
		assertEquals(40, intObj.getIntArray().length);
		
		
	}
	
	@Test
	void  methodParseTest() {
		
		intObj.parse("1524637");
		
		assertEquals(1, intObj.getIntArray()[0]);
		assertEquals(5, intObj.getIntArray()[1]);
		assertEquals(2, intObj.getIntArray()[2]);
		assertEquals(4, intObj.getIntArray()[3]);
		assertEquals(6, intObj.getIntArray()[4]);
		assertEquals(3, intObj.getIntArray()[3]);
		assertEquals(7, intObj.getIntArray()[7]);
		
		
		
	}
	
	@Test
	void methodParseInvalidArgumentTest() {
		
		assertThrows(IllegalArgumentException.class, ()-> intObj.parse("htndh67474"));
	}
	
	@Test
	void methodToStringTest() {
		
		
		
	}
	
	@Test
	void methodAddTest() {
		
		intObj.parse("954");
		
		HugeInteger intObj2 = new HugeInteger();
		
		intObj2.parse("236");
		
		intObj.add(intObj2);
		
		
		
//		assertEquals();
	}
	
	
}
