package exercise16_13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicateWordCountTest {

	DuplicateWordCount wordCounter;

	@BeforeEach
	void setUp() throws Exception {
		
		wordCounter = new DuplicateWordCount();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void countDuplicateWordsTest() {
		
		List<String> duplicates = wordCounter.countDuplicateWord("All the words and aLL the letters");
		
		
		assertEquals("all", duplicates.get(0));
		//assertEquals("test", duplicates.get(1));
		
		
		
	}

}
