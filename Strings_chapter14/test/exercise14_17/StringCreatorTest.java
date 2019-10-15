package exercise14_17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCreatorTest {

	StringCreator obj;
	@BeforeEach
	void setUp() throws Exception {
		
		obj = new StringCreator();
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void readFiveLetterWordTest() {
		
		assertNotNull(obj);
		
		
		assertThrows(IllegalArgumentException.class, ()-> obj.readFiveLetterWord("Marr"));
		
		obj.readFiveLetterWord("bathe");
		
	}
	@Test
	void produceThreeLetterWordTest() {
		
		assertNotNull(obj);
		
		obj.readFiveLetterWord("bathe");
		
		obj.produceThreeLetterWords();
	}

}
